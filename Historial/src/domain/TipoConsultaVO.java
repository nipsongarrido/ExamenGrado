package domain;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

/**
 * La Clase TipoConsultaVO.
 */
public class TipoConsultaVO implements KvmSerializable{

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
            return descripcion;
        }
        
        return null;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
		switch(index)
        {
        case 0:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "descripcion";
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
            descripcion = value.toString();
            break;
        }
		
	}

}
