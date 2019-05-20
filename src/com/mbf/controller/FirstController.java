package com.mbf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mbf.exceptions.SpringException;
@Controller
public class FirstController extends AbstractController {
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Throwing my custom Exception.. 11");
		throw new SpringException("Throwing my custom Exception.. 1");

	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handleCustomException(SpringException ex) {
        System.out.println("Handling exception");
        ModelAndView model = new ModelAndView("error");
        model.addObject("exception", ex);
        return model;
    }
	
}