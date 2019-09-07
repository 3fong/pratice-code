package base;

import java.util.Arrays;

/*
 *给数组排序
 */
public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {4,1,8,9,6,2,3};
//		selectSort(arr);
//		bubbleSort(arr);
		Arrays.sort(arr);
		printArray(arr);
	}
	//排序排序：相邻项比较，最值在尾部。 
	private static void bubbleSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1]){
					int temp= arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
		printArray(arr);
	}
	//选择排序：头角标和其他角标比较，最大值在头角标
	private static void selectSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]>arr[x]){
					int temp = arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		printArray(arr);
	}
	//遍历打印数组
	private static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1){
				System.out.print(arr[x]+",");
			}else{
				System.out.println(arr[x]+"]");
			}
		}		
	}
}
