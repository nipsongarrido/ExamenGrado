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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre_usuario;
	public final StringExpression contrasena;
	public final CollectionExpression consultas;
	public final CollectionExpression login;
	
	public UsuarioDetachedCriteria() {
		super(Usuario.class, UsuarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		consultas = new CollectionExpression("ORM_consultas", this.getDetachedCriteria());
		login = new CollectionExpression("ORM_login", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UsuarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre_usuario = new StringExpression("nombre_usuario", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		consultas = new CollectionExpression("ORM_consultas", this.getDetachedCriteria());
		login = new CollectionExpression("ORM_login", this.getDetachedCriteria());
	}
	
	public ConsultasDetachedCriteria createConsultasCriteria() {
		return new ConsultasDetachedCriteria(createCriteria("ORM_consultas"));
	}
	
	public orm.LoginDetachedCriteria createLoginCriteria() {
		return new orm.LoginDetachedCriteria(createCriteria("ORM_login"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

