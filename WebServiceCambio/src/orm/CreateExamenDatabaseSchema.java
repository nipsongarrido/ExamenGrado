package orm;
/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateExamenDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm.ExamenPersistentManager.instance());
			orm.ExamenPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
