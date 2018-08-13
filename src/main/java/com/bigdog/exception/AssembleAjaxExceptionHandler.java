package com.bigdog.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bigdog.pojo.JSONResult;

@RestControllerAdvice
public class AssembleAjaxExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public JSONResult defaultErrorHandler(HttpServletRequest request,Exception e)
	{
		return JSONResult.errorException(e.getMessage());
	}
}
