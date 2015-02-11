/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spring3.form;


public class Consulta  implements java.io.Serializable {
	 
	/** La cantidad consultada. */
	private float cantidadConsultada;

	/** La cantidad cambiada. */
	private float cantidadCambiada;

	/** La fecha en la que se realizo cambio. */
	private String fechaCambio;

	/** El usuario. */
	private Usuario usuario;

	/** El tipo consulta. */
	private TipoConsulta tipoConsulta;

	/**
	 * Instancia una nueva consulta .
	 */
	public Consulta() {
	}

	/**
	 * Instancia una nueva consulta .
	 *
	 * @param cantidadConsultada
	 *            la cantidad consultada
	 * @param cantidadCambiada
	 *            la cantidad cambiada
	 * @param fechaCambio
	 *            la fecha cambio
	 * @param usuario
	 *            el usuario
	 * @param tipoConsulta
	 *            el tipo consulta
	 */
	public Consulta(float cantidadConsultada, float cantidadCambiada,
			String fechaCambio, Usuario usuario,
			TipoConsulta tipoConsulta) {
		this.cantidadConsultada = cantidadConsultada;
		this.cantidadCambiada = cantidadCambiada;
		this.fechaCambio = fechaCambio;
		this.usuario = usuario;
		this.tipoConsulta = tipoConsulta;
	}

	/**
	 * Gets la cantidad consultada.
	 *
	 * @return la cantidad consultada
	 */
	public float getCantidadConsultada() {
		return cantidadConsultada;
	}

	/**
	 * Sets la cantidad consultada.
	 *
	 * @param cantidadConsultada
	 *            la nueva cantidad consultada
	 */
	public void setCantidadConsultada(float cantidadConsultada) {
		this.cantidadConsultada = cantidadConsultada;
	}

	/**
	 * Gets la cantidad cambiada.
	 *
	 * @return la cantidad cambiada
	 */
	public float getCantidadCambiada() {
		return cantidadCambiada;
	}

	/**
	 * Sets la cantidad cambiada.
	 *
	 * @param cantidadCambiada
	 *            la nueva cantidad cambiada
	 */
	public void setCantidadCambiada(float cantidadCambiada) {
		this.cantidadCambiada = cantidadCambiada;
	}

	/**
	 * Gets la fecha cambio.
	 *
	 * @return la fecha cambio
	 */
	public String getFechaCambio() {
		return fechaCambio;
	}

	/**
	 * Sets la fecha cambio.
	 *
	 * @param fechaCambio
	 *            la nueva fecha cambio
	 */
	public void setFechaCambio(String fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	/**
	 * Gets el usuario.
	 *
	 * @return el usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Sets el usuario.
	 *
	 * @param usuario
	 *            el nue usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets el tipo consulta.
	 *
	 * @return el tipo consulta
	 */
	public TipoConsulta getTipoConsulta() {
		return tipoConsulta;
	}

	/**
	 * Sets el tipo consulta.
	 *
	 * @param tipoConsulta
	 *            el nue tipo consulta
	 */
	public void setTipoConsulta(TipoConsulta tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	
    

}
