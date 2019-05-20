package com.mbf.exceptions;

public class SpringException extends Exception {
	 private static final long serialVersionUID = -4744430183523721711L;
	 
	    private String message = "This is an exception..";

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public SpringException(String message) {
			super();
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	 
}
