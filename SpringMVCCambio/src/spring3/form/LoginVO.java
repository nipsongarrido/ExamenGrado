package spring3.form;

/**
 * La Clase LoginVO
 */
public class LoginVO {
	/** El token de seddion. */
	private String token;
	/** La fecha de inicio sesion. */
	private String fechaInicio;
	/** La fecha de termino de sesion. */
	private String fechaFin;
	/** El usuario de la session.*/
	private UsuarioVO usuario;
	
	public LoginVO() {
	}
	
	public LoginVO(String token, String fechaInicio, String fechaFin,
			UsuarioVO usuario) {
		this.token = token;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.usuario = usuario;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public UsuarioVO getUsuario() {
		return usuario;
	}
	
	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	
	
}
