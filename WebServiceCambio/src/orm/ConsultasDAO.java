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

public class ConsultasDAO {
	public static Consultas loadConsultasByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadConsultasByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas getConsultasByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return getConsultasByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadConsultasByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas getConsultasByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return getConsultasByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Consultas) session.load(Consultas.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas getConsultasByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Consultas) session.get(Consultas.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Consultas) session.load(Consultas.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas getConsultasByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Consultas) session.get(Consultas.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsultas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return queryConsultas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsultas(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return queryConsultas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas[] listConsultasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return listConsultasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas[] listConsultasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return listConsultasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsultas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Consultas as Consultas");
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
	
	public static List queryConsultas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Consultas as Consultas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Consultas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas[] listConsultasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConsultas(session, condition, orderBy);
			return (Consultas[]) list.toArray(new Consultas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas[] listConsultasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConsultas(session, condition, orderBy, lockMode);
			return (Consultas[]) list.toArray(new Consultas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadConsultasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return loadConsultasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Consultas[] consultases = listConsultasByQuery(session, condition, orderBy);
		if (consultases != null && consultases.length > 0)
			return consultases[0];
		else
			return null;
	}
	
	public static Consultas loadConsultasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Consultas[] consultases = listConsultasByQuery(session, condition, orderBy, lockMode);
		if (consultases != null && consultases.length > 0)
			return consultases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConsultasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return iterateConsultasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsultasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ExamenPersistentManager.instance().getSession();
			return iterateConsultasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsultasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Consultas as Consultas");
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
	
	public static java.util.Iterator iterateConsultasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Consultas as Consultas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Consultas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas createConsultas() {
		return new Consultas();
	}
	
	public static boolean save(Consultas consultas) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().saveObject(consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Consultas consultas) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().deleteObject(consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Consultas consultas)throws PersistentException {
		try {
			if(consultas.getTipo_consulta() != null) {
				consultas.getTipo_consulta().consultas.remove(consultas);
			}
			
			if(consultas.getUsuario() != null) {
				consultas.getUsuario().consultas.remove(consultas);
			}
			
			return delete(consultas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Consultas consultas, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(consultas.getTipo_consulta() != null) {
				consultas.getTipo_consulta().consultas.remove(consultas);
			}
			
			if(consultas.getUsuario() != null) {
				consultas.getUsuario().consultas.remove(consultas);
			}
			
			try {
				session.delete(consultas);
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
	
	public static boolean refresh(Consultas consultas) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().getSession().refresh(consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Consultas consultas) throws PersistentException {
		try {
			orm.ExamenPersistentManager.instance().getSession().evict(consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consultas loadConsultasByCriteria(ConsultasCriteria consultasCriteria) {
		Consultas[] consultases = listConsultasByCriteria(consultasCriteria);
		if(consultases == null || consultases.length == 0) {
			return null;
		}
		return consultases[0];
	}
	
	public static Consultas[] listConsultasByCriteria(ConsultasCriteria consultasCriteria) {
		return consultasCriteria.listConsultas();
	}
}
