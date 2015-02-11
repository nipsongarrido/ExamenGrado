/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateCambiomonedaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.CambiomonedaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Tipo_consulta lormTipo_consulta = orm.Tipo_consultaDAO.loadTipo_consultaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Tipo_consultaDAO.save(lormTipo_consulta);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(lormUsuario);
			orm.Consultas lormConsultas = orm.ConsultasDAO.loadConsultasByQuery(null, null);
			// Update the properties of the persistent object
			orm.ConsultasDAO.save(lormConsultas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Tipo_consulta by Tipo_consultaCriteria");
		orm.Tipo_consultaCriteria lormTipo_consultaCriteria = new orm.Tipo_consultaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTipo_consultaCriteria.id.eq();
		System.out.println(lormTipo_consultaCriteria.uniqueTipo_consulta());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormUsuarioCriteria.id.eq();
		System.out.println(lormUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Consultas by ConsultasCriteria");
		orm.ConsultasCriteria lormConsultasCriteria = new orm.ConsultasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormConsultasCriteria.id.eq();
		System.out.println(lormConsultasCriteria.uniqueConsultas());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateCambiomonedaData retrieveAndUpdateCambiomonedaData = new RetrieveAndUpdateCambiomonedaData();
			try {
				retrieveAndUpdateCambiomonedaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateCambiomonedaData.retrieveByCriteria();
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
