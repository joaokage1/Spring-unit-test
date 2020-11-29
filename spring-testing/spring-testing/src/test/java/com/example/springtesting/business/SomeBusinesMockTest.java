package com.example.springtesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.example.springtesting.data.SomeDataService;

public class SomeBusinesMockTest {

	@Test
	public void calculateSumBasic() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();
		SomeDataService mock = mock(SomeDataService.class);
		when(mock.retreveAllData()).thenReturn(new int[] { 1, 2, 3 });
		businesImpl.setDataService(mock);

		int result = businesImpl.calculateSumUsingDataService();

		assertEquals(6, result);
	}

	@Test
	public void calculateSumEmpty() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();

		SomeDataService mock = mock(SomeDataService.class);
		when(mock.retreveAllData()).thenReturn(new int[] {});
		businesImpl.setDataService(mock);

		int result = businesImpl.calculateSumUsingDataService();

		assertEquals(0, result);
	}

	@Test
	public void calculateSumOneValue() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();
		SomeDataService mock = mock(SomeDataService.class);
		when(mock.retreveAllData()).thenReturn(new int[] { 2 });
		businesImpl.setDataService(mock);
		int result = businesImpl.calculateSumUsingDataService();

		assertEquals(2, result);
	}
}
