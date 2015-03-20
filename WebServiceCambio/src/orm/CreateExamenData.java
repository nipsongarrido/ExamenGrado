package orm;
/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateExamenData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ExamenPersistentManager.instance().getSession().beginTransaction();
		try {
			Tipo_consulta tipo_consulta = Tipo_consultaDAO.createTipo_consulta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consultas, descripcion
			Tipo_consultaDAO.save(tipo_consulta);
			Usuario usuario = UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, consultas, contrasena, nombre_usuario
			UsuarioDAO.save(usuario);
			Consultas consultas = ConsultasDAO.createConsultas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, tipo_consulta, fecha_cambio, cantidad_cambiada, cantidad_consultada
			ConsultasDAO.save(consultas);
			orm.Login lormLogin = orm.LoginDAO.createLogin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, fecha__fin, fecha_inicio, token
			orm.LoginDAO.save(lormLogin);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateExamenData createExamenData = new CreateExamenData();
			try {
				createExamenData.createTestData();
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
