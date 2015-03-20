package orm;
/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteExamenData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ExamenPersistentManager.instance().getSession().beginTransaction();
		try {
			Tipo_consulta tipo_consulta = Tipo_consultaDAO.loadTipo_consultaByQuery(null, null);
			// Delete the persistent object
			Tipo_consultaDAO.delete(tipo_consulta);
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			UsuarioDAO.delete(usuario);
			Consultas consultas = ConsultasDAO.loadConsultasByQuery(null, null);
			// Delete the persistent object
			ConsultasDAO.delete(consultas);
			orm.Login lormLogin = orm.LoginDAO.loadLoginByQuery(null, null);
			// Delete the persistent object
			orm.LoginDAO.delete(lormLogin);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteExamenData deleteExamenData = new DeleteExamenData();
			try {
				deleteExamenData.deleteTestData();
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
