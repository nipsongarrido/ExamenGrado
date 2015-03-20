package domain;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

/**
 * La Clase LoginVO
 */
public class LoginVO implements KvmSerializable{
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

	@Override
	public String getInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(int arg0) {
		switch(arg0)
        {
        case 0:
            return token;
        case 1:
            return fechaInicio;
        case 2:
            return fechaFin;
        case 3:
            return usuario;
        }
        
        return null;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
		switch(index)
        {
        case 0:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "token";
            break;
        case 1:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fechaInicio";
            break;
        case 2:
        	info.type = PropertyInfo.STRING_CLASS;
            info.name = "fechaFin";
            break;
        case 3:
        	info.type = new UsuarioVO().getClass();
            info.name = "usuario";
            break;
        default:break;
        }
	}

	@Override
	public void setInnerText(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProperty(int index, Object value) {
		switch(index)
        {
        case 0:
            token = value.toString();
            break;
        case 1:
            fechaInicio = value.toString();
            break;
        case 2:
            fechaFin = value.toString();
            break;
        case 3:
            usuario = (UsuarioVO)value;
            break;
        }
        
		
	}
	
	
}
