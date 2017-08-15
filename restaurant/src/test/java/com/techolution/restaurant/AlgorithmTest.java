package com.techolution.restaurant;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import com.techolution.restaurant.exception.InvalidInputFormatException;
import com.techolution.restaurant.util.RestaurantUtility;

import junit.framework.TestCase;

public class AlgorithmTest {
	@Test
	public void testCase1() throws IOException {
		String input = "50 3\n60 10\n100 20\n120 30";
		try (InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8))) {
			TestCase.assertEquals(new Integer(220), new RestaurantUtility().perform(stream));
		}
	}

	@Test
	public void testReadFile() throws IOException {
		try (InputStream stream = new FileInputStream(getClass().getClassLoader().getResource("input.txt").getFile())) {
			TestCase.assertEquals(new Integer(2493893), new RestaurantUtility().perform(stream));
		}
	}

	@Test(expected = InvalidInputFormatException.class)
	public void invalidInput() throws IOException {
		String input = "50 4\n60 10\n100 20\n120 30";
		try (InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8))) {
			new RestaurantUtility().perform(stream);
		}
	}
}
