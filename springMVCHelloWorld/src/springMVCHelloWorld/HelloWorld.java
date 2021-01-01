package springMVCHelloWorld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorld implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("msg","Hello first Spring Mvc Project");
		System.out.println("-----Handle Request Called-----");
		return mv;
	}

}
