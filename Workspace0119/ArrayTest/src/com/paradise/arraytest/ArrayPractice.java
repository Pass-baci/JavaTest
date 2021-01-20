package com.paradise.arraytest;

public class ArrayPractice {
	public static void main(String[] args) {
		//获取二维数组所有元素的和
		int[][] arr = {{3,5,8},{12,9},{7,0,6,4}};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("和为："+sum);
		System.out.println();
		
		//杨辉三角
		int[][] arr1 = new int[10][];
		for (int i=0; i<10; i++) {
			arr1[i] = new int[i+1];
			arr1[i][0] = 1;
			arr1[i][arr1[i].length-1]=1;
			for (int j=0; j<arr1[i].length; j++) {
				if (i >=2 && j>0 && j<arr1[i].length-1) {
					arr1[i][j] = arr1[i-1][j-1]+arr1[i-1][j];
					System.out.print(arr1[i][j]+" ");
				} else {
					System.out.print(arr1[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//求数值型数组中元素的最大值，最小值，平均数，总和
		int[] arr2 = new int[10];
		for (int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*(99-10)+10);
		}
		for (int i=0; i<arr2.length-1; i++) {
			if (arr2[0] < arr2[i+1]) {
				arr2[0] = arr2[i+1];
			}
		}
		System.out.println("最大值为："+arr2[0]);
		
		for (int i=0; i<arr2.length-1; i++) {
			if (arr2[0] > arr2[i+1]) {
				arr2[0] = arr2[i+1];
			}
		}
		System.out.println("最小值为："+arr2[0]);
		
		int sum1 = 0;
		for (int i=0; i<arr2.length; i++) {
			sum1+=arr2[i];
		}
		System.out.println("总和为："+sum1);
	}
}
