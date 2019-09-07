package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
 */
public class SwapArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(true){
			int num = s.nextInt();
			if(num==0)
				break;
			al.add(num);
		}
		show(al);
//		Integer[] arr = al.toArray(new Integer[al.size()-1]);
//		printArray(arr);
//		swap(arr);
//		swap2(arr);
//		printArray(arr);
	}
	//第二种方法也可以达到预定效果，但是多做了功能，有瑕疵，但是代码简单
	private static void show(ArrayList<Integer> al) {
		Collections.sort(al);
		Collections.reverse(al);
		for(Integer i : al){
			System.out.print(i+" ");
		}
	}

	private static void printArray(Integer[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}

	private static void swap(Integer[] arr) {
		for(int x=0;x<arr.length-1;x++){
			if(arr[x]>arr[0]){
//				change(arr,arr[0],arr[x]);
				int temp = arr[0];
				arr[0]=arr[x];
				arr[x]=temp;
			}
		}
	}
	private static void swap2(Integer[] arr) {
		for(int x=0;x<arr.length-1;x++){
			if(arr[x]<arr[arr.length-1]){
//				change(arr,arr[arr.length-1],arr[x]);	
				int temp = arr[arr.length-1];
				arr[arr.length-1]=arr[x];
				arr[x]=temp;
			}
		}
	}
	//ArrayIndexOutOfBoundsException
//	private static void change(Integer[] arr, int x, int y) throws RuntimeException{
//		int temp = arr[x];
//		arr[x]=arr[y];
//		arr[y]=temp;
//	}

}
