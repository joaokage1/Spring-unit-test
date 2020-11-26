package com.example.springtesting.business;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinesImplTest {

	@Test
	public void calculateSumBasic() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();

		int result = businesImpl.calculateSum(new int[] { 1, 2, 3 });

		assertEquals(6, result);
	}

	@Test
	public void calculateSumEmpty() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();

		int result = businesImpl.calculateSum(new int[] {});

		assertEquals(0, result);
	}

	@Test
	public void calculateSumOneValue() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();

		int result = businesImpl.calculateSum(new int[] { 2 });

		assertEquals(2, result);
	}
}
