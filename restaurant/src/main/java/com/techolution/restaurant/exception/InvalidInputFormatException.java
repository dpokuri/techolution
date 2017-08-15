package com.techolution.restaurant.exception;

public class InvalidInputFormatException extends RestaurantException {
	private static final long serialVersionUID = 386353751289376875L;

	public InvalidInputFormatException(Throwable e) {
		super(e);
	}

	public InvalidInputFormatException() {
	}
}
