package domain;

import java.sql.Timestamp;

/**
 * La Clase ConsultaVO.
 */
public class ConsultaVO {

	/** La cantidad consultada. */
	private float cantidadConsultada;

	/** La cantidad cambiada. */
	private float cantidadCambiada;

	/** La fecha en la que se realizo cambio. */
	private String fechaCambio;

	/** El usuario. */
	private UsuarioVO usuario;

	/** El tipo consulta. */
	private TipoConsultaVO tipoConsulta;

	/**
	 * Instancia una nueva consulta vo.
	 */
	public ConsultaVO() {
	}

	/**
	 * Instancia una nueva consulta vo.
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
	public ConsultaVO(float cantidadConsultada, float cantidadCambiada,
			String fechaCambio, UsuarioVO usuario,
			TipoConsultaVO tipoConsulta) {
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
	public UsuarioVO getUsuario() {
		return usuario;
	}

	/**
	 * Sets el usuario.
	 *
	 * @param usuario
	 *            el nuevo usuario
	 */
	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets el tipo consulta.
	 *
	 * @return el tipo consulta
	 */
	public TipoConsultaVO getTipoConsulta() {
		return tipoConsulta;
	}

	/**
	 * Sets el tipo consulta.
	 *
	 * @param tipoConsulta
	 *            el nuevo tipo consulta
	 */
	public void setTipoConsulta(TipoConsultaVO tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

}
