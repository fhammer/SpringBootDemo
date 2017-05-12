package com.play.boot.exception;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = -8564417667760942755L;

	public ServiceException(String msg) {
	    super(msg);
	  }
	}
