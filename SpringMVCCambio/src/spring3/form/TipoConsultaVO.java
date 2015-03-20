package spring3.form;

public class TipoConsultaVO {
	/** La descripcion. */
	private String descripcion;

	/**
	 * Instancia una nueva tipo consulta vo.
	 */
	public TipoConsultaVO() {
	}

	/**
	 * Instancia una nueva tipo consulta vo.
	 *
	 * @param descripcion
	 *            la descripcion de la consulta
	 */
	public TipoConsultaVO(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets la descripcion.
	 *
	 * @return la descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets la descripcion.
	 *
	 * @param descripcion
	 *            la nueva descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
