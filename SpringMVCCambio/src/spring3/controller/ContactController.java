package spring3.controller;
 
//import net.viralpatel.spring3.form.Contact;
import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webservice.ServicioCambioStub;
import webservice.ServicioCambioStub.AgregarUsuario;
import webservice.ServicioCambioStub.AgregarUsuarioResponse;
import webservice.ServicioCambioStub.Login;
import webservice.ServicioCambioStub.LoginResponse;
import webservice.ServicioCambioStub.LoginVO;
import webservice.ServicioCambioStub.UsuarioVO;
 
@Controller
public class ContactController {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "que onda";
		try {
			ServicioCambioStub oStub = new ServicioCambioStub();
			Login login = new Login();
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setUsuario("nipson");
			usuarioVO.setContrasena("asdasd");
			login.setUsuario(usuarioVO);
			LoginResponse oResp = oStub.login(login);
			LoginVO oLogin = oResp.get_return();
			message += "<div align='center'><strong>"+oLogin.getToken()+"</strong></div><br />";
		} catch (Exception e) {
			// TODO: handle exception
			message += e.getMessage();
		}
		message += "<br><div align='center'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from CrunchifyHelloWorld.java **********<br><br>";
		System.out.println(message);
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/usuario")
	public ModelAndView usuario() {
		
		return new ModelAndView("usuario", "Administrador", new spring3.form.UsuarioVO());
	}
	
	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	public ModelAndView agregarUsuario(@ModelAttribute("UsuarioVO") @Validated spring3.form.UsuarioVO usuario, BindingResult result, HttpSession session) {
		
		try{
            ServicioCambioStub oStub = new ServicioCambioStub();

            UsuarioVO oUsuarioVO = new UsuarioVO();

            oUsuarioVO.setUsuario(usuario.getUsuario());
            oUsuarioVO.setContrasena(usuario.getContrasena());

            AgregarUsuario oAgregar = new AgregarUsuario();
            oAgregar.setUsuario(oUsuarioVO);
            
            AgregarUsuarioResponse objResponse = oStub.agregarUsuario(oAgregar);
            String respuesta = objResponse.get_return();

            
            String mensaje = "usuario y contrasena no coinciden";
            return new ModelAndView("mensaje", "message", respuesta);

	    } catch (RemoteException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	
	            return new ModelAndView("mensaje", "message", "ERROR");
	    }
	}
    
}