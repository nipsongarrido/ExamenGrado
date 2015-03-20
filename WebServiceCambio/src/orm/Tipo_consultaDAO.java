package orm;
/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Tipo_consultaDAO {
	public static Tipo_consulta loadTipo_consultaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadTipo_consultaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta getTipo_consultaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return getTipo_consultaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadTipo_consultaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta getTipo_consultaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return getTipo_consultaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Tipo_consulta) session.load(Tipo_consulta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta getTipo_consultaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Tipo_consulta) session.get(Tipo_consulta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo_consulta) session.load(Tipo_consulta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta getTipo_consultaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo_consulta) session.get(Tipo_consulta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_consulta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return queryTipo_consulta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_consulta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return queryTipo_consulta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta[] listTipo_consultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return listTipo_consultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta[] listTipo_consultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return listTipo_consultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_consulta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipo_consulta as Tipo_consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_consulta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipo_consulta as Tipo_consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo_consulta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta[] listTipo_consultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipo_consulta(session, condition, orderBy);
			return (Tipo_consulta[]) list.toArray(new Tipo_consulta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta[] listTipo_consultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipo_consulta(session, condition, orderBy, lockMode);
			return (Tipo_consulta[]) list.toArray(new Tipo_consulta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadTipo_consultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadTipo_consultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipo_consulta[] tipo_consultas = listTipo_consultaByQuery(session, condition, orderBy);
		if (tipo_consultas != null && tipo_consultas.length > 0)
			return tipo_consultas[0];
		else
			return null;
	}
	
	public static Tipo_consulta loadTipo_consultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tipo_consulta[] tipo_consultas = listTipo_consultaByQuery(session, condition, orderBy, lockMode);
		if (tipo_consultas != null && tipo_consultas.length > 0)
			return tipo_consultas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipo_consultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return iterateTipo_consultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_consultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return iterateTipo_consultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_consultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipo_consulta as Tipo_consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_consultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipo_consulta as Tipo_consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo_consulta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta createTipo_consulta() {
		return new Tipo_consulta();
	}
	
	public static boolean save(Tipo_consulta tipo_consulta) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().saveObject(tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Tipo_consulta tipo_consulta) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().deleteObject(tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Tipo_consulta tipo_consulta)throws PersistentException {
		try {
			Consultas[] lConsultass = tipo_consulta.consultas.toArray();
			for(int i = 0; i < lConsultass.length; i++) {
				lConsultass[i].setTipo_consulta(null);
			}
			return delete(tipo_consulta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Tipo_consulta tipo_consulta, org.orm.PersistentSession session)throws PersistentException {
		try {
			Consultas[] lConsultass = tipo_consulta.consultas.toArray();
			for(int i = 0; i < lConsultass.length; i++) {
				lConsultass[i].setTipo_consulta(null);
			}
			try {
				session.delete(tipo_consulta);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Tipo_consulta tipo_consulta) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().getSession().refresh(tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Tipo_consulta tipo_consulta) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().getSession().evict(tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_consulta loadTipo_consultaByCriteria(Tipo_consultaCriteria tipo_consultaCriteria) {
		Tipo_consulta[] tipo_consultas = listTipo_consultaByCriteria(tipo_consultaCriteria);
		if(tipo_consultas == null || tipo_consultas.length == 0) {
			return null;
		}
		return tipo_consultas[0];
	}
	
	public static Tipo_consulta[] listTipo_consultaByCriteria(Tipo_consultaCriteria tipo_consultaCriteria) {
		return tipo_consultaCriteria.listTipo_consulta();
	}
}
