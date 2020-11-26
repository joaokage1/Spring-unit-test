package com.example.springtesting.business;

public class SomeBusinesImpl {

	public int calculateSum(int[] data) {
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return sum;
	}
}
