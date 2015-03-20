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

import java.io.Serializable;
import javax.persistence.*;
/**
 * en esta tabla se guardaran las sesiones de los usuarios
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="login")
public class Login implements Serializable {
	public Login() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_LOGIN_USUARIO) {
			this.usuario = (Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_LOGIN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_LOGIN_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="token", nullable=false, length=500)	
	private String token;
	
	@Column(name="fecha_inicio", nullable=false, length=20)	
	private String fecha_inicio;
	
	@Column(name="`fecha _fin`", nullable=false, length=20)	
	private String fecha__fin;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="usuarioid", referencedColumnName="id", nullable=false) })	
	private Usuario usuario;
	
	/**
	 * id del login
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * id del login
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * valor del token para identificar la sesion
	 */
	public void setToken(String value) {
		this.token = value;
	}
	
	/**
	 * valor del token para identificar la sesion
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * fecha y hora en la que se inicio la sesion
	 */
	public void setFecha_inicio(String value) {
		this.fecha_inicio = value;
	}
	
	/**
	 * fecha y hora en la que se inicio la sesion
	 */
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	
	/**
	 * fecha y hora en la que finaliza la sesion
	 */
	public void setFecha__fin(String value) {
		this.fecha__fin = value;
	}
	
	/**
	 * fecha y hora en la que finaliza la sesion
	 */
	public String getFecha__fin() {
		return fecha__fin;
	}
	
	public void setUsuario(Usuario value) {
		if (usuario != null) {
			usuario.login.remove(this);
		}
		if (value != null) {
			value.login.add(this);
		}
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(Usuario value) {
		this.usuario = value;
	}
	
	private Usuario getORM_Usuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
