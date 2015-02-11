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

public class ConsultasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final FloatExpression cantidad_consultada;
	public final FloatExpression cantidad_cambiada;
	public final StringExpression fecha_cambio;
	
	public ConsultasCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		cantidad_consultada = new FloatExpression("cantidad_consultada", this);
		cantidad_cambiada = new FloatExpression("cantidad_cambiada", this);
		fecha_cambio = new StringExpression("fecha_cambio", this);
	}
	
	public ConsultasCriteria(PersistentSession session) {
		this(session.createCriteria(Consultas.class));
	}
	
	public ConsultasCriteria() throws PersistentException {
		this(orm.CambiomonedaPersistentManager.instance().getSession());
	}
	
	public Tipo_consultaCriteria createTipo_consultaCriteria() {
		return new Tipo_consultaCriteria(createCriteria("tipo_consulta"));
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public Consultas uniqueConsultas() {
		return (Consultas) super.uniqueResult();
	}
	
	public Consultas[] listConsultas() {
		java.util.List list = super.list();
		return (Consultas[]) list.toArray(new Consultas[list.size()]);
	}
}

