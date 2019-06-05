package org.cloud.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

@ControllerAdvice
public class CloudException {

	@Autowired
	protected HttpServletRequest request;
	
	@ExceptionHandler(value=Exception.class)
	//@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView toExceptionView(Exception e ) {
		e.printStackTrace();
		//获取异常信息 
		//String message = e.getMessage() ;
		String message = MessageSource.getText(request, "LVB-009001");
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("message", message) ;
		return mav ;
	}
	
	
	@ExceptionHandler(value=Throwable.class)
	public ModelAndView toExceptionView2(Exception e ) {
		e.printStackTrace();
		//获取异常信息 
		//String message = e.getMessage() ;
		String message = MessageSource.getText(request, "LVB-009001");
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("message", message) ;
		return mav ;
	}
}
