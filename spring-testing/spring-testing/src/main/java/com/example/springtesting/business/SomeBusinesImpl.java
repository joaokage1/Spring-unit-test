package com.example.springtesting.business;

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
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return sum;
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
