package domain;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

/**
 * La Clase UsuarioVO.
 */
public class UsuarioVO implements KvmSerializable{
	/** El usuario. */
	private String usuario;

	/** La contrasena. */
	private String contrasena;

	/**
	 * Instancia un nuevo usuario vo.
	 */
	public UsuarioVO() {
	}

	/**
	 * Instancia un nuevo usuario vo.
	 *
	 * @param usuario
	 *            el usuario
	 * @param contrasena
	 *            la contrasena
	 */
	public UsuarioVO(String usuario, String contrasena) {
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

	@Override
	public String getInnerText() {
		return null;
	}

	@Override
	public Object getProperty(int arg0) {
		switch(arg0)
        {
        case 0:
            return usuario;
        case 1:
            return contrasena;
        }
        
        return null;
	}

	@Override
	public int getPropertyCount() {
		return 2;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
		switch(index)
        {
        case 0:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "usuario";
            break;
        case 1:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "contrasena";
            break;
        default:break;
        }
	}

	@Override
	public void setInnerText(String arg0) {
		
	}

	@Override
	public void setProperty(int index, Object value) {
		switch(index)
        {
        case 0:
            usuario = value.toString();
            break;
        case 1:
            contrasena = value.toString();
            break;
        default:
            break;
        }
	}

}