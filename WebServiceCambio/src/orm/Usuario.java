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
import java.io.Serializable;
import javax.persistence.*;
/**
 * tabla para almacenar usuarios
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_USUARIO_CONSULTAS) {
			return ORM_consultas;
		}
		else if (key == orm.ORMConstants.KEY_USUARIO_LOGIN) {
			return ORM_login;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USUARIO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="nombre_usuario", nullable=false, unique=true, length=100)	
	private String nombre_usuario;
	
	@Column(name="contrasena", nullable=false, length=255)	
	private String contrasena;
	
	@OneToMany(mappedBy="usuario", targetEntity=Consultas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_consultas = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario", targetEntity=orm.Login.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_login = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * nombre de usuario
	 */
	public void setNombre_usuario(String value) {
		this.nombre_usuario = value;
	}
	
	/**
	 * nombre de usuario
	 */
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	
	/**
	 * contrasena del usuario
	 */
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	/**
	 * contrasena del usuario
	 */
	public String getContrasena() {
		return contrasena;
	}
	
	private void setORM_Consultas(java.util.Set value) {
		this.ORM_consultas = value;
	}
	
	private java.util.Set getORM_Consultas() {
		return ORM_consultas;
	}
	
	@Transient	
	public final ConsultasSetCollection consultas = new ConsultasSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_USUARIO_CONSULTAS, orm.ORMConstants.KEY_CONSULTAS_USUARIO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Login(java.util.Set value) {
		this.ORM_login = value;
	}
	
	private java.util.Set getORM_Login() {
		return ORM_login;
	}
	
	@Transient	
	public final orm.LoginSetCollection login = new orm.LoginSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_USUARIO_LOGIN, orm.ORMConstants.KEY_LOGIN_USUARIO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
