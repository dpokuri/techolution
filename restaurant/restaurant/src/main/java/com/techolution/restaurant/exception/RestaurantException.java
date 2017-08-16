package com.techolution.restaurant.exception;

public class RestaurantException extends RuntimeException {
	private static final long serialVersionUID = -1626501420467939474L;

	public RestaurantException() {
	}

	public RestaurantException(String str) {
		super(str);
	}

	public RestaurantException(Throwable e) {
		super(e);
	}
}
