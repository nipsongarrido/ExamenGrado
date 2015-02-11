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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre_usuario;
	public final StringExpression contrasena;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre_usuario = new StringExpression("nombre_usuario", this);
		contrasena = new StringExpression("contrasena", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(orm.CambiomonedaPersistentManager.instance().getSession());
	}
	
	public ConsultasCriteria createConsultasCriteria() {
		return new ConsultasCriteria(createCriteria("ORM_consultas"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

