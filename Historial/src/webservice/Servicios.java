package webservice;

import java.io.IOException;
import java.net.Proxy;
import java.util.Vector;

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
	private static final String SOAP_ACTION = "http://webservice/obtenerTodasConsultas";
	private static final String NAMESPACE = "http://webservice";

	public domain.ConsultaVO[] obtenerConsultas() {
		domain.ConsultaVO[] data = null;
        
		String methodname = "obtenerTodasConsultas";
		SoapObject request = new SoapObject(NAMESPACE, methodname);

		SoapSerializationEnvelope envelope = getSoapSerializationEnvelope(request);
		HttpTransportSE androidHttpTransport = getHttpTransportSE();
		try {
			androidHttpTransport.call(SOAP_ACTION, envelope);
		} catch (HttpResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Vector<SoapObject> response = (Vector<SoapObject>) envelope.getResponse();
			// el orden es alfabetico para la obtencion
			data = new ConsultaVO[response.size()];
			for (int i = 0; i < response.size(); i++) {
				float cantidadCambiada = Float.parseFloat(response.elementAt(i).getProperty(0).toString());
				float cantidadConsultada = Float.parseFloat(response.elementAt(i).getProperty(1).toString());
				data[i] = new ConsultaVO();
				data[i].setCantidadCambiada(cantidadCambiada);
				data[i].setCantidadConsultada(cantidadConsultada);
				data[i].setFechaCambio(response.elementAt(i).getProperty(2).toString());
				
				SoapObject tipo = (SoapObject) response.elementAt(i).getProperty(3);
				data[i].setTipoConsulta(new TipoConsultaVO(tipo.getProperty(0).toString()));
				Log.i("NIPSON", "cant datos ==" + response.toString());
				SoapObject usr = (SoapObject) response.elementAt(i).getProperty(4);
				Log.i("NIPSON", "cant datos ==" + usr.toString());
				data[i].setUsuario(new UsuarioVO(usr.getProperty(1).toString(), usr.getProperty(0).toString()));
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
//		envelope.addMapping(NAMESPACE, "UsuarioVO", new UsuarioVO().getClass());
		envelope.setOutputSoapObject(request);

		return envelope;
	}

	private final HttpTransportSE getHttpTransportSE() {
		HttpTransportSE ht = new HttpTransportSE(Proxy.NO_PROXY, URL, 60000);
		ht.debug = true;
		Log.i("NIPSON", "http");
		ht.setXmlVersionTag("<!--?xml version=\"1.0\" encoding= \"UTF-8\" ?-->");
		return ht;
	}
}