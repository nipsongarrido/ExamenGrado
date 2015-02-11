package spring3.form;

public class TipoConsulta {
	/** La descripcion. */
	private String descripcion;

	/**
	 * Instancia una nueva tipo consulta vo.
	 */
	public TipoConsulta() {
	}

	/**
	 * Instancia una nueva tipo consulta vo.
	 *
	 * @param descripcion
	 *            la descripcion de la consulta
	 */
	public TipoConsulta(String descripcion) {
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
