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
 * Tipos de consulta a realizar
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="tipo_consulta")
public class Tipo_consulta implements Serializable {
	public Tipo_consulta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TIPO_CONSULTA_CONSULTAS) {
			return ORM_consultas;
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
	@GeneratedValue(generator="ORM_TIPO_CONSULTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_TIPO_CONSULTA_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="descripcion", nullable=false, unique=true, length=100)	
	private String descripcion;
	
	@OneToMany(mappedBy="tipo_consulta", targetEntity=orm.Consultas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_consultas = new java.util.HashSet();
	
	/**
	 * id de tipo consulta
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * id de tipo consulta
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * descripcion o nombre de la consulta
	 */
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	/**
	 * descripcion o nombre de la consulta
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setORM_Consultas(java.util.Set value) {
		this.ORM_consultas = value;
	}
	
	private java.util.Set getORM_Consultas() {
		return ORM_consultas;
	}
	
	@Transient	
	public final orm.ConsultasSetCollection consultas = new orm.ConsultasSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TIPO_CONSULTA_CONSULTAS, orm.ORMConstants.KEY_CONSULTAS_TIPO_CONSULTA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
