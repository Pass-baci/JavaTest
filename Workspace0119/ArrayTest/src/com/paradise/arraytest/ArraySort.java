package com.paradise.arraytest;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		for (int i=0; i<arr.length-1; i++) {
			boolean isFlag = true;
			for (int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isFlag = false;
				}
			}
			if (isFlag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
