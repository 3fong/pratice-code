package practice;

import java.util.ArrayList;
import java.util.List;

public class FanXing {
	//泛型的应用
//	public static String method(List<String> arg){
//		System.out.println("method(List<String> arg)");
//		return "";
//	}
//	
//	public static Integer method(List<Integer> arg){
//		System.out.println("method(List<String> arg)");
//		return 1;
//	for (int t = i; j<length;) {
//		
//	}
//	}
	private static int sum(int[] arr, int i, int j,List<Integer> list) {
		int sum = 0;
		for (int t = i; t <= j; t++) {
			sum+=arr[t];
			list.add(arr[t]);
		}
		return sum;
	}
	
	public static List<Integer> maxSubArray(int[] arr){
		int length = arr.length;
		// 控制数组首角标变化
		int sum = 0;
		List<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			// 尾角标
			for (int j = i; i < length&&j<length; j++) {
				System.out.println(" i: "+i+" j: "+j);
				List<Integer> list = new ArrayList<Integer>();
				int result=0;
				for (int t = i; t <= j; t++) {
					result+=arr[t];
					list.add(arr[t]);
				}
				if(sum<result){
					sum=result;
					arrList=list;
				}
			}
		}
		return arrList;
	}
	
	public static void main(String[] args) {
		int[] arr = {-1,2,1,-2,3,-1,4,-2};
		List<Integer> maxSubArray = maxSubArray(arr);
		System.out.println(maxSubArray);
	}
}

class SuperClass{
	public static int value = 123;
	static{
		System.out.println("superclass init");
	}
	public static void run(){
		System.out.println("run");
	}
}
class SubClass extends SuperClass{
	static{
		System.out.println("subclass init");
	}
	public static void run2(){
		System.out.println("run2");
	}
}