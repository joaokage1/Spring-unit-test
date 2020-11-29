package com.example.springtesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListMockTest {

	@SuppressWarnings("rawtypes")
	@Test
	public void basic_size() {
		List mock = Mockito.mock(List.class);
		when(mock.size()).thenReturn(5);

		assertEquals(5, mock.size());
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void different_values() {
		List mock = Mockito.mock(List.class);
		when(mock.size()).thenReturn(5).thenReturn(10);

		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}

}
