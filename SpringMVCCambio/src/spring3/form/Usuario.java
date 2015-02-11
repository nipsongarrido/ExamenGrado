package spring3.form;

public class Usuario {
	
	/** El usuario. */
	private String usuario;

	/** La contrasena. */
	private String contrasena;

	/**
	 * Instancia un nuevo usuario vo.
	 */
	public Usuario() {
	}

	/**
	 * Instancia un nuevo usuario vo.
	 *
	 * @param usuario
	 *            el usuario
	 * @param contrasena
	 *            la contrasena
	 */
	public Usuario(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	/**
	 * Gets el usuario.
	 *
	 * @return el usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Sets el usuario.
	 *
	 * @param usuario
	 *            el nuevo usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets la contrasena.
	 *
	 * @return la contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Sets la contrasena.
	 *
	 * @param contrasena
	 *            la nueva contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
