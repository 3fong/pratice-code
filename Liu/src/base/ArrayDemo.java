package base;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		int i = s.nextInt();
//		
		//又返回值的，要注意输出返回值
//		String str = searchWeek(i);
//		System.out.println(str);
//		
		int[] arr = {1,5,8,8,7,23};

//		loopArray(arr);
		
		getMax(arr);
		System.out.println(arr);
//		getMax(arr);
		
//		reverse2(arr);
		loopArray(arr);
		
//		int index = getAddress(arr,46);
//		System.out.println(index);
	}
	/*
	 * 需求：遍历数组
	 * 返回值类型：void
	 * 参数列表：int[]
	 */
	public static void loopArray(int[] arr){
		//方法一：
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+" ");
		}
		//方法二：
//		System.out.print("[");
//		for(int x=0;x<arr.length;x++){
//			if(x<arr.length-1){
//				System.out.print(arr[x]+",");
//			}
//			else
//				System.out.print(arr[x]+"]");
//		}
	}
	/*
	 * 获取最值
	 * 返回值类型：int
	 * 参数列表：int[]
	 */
	public static void getMax(int[] arr){
		int max=arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max=arr[x];
			}			
		}
//		return max;
	}
	/*
	 * 需求：元素逆序
	 * 返回值：void
	 * 参数列表：int[]
	 */
	//方法一：
	public static void reverse(int[] arr){
		for(int x=0;x<arr.length/2;x++){
			int temp=arr[x];
			arr[x]=arr[arr.length-1-x];
			arr[arr.length-1-x]=temp;
		}
	}
	//方法二：
	public static void reverse2(int[] arr){
		for(int start=0,end=arr.length-1;start<end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	/*
	 * 需求：查找对应星期
	 * 返回值类型：String
	 * 参数列表：int[]
	 */
	public static String searchWeek(int x){
		String[] s = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		if(x>=1&&x<=7)
			return s[x];
		else
			return null;
	}
	/*
	 * 需求：获取元素第一次出现位置
	 * 返回值类型：int
	 * 参数列表：int[] arr,int key
	 */
	public static int getAddress(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==key){
				return x;
			}
		}
		return -1;
	}
}
