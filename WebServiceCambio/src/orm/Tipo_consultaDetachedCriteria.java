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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Tipo_consultaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression descripcion;
	public final CollectionExpression consultas;
	
	public Tipo_consultaDetachedCriteria() {
		super(Tipo_consulta.class, Tipo_consultaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		consultas = new CollectionExpression("ORM_consultas", this.getDetachedCriteria());
	}
	
	public Tipo_consultaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Tipo_consultaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		consultas = new CollectionExpression("ORM_consultas", this.getDetachedCriteria());
	}
	
	public ConsultasDetachedCriteria createConsultasCriteria() {
		return new ConsultasDetachedCriteria(createCriteria("ORM_consultas"));
	}
	
	public Tipo_consulta uniqueTipo_consulta(PersistentSession session) {
		return (Tipo_consulta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipo_consulta[] listTipo_consulta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipo_consulta[]) list.toArray(new Tipo_consulta[list.size()]);
	}
}

