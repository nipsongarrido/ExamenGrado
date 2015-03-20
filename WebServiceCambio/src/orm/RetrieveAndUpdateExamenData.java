package orm;
/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateExamenData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ExamenPersistentManager.instance().getSession().beginTransaction();
		try {
			Tipo_consulta tipo_consulta = Tipo_consultaDAO.loadTipo_consultaByQuery(null, null);
			// Update the properties of the persistent object
			Tipo_consultaDAO.save(tipo_consulta);
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			UsuarioDAO.save(usuario);
			Consultas consultas = ConsultasDAO.loadConsultasByQuery(null, null);
			// Update the properties of the persistent object
			ConsultasDAO.save(consultas);
			orm.Login lormLogin = orm.LoginDAO.loadLoginByQuery(null, null);
			// Update the properties of the persistent object
			orm.LoginDAO.save(lormLogin);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Tipo_consulta by Tipo_consultaCriteria");
		Tipo_consultaCriteria tipo_consultaCriteria = new Tipo_consultaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tipo_consultaCriteria.id.eq();
		System.out.println(tipo_consultaCriteria.uniqueTipo_consulta());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//usuarioCriteria.id.eq();
		System.out.println(usuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Consultas by ConsultasCriteria");
		ConsultasCriteria consultasCriteria = new ConsultasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//consultasCriteria.id.eq();
		System.out.println(consultasCriteria.uniqueConsultas());
		
		System.out.println("Retrieving Login by LoginCriteria");
		orm.LoginCriteria lormLoginCriteria = new orm.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormLoginCriteria.id.eq();
		System.out.println(lormLoginCriteria.uniqueLogin());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateExamenData retrieveAndUpdateExamenData = new RetrieveAndUpdateExamenData();
			try {
				retrieveAndUpdateExamenData.retrieveAndUpdateTestData();
				//retrieveAndUpdateExamenData.retrieveByCriteria();
			}
			finally {
				orm.ExamenPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
