package webservice;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.codec.binary.Hex;
import org.orm.PersistentTransaction;

import domain.LoginVO;
import domain.TipoConsultaVO;
import domain.UsuarioVO;

public class ServicioCambio {

	public String agregarUsuario(domain.UsuarioVO usuario) {
		try {
			PersistentTransaction t = orm.ExamenPersistentManager.instance()
					.getSession().beginTransaction();
			try {
				orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
				lormUsuario.setNombre_usuario(usuario.getUsuario());
				lormUsuario.setContrasena(usuario.getContrasena());
				orm.UsuarioDAO.save(lormUsuario);
				t.commit();
			} catch (Exception e) {
				t.rollback();
				return e.getMessage();
			}
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}

		return "Usuario Creado";
	}

	public domain.LoginVO login(domain.UsuarioVO usuario) {
		domain.LoginVO login = new LoginVO();
		try {
			orm.Usuario ormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(
					"nombre_usuario = '" + usuario.getUsuario()
							+ "' and contrasena = '" + usuario.getContrasena()
							+ "'", null, null);
			System.out.println("antes ---->");
			if (ormUsuario == null) {
				return login;
			}
			System.out
					.println("despues ---->" + ormUsuario.getNombre_usuario());
			PersistentTransaction t = orm.ExamenPersistentManager.instance()
					.getSession().beginTransaction();
			try {
				Calendar cal = new GregorianCalendar();
				String fecha = "" + cal.get(Calendar.YEAR) + "/"
						+ (cal.get(Calendar.MONTH) + 1) + "/"
						+ cal.get(Calendar.DAY_OF_MONTH);
				fecha += " " + cal.get(Calendar.HOUR_OF_DAY) + ":"
						+ cal.get(Calendar.MINUTE) + ":"
						+ cal.get(Calendar.SECOND);
				cal.add(Calendar.MINUTE, 30);
				String fecha_fin = "" + cal.get(Calendar.YEAR) + "/"
						+ (cal.get(Calendar.MONTH) + 1) + "/"
						+ cal.get(Calendar.DAY_OF_MONTH);
				fecha_fin += " " + cal.get(Calendar.HOUR_OF_DAY) + ":"
						+ cal.get(Calendar.MINUTE) + ":"
						+ cal.get(Calendar.SECOND);
				orm.Login lormLogin = orm.LoginDAO.createLogin();

				MessageDigest md = MessageDigest.getInstance("MD5");
				byte[] messageDigest = md.digest((ormUsuario
						.getNombre_usuario() + fecha).getBytes());
				BigInteger number = new BigInteger(1, messageDigest);
				String hashtext = number.toString(16);
				// Now we need to zero pad it if you actually want the full 32
				// chars.
				while (hashtext.length() < 32) {
					hashtext = "0" + hashtext;
				}
				System.out.println(">>>>>>>>>>" + hashtext);

				lormLogin.setToken(hashtext);
				lormLogin.setFecha_inicio(fecha);
				lormLogin.setFecha__fin(fecha_fin);
				lormLogin.setORM_Usuario(ormUsuario);
				orm.LoginDAO.save(lormLogin);
				t.commit();
				login.setToken(lormLogin.getToken());
				login.setFechaFin(lormLogin.getFecha__fin());
				login.setFechaInicio(lormLogin.getFecha_inicio());
				login.setUsuario(usuario);
			} catch (Exception e) {
				t.rollback();
				return login;
			}
		} catch (Exception e) {
			return login;
		}
		return login;
	}

	public String logout(domain.UsuarioVO usuario, domain.LoginVO token) {
		domain.LoginVO login = new LoginVO();
		try {
			orm.Usuario ormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(
					"nombre_usuario = '" + usuario.getUsuario()
							+ "' and contrasena = '" + usuario.getContrasena()
							+ "'", null, null);
			if (ormUsuario == null) {
				return "Usuario no existe";
			}
			PersistentTransaction t = orm.ExamenPersistentManager.instance()
					.getSession().beginTransaction();
			try {
				orm.Login lormLogin = orm.LoginDAO.loadLoginByQuery(
						"usuarioid = '" + ormUsuario.getId()
								+ "' and token = '" + token.getToken() + "'",
						null);
				lormLogin.setFecha__fin("hoy");
				orm.LoginDAO.save(lormLogin);
				t.commit();
				login.setToken(lormLogin.getToken());
				login.setFechaFin(lormLogin.getFecha__fin());
				login.setFechaInicio(lormLogin.getFecha_inicio());
				login.setUsuario(usuario);
			} catch (Exception e) {
				t.rollback();
				return e.getMessage();
			}
		} catch (Exception e) {
			return e.getMessage();
		}
		return "usuario deslogueado";
	}

