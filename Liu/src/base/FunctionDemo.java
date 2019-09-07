package base;

import java.util.Scanner;

public class FunctionDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
//		int b = s.nextInt();
//		
//		boolean flag = judgeEquals(a,b);
//		System.out.println(flag);
//		
		printMultiTable(a);
	}
	/*
	 * 需求：判读两个数据是否相等
	 * 返回值类型：boolean
	 * 参数列表：int a,int b
	 */
	public static boolean judgeEquals(int a,int b){
		return a==b;
	}
	/*
	 * 需求：打印nn乘法表
	 * 返回值类型：void
	 * 参数列表：int
	 */
	public static void printMultiTable(int a){
		for(int x=1;x<=a;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}
