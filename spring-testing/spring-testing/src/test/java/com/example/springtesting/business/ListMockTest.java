package com.example.springtesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {

	@SuppressWarnings("unchecked")
	@InjectMocks
	List<String> mock = Mockito.mock(List.class);

	@Test
	public void basic_size() {

		when(this.mock.size()).thenReturn(5);

		assertEquals(5, this.mock.size());
	}

	@Test
	public void different_values() {
		when(this.mock.size()).thenReturn(5).thenReturn(10);

		assertEquals(5, this.mock.size());
		assertEquals(10, this.mock.size());
	}

	@Test
	public void withGenerParameter_values() {
		when(this.mock.get(anyInt())).thenReturn("toddy");

		assertEquals("toddy", this.mock.get(5));
		assertEquals("toddy", this.mock.get(10));
	}

	@Test
	public void verificationBasics() {

		this.mock.get(0);

		verify(this.mock).get(anyInt());
		verify(this.mock, times(1)).get(anyInt());
		verifyNoMoreInteractions(this.mock);
	}

}
