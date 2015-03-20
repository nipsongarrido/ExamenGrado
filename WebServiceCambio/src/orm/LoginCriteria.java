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

public class LoginCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final StringExpression fecha_inicio;
	public final StringExpression fecha__fin;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public LoginCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		token = new StringExpression("token", this);
		fecha_inicio = new StringExpression("fecha_inicio", this);
		fecha__fin = new StringExpression("fecha__fin", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
	}
	
	public LoginCriteria(PersistentSession session) {
		this(session.createCriteria(Login.class));
	}
	
	public LoginCriteria() throws PersistentException {
		this(orm.ExamenPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public Login uniqueLogin() {
		return (Login) super.uniqueResult();
	}
	
	public Login[] listLogin() {
		java.util.List list = super.list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}

