package com.example.springtesting.business;

import java.util.Arrays;
import java.util.OptionalInt;

import com.example.springtesting.data.SomeDataService;

public class SomeBusinesImpl {

	private SomeDataService dataService;

	public SomeDataService getDataService() {
		return this.dataService;
	}

	public void setDataService(SomeDataService dataService) {
		this.dataService = dataService;
	}

	public int calculateSum(int[] data) {
		OptionalInt number = Arrays.stream(data).reduce(Integer::sum);
		return number.orElse(0);
	}

	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = this.dataService.retreveAllData();
		for (int i : data) {
			sum += i;
		}
		return sum;
	}
}
