package orm;
/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListExamenData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Tipo_consulta...");
		Tipo_consulta[] tipo_consultas = Tipo_consultaDAO.listTipo_consultaByQuery(null, null);
		int length = Math.min(tipo_consultas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tipo_consultas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		Usuario[] usuarios = UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(usuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(usuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consultas...");
		Consultas[] consultases = ConsultasDAO.listConsultasByQuery(null, null);
		length = Math.min(consultases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(consultases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Login...");
		orm.Login[] ormLogins = orm.LoginDAO.listLoginByQuery(null, null);
		length = Math.min(ormLogins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormLogins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Tipo_consulta by Criteria...");
		Tipo_consultaCriteria tipo_consultaCriteria = new Tipo_consultaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tipo_consultaCriteria.id.eq();
		tipo_consultaCriteria.setMaxResults(ROW_COUNT);
		Tipo_consulta[] tipo_consultas = tipo_consultaCriteria.listTipo_consulta();
		int length =tipo_consultas== null ? 0 : Math.min(tipo_consultas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tipo_consultas[i]);
		}
		System.out.println(length + " Tipo_consulta record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//usuarioCriteria.id.eq();
		usuarioCriteria.setMaxResults(ROW_COUNT);
		Usuario[] usuarios = usuarioCriteria.listUsuario();
		length =usuarios== null ? 0 : Math.min(usuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(usuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Consultas by Criteria...");
		ConsultasCriteria consultasCriteria = new ConsultasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//consultasCriteria.id.eq();
		consultasCriteria.setMaxResults(ROW_COUNT);
		Consultas[] consultases = consultasCriteria.listConsultas();
		length =consultases== null ? 0 : Math.min(consultases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(consultases[i]);
		}
		System.out.println(length + " Consultas record(s) retrieved."); 
		
		System.out.println("Listing Login by Criteria...");
		orm.LoginCriteria lormLoginCriteria = new orm.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormLoginCriteria.id.eq();
		lormLoginCriteria.setMaxResults(ROW_COUNT);
		orm.Login[] ormLogins = lormLoginCriteria.listLogin();
		length =ormLogins== null ? 0 : Math.min(ormLogins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormLogins[i]);
		}
		System.out.println(length + " Login record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListExamenData listExamenData = new ListExamenData();
			try {
				listExamenData.listTestData();
				//listExamenData.listByCriteria();
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
