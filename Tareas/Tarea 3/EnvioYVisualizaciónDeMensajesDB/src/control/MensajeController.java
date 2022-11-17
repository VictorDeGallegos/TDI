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

import baseDeDatos.MensajesJDBCTemplate;
import dominio.Mensaje;
import servicio.MensajeService;
import validator.MensajeValidator;

@Controller
@RequestMapping( "/msgRegistration.htm" )
@SessionAttributes("msg")

public class MensajeController {

	private MensajeService msgService;
	private MensajeValidator msgValidator;
 
	@Autowired
	public MensajeController( MensajeService msgService, MensajeValidator msgValidator ) { // metodo contructor
		this.msgService = msgService;
		this.msgValidator = msgValidator;
	}
	 
	@RequestMapping( method = RequestMethod.GET ) //metodo get
	public String showUserForm( ModelMap model, HttpServletRequest request ) {
		Mensaje msg = new Mensaje();
		model.addAttribute( "msg", msg );
		return "msgForm";
	}

	@RequestMapping( method = RequestMethod.POST ) // metodo post
	public String onSubmit( @ModelAttribute("msg") Mensaje msg, BindingResult result , HttpServletRequest request ) 
	{
		msgValidator.validate( msg, result );
		if ( result.hasErrors() ) {
			return "msgForm";
		}
		msgService.add( msg );
		return "msgSuccess";
	}
}



