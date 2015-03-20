package domain;

import java.sql.Timestamp;
import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

/**
 * La Clase ConsultaVO.
 */
public class ConsultaVO implements KvmSerializable{

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
            return cantidadCambiada;
        case 1:
            return cantidadConsultada;
        case 2:
            return fechaCambio;
        case 3:
            return tipoConsulta;
        case 4:
            return usuario;
        }
        
        return null;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
		switch(index)
        {
        case 0:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cantidadCambiada";
            break;
        case 1:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "cantidadConsultada";
            break;
        case 2:
        	info.type = PropertyInfo.STRING_CLASS;
            info.name = "fechaCambio";
            break;
        case 3:
        	info.type = new TipoConsultaVO().getClass();
            info.name = "tipoConsulta";
            break;
        case 4:
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
        	cantidadCambiada = Float.parseFloat(value.toString());
            break;
        case 1:
        	cantidadConsultada = Float.parseFloat(value.toString());
            break;
        case 2:
        	fechaCambio = value.toString();
            break;
        case 3:
        	tipoConsulta = (TipoConsultaVO)value;
            break;
        case 4:
        	usuario = (UsuarioVO)value;
            break;
        }
	}

	@Override
	public String toString() {
		return  "tipoConsulta = " + tipoConsulta.getDescripcion() + "\n"
				+ "cantidadConsultada=" + cantidadConsultada + "\n"
				+ "cantidadCambiada=" + cantidadCambiada + "\n"
				+ "fechaCambio=" + fechaCambio + "\n"
				+ "usuario=" + usuario.getUsuario() + "" 
				+ "tipoConsulta=" + tipoConsulta.getDescripcion();
	}
	
	

}
