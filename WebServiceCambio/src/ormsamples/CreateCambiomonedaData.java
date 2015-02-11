/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateCambiomonedaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.CambiomonedaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Tipo_consulta lormTipo_consulta = orm.Tipo_consultaDAO.createTipo_consulta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consultas, descripcion
			orm.Tipo_consultaDAO.save(lormTipo_consulta);
			orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consultas, contrasena, nombre_usuario
			orm.UsuarioDAO.save(lormUsuario);
			orm.Consultas lormConsultas = orm.ConsultasDAO.createConsultas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, tipo_consulta, fecha_cambio, cantidad_cambiada, cantidad_consultada
			orm.ConsultasDAO.save(lormConsultas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCambiomonedaData createCambiomonedaData = new CreateCambiomonedaData();
			try {
				createCambiomonedaData.createTestData();
			}
			finally {
				orm.CambiomonedaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
