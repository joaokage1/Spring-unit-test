package com.example.springtesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.springtesting.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
public class SomeBusinesMockTest {

	@InjectMocks
	SomeBusinesImpl businesImpl = new SomeBusinesImpl();

	@Mock
	SomeDataService mock = mock(SomeDataService.class);

	@Test
	public void calculateSumBasic() {

		when(this.mock.retreveAllData()).thenReturn(new int[] { 1, 2, 3 });

		assertEquals(6, this.businesImpl.calculateSumUsingDataService());
	}

	@Test
	public void calculateSumEmpty() {

		when(this.mock.retreveAllData()).thenReturn(new int[] {});

		assertEquals(0, this.businesImpl.calculateSumUsingDataService());
	}

	@Test
	public void calculateSumOneValue() {

		when(this.mock.retreveAllData()).thenReturn(new int[] { 2 });

		assertEquals(2, this.businesImpl.calculateSumUsingDataService());
	}
}
