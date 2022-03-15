package com.te.resumebuilder.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.resumebuilder.beans.ResumeResponse;
import com.te.resumebuilder.exception.RegisterException;

@RestControllerAdvice
public class ResumeContollerAdvice {

	@ExceptionHandler(RegisterException.class)
	public ResponseEntity<ResumeResponse>  noSuchElement(RegisterException exp){
		ResumeResponse  res = new ResumeResponse(true,exp.getMessage() );
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResumeResponse> methodArgumentNotValidException(MethodArgumentNotValidException exp){
		ResumeResponse res = new ResumeResponse(true,exp.getFieldError().getDefaultMessage());
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
}
