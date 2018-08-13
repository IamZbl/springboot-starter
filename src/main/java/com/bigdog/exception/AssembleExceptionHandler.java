package com.bigdog.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AssembleExceptionHandler {

	public static final String BOOT_ERROR_VIEW = "error";
	
	@ExceptionHandler(Exception.class)
	public Object errorHanler(HttpServletRequest request, 
   		HttpServletResponse response, Exception e)
	{
		e.printStackTrace();
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", request.getRequestURL());
		mav.setViewName(BOOT_ERROR_VIEW);
		return mav;
	}
}
