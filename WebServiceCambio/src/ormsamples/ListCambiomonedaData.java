/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListCambiomonedaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Tipo_consulta...");
		orm.Tipo_consulta[] ormTipo_consultas = orm.Tipo_consultaDAO.listTipo_consultaByQuery(null, null);
		int length = Math.min(ormTipo_consultas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipo_consultas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		orm.Usuario[] ormUsuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(ormUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consultas...");
		orm.Consultas[] ormConsultases = orm.ConsultasDAO.listConsultasByQuery(null, null);
		length = Math.min(ormConsultases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormConsultases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Tipo_consulta by Criteria...");
		orm.Tipo_consultaCriteria lormTipo_consultaCriteria = new orm.Tipo_consultaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTipo_consultaCriteria.id.eq();
		lormTipo_consultaCriteria.setMaxResults(ROW_COUNT);
		orm.Tipo_consulta[] ormTipo_consultas = lormTipo_consultaCriteria.listTipo_consulta();
		int length =ormTipo_consultas== null ? 0 : Math.min(ormTipo_consultas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTipo_consultas[i]);
		}
		System.out.println(length + " Tipo_consulta record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormUsuarioCriteria.id.eq();
		lormUsuarioCriteria.setMaxResults(ROW_COUNT);
		orm.Usuario[] ormUsuarios = lormUsuarioCriteria.listUsuario();
		length =ormUsuarios== null ? 0 : Math.min(ormUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Consultas by Criteria...");
		orm.ConsultasCriteria lormConsultasCriteria = new orm.ConsultasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormConsultasCriteria.id.eq();
		lormConsultasCriteria.setMaxResults(ROW_COUNT);
		orm.Consultas[] ormConsultases = lormConsultasCriteria.listConsultas();
		length =ormConsultases== null ? 0 : Math.min(ormConsultases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormConsultases[i]);
		}
		System.out.println(length + " Consultas record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListCambiomonedaData listCambiomonedaData = new ListCambiomonedaData();
			try {
				listCambiomonedaData.listTestData();
				//listCambiomonedaData.listByCriteria();
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
