package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class FirstController extends AbstractController {
	 protected ModelAndView handleRequestInternal(HttpServletRequest request,
	            HttpServletResponse response) throws Exception {
	 System.out.println("Throwing my custom Exception.. 11");
	        throw new SpringException("Throwing my custom Exception.. 1");
	 
}
}