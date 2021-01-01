package helloApp1Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldAnnotationController {
	
	public HelloWorldAnnotationController() {
		System.out.println(" --HelloWorldAnnotationController default constructor--");
	}
	
	@RequestMapping("/helloannotation.htm")
	public ModelAndView handleRequestAnnotaion() {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("msg", "HelloWorld Annotaion Controller");
		System.out.println("-----Annotation Handle Request Called-----");
		return mv;

	}

}
