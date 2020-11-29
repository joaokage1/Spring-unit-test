package com.example.springtesting.business;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.springtesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {

	@Override
	public int[] retreveAllData() {
		return new int[] { 1, 2, 3 };
	}

}

public class SomeBusinesStubTest {

	@Test
	public void calculateSumUsingDataServiceBasic() {
		SomeBusinesImpl businesImpl = new SomeBusinesImpl();
		businesImpl.setDataService(new SomeDataServiceStub());

		int result = businesImpl.calculateSumUsingDataService();

		assertEquals(6, result);
	}
}
