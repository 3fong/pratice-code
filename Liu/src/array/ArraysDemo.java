package array;

import java.util.Arrays;

/*
 *Arrays:针对数组进行操作的工具类。比如说排序和查找。
 * 1:public static String toString(int[] a) 把数组转成字符串
 * 2:public static void sort(int[] a) 对数组进行排序
 * 3:public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArraysDemo {
	public static void main(String[] args){
		int[] arr = { 24, 69, 80, 57, 13 };
		
		String s = Arrays.toString(arr);
		System.out.println(s);
		
		//排序后无法直接打印数组，只能将数组转成字符串再打印
		Arrays.sort(arr);
		String s1 = Arrays.toString(arr);
		System.out.println(s1);
		
		//[13, 24, 57, 69, 80]此时数组已经为有序数组
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 69));
		
		//不存在元素会返回元素-(依序插入角标-1)
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 695));
	}
}
