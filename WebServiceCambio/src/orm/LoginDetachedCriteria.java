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

public class LoginDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final StringExpression fecha_inicio;
	public final StringExpression fecha__fin;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public LoginDetachedCriteria() {
		super(orm.Login.class, orm.LoginCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		token = new StringExpression("token", this.getDetachedCriteria());
		fecha_inicio = new StringExpression("fecha_inicio", this.getDetachedCriteria());
		fecha__fin = new StringExpression("fecha__fin", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public LoginDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.LoginCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		token = new StringExpression("token", this.getDetachedCriteria());
		fecha_inicio = new StringExpression("fecha_inicio", this.getDetachedCriteria());
		fecha__fin = new StringExpression("fecha__fin", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public Login uniqueLogin(PersistentSession session) {
		return (Login) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Login[] listLogin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}

