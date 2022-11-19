package control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import dominio.Mensaje;
import servicio.MensajeService;

@Controller
@RequestMapping("/eleccionPage.htm")
@SessionAttributes("message")
public class MessageController {
	
	private MensajeService messageService;
	
	@Autowired
	public MessageController(MensajeService messageService) {
		this.messageService = messageService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showMainPage(ModelMap model, HttpServletRequest request) {
		Mensaje message = new Mensaje();
		model.addAttribute("message", message);
		return "mainScreen";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("message") Mensaje message, BindingResult bindingResult, HttpServletRequest request) {
		return "redirect:msgRegistration.htm";
	}
	
}
