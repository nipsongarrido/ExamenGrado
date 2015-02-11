package webservice;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.orm.PersistentTransaction;

public class ServicioCambio {

	public String guardarConsulta(domain.ConsultaVO consulta) {
		try {
			PersistentTransaction t = orm.CambiomonedaPersistentManager
					.instance().getSession().beginTransaction();

			orm.Usuario usuario = orm.UsuarioDAO.loadUsuarioByQuery(
					"nombre_usuario = '" + consulta.getUsuario().getUsuario()
							+ "'", null, null);

			orm.Tipo_consulta tipo = orm.Tipo_consultaDAO
					.loadTipo_consultaByQuery(
							"descripcion = '"
									+ consulta.getTipoConsulta()
											.getDescripcion() + "'", null, null);

			Calendar cal = new GregorianCalendar();
			String fecha = "" + cal.get(Calendar.YEAR) + "/"
					+ (cal.get(Calendar.MONTH)+1) + "/"
					+ cal.get(Calendar.DAY_OF_MONTH);
			fecha += " " + cal.get(Calendar.HOUR_OF_DAY) + ":"
					+ cal.get(Calendar.MINUTE) + ":"
					+ cal.get(Calendar.SECOND);

			orm.Consultas lormConsultas = orm.ConsultasDAO.createConsultas();
			lormConsultas.setCantidad_consultada(consulta.getCantidadConsultada());
			lormConsultas.setCantidad_cambiada(consulta.getCantidadCambiada());
			lormConsultas.setFecha_cambio(fecha);
			lormConsultas.setTipo_consulta(tipo);
			lormConsultas.setUsuario(usuario);
			orm.ConsultasDAO.save(lormConsultas);
			t.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "";
	}
}
