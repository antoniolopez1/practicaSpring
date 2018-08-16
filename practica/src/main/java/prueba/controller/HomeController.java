package prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
@RequestMapping(value="/", method=RequestMethod.GET)
public String goHome() {
	return "home";
}
@RequestMapping(value="/noticias", method=RequestMethod.GET)
public String goNoticias() {
	return "noticias";
}
@RequestMapping(value="/empresa", method=RequestMethod.GET)
public String goEmpresa() {
	return "empresa";
}
}
