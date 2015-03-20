package webservice;

import java.io.IOException;
import java.net.Proxy;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.transport.HttpsTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Log;

import domain.ConsultaVO;
import domain.LoginVO;
import domain.TipoConsultaVO;
import domain.UsuarioVO;

public class Servicios {
	private static final String URL = "http://192.168.0.4:8888/WebServiceCambio/services/ServicioCambio?wsdl";
	private static final String SOAP_ACTION = "http://webservice/guardarConsulta";
	private static final String NAMESPACE = "http://webservice";

	public String guardarConsulta(float cantidadConsultada, float cantidadCambiada, String tipo) {
		String data = null;
		String methodname = "guardarConsulta";
		SoapObject request = new SoapObject(NAMESPACE, methodname);
		UsuarioVO usuario = new UsuarioVO("nipson", "");
		Log.i("NIPSON", ""+usuario);
		TipoConsultaVO tipoConsulta = new TipoConsultaVO(tipo);
		ConsultaVO consulta = new ConsultaVO(cantidadConsultada, cantidadCambiada, "", usuario, tipoConsulta);

		PropertyInfo pi = new PropertyInfo();
		pi.setName("consulta");
		pi.setValue(consulta);
		pi.setType(consulta.getClass());

		request.addProperty(pi);

		SoapSerializationEnvelope envelope = getSoapSerializationEnvelope(request);
		HttpTransportSE androidHttpTransport = getHttpTransportSE();
		try {
			androidHttpTransport.call(SOAP_ACTION, envelope);
		} catch (HttpResponseException e) {
			// TODO Auto-generated catch block
			Log.i("NIPSON", "HttpResponseException");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Log.i("NIPSON", "IOException");
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			Log.i("NIPSON", "XmlPullParserException");
			e.printStackTrace();
		}

		try {
			SoapObject response = (SoapObject) envelope.getResponse();
			LoginVO login = new LoginVO();
			// el orden es alfabetico para la obtencion
			Log.i("NIPSON", "cant datos ==" + response.toString());
			if (response.getProperty(2) == null) {
				data = "usuario o contrasena incorrectos";
			}
			login.setToken(response.getProperty(2).toString());
			login.setFechaInicio(response.getProperty(1).toString());
			login.setFechaFin(response.getProperty(0).toString());
			SoapObject resp = (SoapObject) response.getProperty(3);
			login.setUsuario(new UsuarioVO(resp.getAttributeAsString(0)
					.toString(), resp.getAttributeAsString(0).toString()));
			if (login.getToken() == "") {
				data = "usuario o contrasena incorrectos";
			} else {
				data = login.getToken();
			}

		} catch (SoapFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

	private final SoapSerializationEnvelope getSoapSerializationEnvelope(
			SoapObject request) {
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		envelope.implicitTypes = true;
		envelope.setAddAdornments(false);
		envelope.addMapping(NAMESPACE, "ConsultaVO", new ConsultaVO().getClass());
		envelope.setOutputSoapObject(request);

		return envelope;
	}

	private final HttpTransportSE getHttpTransportSE() {
		HttpTransportSE ht = new HttpTransportSE(Proxy.NO_PROXY, URL, 60000);
		ht.debug = true;
		ht.setXmlVersionTag("<!--?xml version=\"1.0\" encoding= \"UTF-8\" ?-->");
		return ht;
	}
}