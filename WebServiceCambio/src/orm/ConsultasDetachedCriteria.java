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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ConsultasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final FloatExpression cantidad_consultada;
	public final FloatExpression cantidad_cambiada;
	public final StringExpression fecha_cambio;
	
	public ConsultasDetachedCriteria() {
		super(orm.Consultas.class, orm.ConsultasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cantidad_consultada = new FloatExpression("cantidad_consultada", this.getDetachedCriteria());
		cantidad_cambiada = new FloatExpression("cantidad_cambiada", this.getDetachedCriteria());
		fecha_cambio = new StringExpression("fecha_cambio", this.getDetachedCriteria());
	}
	
	public ConsultasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ConsultasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cantidad_consultada = new FloatExpression("cantidad_consultada", this.getDetachedCriteria());
		cantidad_cambiada = new FloatExpression("cantidad_cambiada", this.getDetachedCriteria());
		fecha_cambio = new StringExpression("fecha_cambio", this.getDetachedCriteria());
	}
	
	public Tipo_consultaDetachedCriteria createTipo_consultaCriteria() {
		return new Tipo_consultaDetachedCriteria(createCriteria("tipo_consulta"));
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public Consultas uniqueConsultas(PersistentSession session) {
		return (Consultas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Consultas[] listConsultas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Consultas[]) list.toArray(new Consultas[list.size()]);
	}
}

