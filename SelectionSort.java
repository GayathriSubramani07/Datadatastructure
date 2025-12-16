package com.demo;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {6,5,2,8,9,4}; int minIndex=-1;
		for(int i=0;i<arr.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minIndex]< arr[j])
				{
					minIndex=j;
				}
				
				
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
