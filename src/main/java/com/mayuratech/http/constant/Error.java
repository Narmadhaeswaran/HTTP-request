package com.mayuratech.http.constant;

public class Error {

	private String errorCode;
	private String message;
	
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Error(String errorCode, String message) {
		
		this.errorCode = errorCode;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Error [errorCode=" + errorCode + ", message=" + message + "]";
	}
	
	
	
}
