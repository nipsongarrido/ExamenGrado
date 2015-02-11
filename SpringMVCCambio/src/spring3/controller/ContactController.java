package spring3.controller;
 
//import net.viralpatel.spring3.form.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class ContactController {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div align='center'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from CrunchifyHelloWorld.java **********<br><br>";
		System.out.println(message);
		return new ModelAndView("welcome", "message", message);
	}
    
}