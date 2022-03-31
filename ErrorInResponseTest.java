package de.asap.pak.adapter.github.api.entities.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ErrorInResponseTest {
	/**
	 * Try to get the message of an "empty" ErrorResponse. There is none so "No
	 * message available" will be given out. //
	 */
	@Test
	public void test_NoNextIterator() {
		ErrorInResponse error = new ErrorInResponse();
		assertNull(error.getMessage());
	}
}