	public boolean enSesion(domain.LoginVO login) {
		// TODO: comparar las fechas de fin
		return true;
	}

	public String guardarConsulta(domain.ConsultaVO consulta) {
		try {
			PersistentTransaction t = orm.ExamenPersistentManager.instance()
					.getSession().beginTransaction();

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
					+ (cal.get(Calendar.MONTH) + 1) + "/"
					+ cal.get(Calendar.DAY_OF_MONTH);
			fecha += " " + cal.get(Calendar.HOUR_OF_DAY) + ":"
					+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);

			orm.Consultas lormConsultas = orm.ConsultasDAO.createConsultas();
			lormConsultas.setCantidad_consultada(consulta
					.getCantidadConsultada());
			lormConsultas.setCantidad_cambiada(consulta.getCantidadCambiada());
			lormConsultas.setFecha_cambio(fecha);
			lormConsultas.setTipo_consulta(tipo);
			lormConsultas.setUsuario(usuario);
			orm.ConsultasDAO.save(lormConsultas);
			t.commit();
		} catch (Exception e) {
			return e.getMessage();
		}

		return "";
	}

	public domain.ConsultaVO[] obtenerConsultas(domain.UsuarioVO usuario) {
		domain.ConsultaVO[] consultas = null;
		try {
			orm.Usuario ormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(
					"nombre_usuario = '" + usuario.getUsuario()
							+ "' and contrasena = '" + usuario.getContrasena()
							+ "'", null, null);
			if (ormUsuario == null) {
				return consultas;
			}

			orm.Consultas[] ormConsultas = orm.ConsultasDAO
					.listConsultasByQuery("usuarioid = '" + ormUsuario.getId()
							+ "'", null);
			consultas = new domain.ConsultaVO[ormConsultas.length];
			for (int i = 0; i < consultas.length; i++) {
				consultas[i] = new domain.ConsultaVO();
				consultas[i].setUsuario(usuario);
				consultas[i].setCantidadCambiada(ormConsultas[i]
						.getCantidad_cambiada());
				consultas[i].setCantidadConsultada(ormConsultas[i]
						.getCantidad_consultada());
				consultas[i].setFechaCambio(ormConsultas[i].getFecha_cambio());
				consultas[i].setTipoConsulta(new TipoConsultaVO(ormConsultas[i]
						.getTipo_consulta().getDescripcion()));
			}
		} catch (Exception e) {
			return consultas;
		}
		return consultas;
	}

	public domain.ConsultaVO[] obtenerTodasConsultas() {
		domain.ConsultaVO[] consultas = null;
		System.out.println("LLEGUE AQUI");
		try {

			orm.Consultas[] ormConsultas = orm.ConsultasDAO
					.listConsultasByQuery(null, null);
			consultas = new domain.ConsultaVO[ormConsultas.length];
			for (int i = 0; i < consultas.length; i++) {
				consultas[i] = new domain.ConsultaVO();
				consultas[i].setCantidadCambiada(ormConsultas[i]
						.getCantidad_cambiada());
				consultas[i].setCantidadConsultada(ormConsultas[i]
						.getCantidad_consultada());
				consultas[i].setFechaCambio(ormConsultas[i].getFecha_cambio());
				consultas[i].setTipoConsulta(new TipoConsultaVO(ormConsultas[i]
						.getTipo_consulta().getDescripcion()));
				consultas[i].setUsuario(new UsuarioVO(ormConsultas[i]
						.getUsuario().getNombre_usuario(), ormConsultas[i]
						.getUsuario().getContrasena()));
			}
			System.out.println(consultas);
		} catch (Exception e) {
			return consultas;
		}
		return consultas;
	}
}
