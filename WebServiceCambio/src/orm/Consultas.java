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
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="consultas")
public class Consultas implements Serializable {
	public Consultas() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CONSULTAS_TIPO_CONSULTA) {
			this.tipo_consulta = (Tipo_consulta) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CONSULTAS_USUARIO) {
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
	@GeneratedValue(generator="CONSULTAS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CONSULTAS_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="cantidad_consultada", nullable=false)	
	private float cantidad_consultada;
	
	@Column(name="cantidad_cambiada", nullable=false)	
	private float cantidad_cambiada;
	
	@Column(name="fecha_cambio", nullable=false, length=20)	
	private String fecha_cambio;
	
	@ManyToOne(targetEntity=Tipo_consulta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipo_consulta_id", referencedColumnName="id", nullable=false) })	
	private Tipo_consulta tipo_consulta;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="usuario_id", referencedColumnName="id", nullable=false) })	
	private Usuario usuario;
	
	/**
	 * id de la consulta
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * id de la consulta
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * cantidad a cambiar
	 */
	public void setCantidad_consultada(float value) {
		this.cantidad_consultada = value;
	}
	
	/**
	 * cantidad a cambiar
	 */
	public float getCantidad_consultada() {
		return cantidad_consultada;
	}
	
	/**
	 * cantidad resultante en el cambio
	 */
	public void setCantidad_cambiada(float value) {
		this.cantidad_cambiada = value;
	}
	
	/**
	 * cantidad resultante en el cambio
	 */
	public float getCantidad_cambiada() {
		return cantidad_cambiada;
	}
	
	/**
	 * fecha en la que se realizo la consulta
	 */
	public void setFecha_cambio(String value) {
		this.fecha_cambio = value;
	}
	
	/**
	 * fecha en la que se realizo la consulta
	 */
	public String getFecha_cambio() {
		return fecha_cambio;
	}
	
	public void setTipo_consulta(Tipo_consulta value) {
		if (tipo_consulta != null) {
			tipo_consulta.consultas.remove(this);
		}
		if (value != null) {
			value.consultas.add(this);
		}
	}
	
	public Tipo_consulta getTipo_consulta() {
		return tipo_consulta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipo_consulta(Tipo_consulta value) {
		this.tipo_consulta = value;
	}
	
	private Tipo_consulta getORM_Tipo_consulta() {
		return tipo_consulta;
	}
	
	public void setUsuario(Usuario value) {
		if (usuario != null) {
			usuario.consultas.remove(this);
		}
		if (value != null) {
			value.consultas.add(this);
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
