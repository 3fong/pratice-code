package base;

import java.util.Scanner;

public class Array2Demo2 {

	public static void main(String[] args) {
		//加入手动输入
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		getSingle(num);
	}
	/*
	 * 打印杨辉三角
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * 规律：
	 * 每行收尾为1；
	 * 从第三行开始，中间值为上行值加其前值和；
	 * 等腰三角形，行列相同 
	 */
	public static void getSingle(int a){
		//定义二维数组
		int[][] arr = new int[a][a];
		
		//设置首尾值
		for(int x=0;x<arr.length;x++){
			arr[x][0]=1;
			arr[x][x]=1;
		}
		//设置中间值。从第三行开始，且列数不能是首尾列
		for(int x=0;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
			}
		}
		//遍历输出，因为是等腰，所以跟九九乘法表结构相似。
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
