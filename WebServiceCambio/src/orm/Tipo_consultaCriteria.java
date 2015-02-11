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
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Tipo_consultaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression descripcion;
	
	public Tipo_consultaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		descripcion = new StringExpression("descripcion", this);
	}
	
	public Tipo_consultaCriteria(PersistentSession session) {
		this(session.createCriteria(Tipo_consulta.class));
	}
	
	public Tipo_consultaCriteria() throws PersistentException {
		this(orm.CambiomonedaPersistentManager.instance().getSession());
	}
	
	public ConsultasCriteria createConsultasCriteria() {
		return new ConsultasCriteria(createCriteria("ORM_consultas"));
	}
	
	public Tipo_consulta uniqueTipo_consulta() {
		return (Tipo_consulta) super.uniqueResult();
	}
	
	public Tipo_consulta[] listTipo_consulta() {
		java.util.List list = super.list();
		return (Tipo_consulta[]) list.toArray(new Tipo_consulta[list.size()]);
	}
}

