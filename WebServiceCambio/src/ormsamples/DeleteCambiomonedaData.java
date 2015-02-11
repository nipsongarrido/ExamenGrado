/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteCambiomonedaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.CambiomonedaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Tipo_consulta lormTipo_consulta = orm.Tipo_consultaDAO.loadTipo_consultaByQuery(null, null);
			// Delete the persistent object
			orm.Tipo_consultaDAO.delete(lormTipo_consulta);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(lormUsuario);
			orm.Consultas lormConsultas = orm.ConsultasDAO.loadConsultasByQuery(null, null);
			// Delete the persistent object
			orm.ConsultasDAO.delete(lormConsultas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteCambiomonedaData deleteCambiomonedaData = new DeleteCambiomonedaData();
			try {
				deleteCambiomonedaData.deleteTestData();
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
