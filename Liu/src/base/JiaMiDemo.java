package base;

import java.util.Scanner;

/*
 * 某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。
	思路：
	1 涉及倒序，可以将数字装入数组，方便操作。
	2 数据小于8位，我么可以定义一个容量为8的数组。
	
 */
public class JiaMiDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		String str = jiaMi(num);
		System.out.println(str);
		s.close();
	}
	public static String jiaMi(int num){
		int[] arr= new int[8];
		
		//将数字装入数组,存入后就是倒序
		int index=0;
		while(num>0){
			arr[index]=num%10;
			index++;
			num/=10;
		}
		for(int x=0;x<index;x++){
			arr[x]+=5;
			arr[x]%=10;
		}
		int temp = arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=temp;
		
		//将数组转成字符串
		String s = "";
		for(int x=0;x<index;x++){
			s+=arr[x];
		}
		return s;
	}
}
