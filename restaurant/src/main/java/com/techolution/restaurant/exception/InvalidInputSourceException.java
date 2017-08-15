package com.techolution.restaurant.exception;

public class InvalidInputSourceException extends RestaurantException {
	private static final long serialVersionUID = 386353751289376875L;

	public InvalidInputSourceException(Throwable e) {
		super(e);
	}
}
