package base;

import java.util.Scanner;

/*
 *某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。
	难点：怎么把整数拆开，用取模的方法
 */
public class JiaMi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		jiaMi(num);
	}

	private static void jiaMi(int num) {
		int[] arr= new int[8];	
		//通过角标，将取余的数存入数组，因为从个位开始存，本身数据就变成倒序
		int index=0;
		while(num>0){
			arr[index] = num%10;
			index++;
			num/=10;
		}
		//加5，模10
		for(int x=0;x<index;x++){
			arr[x]+=5;
			arr[x]%=10;
		}
		int temp = arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=temp;
		
		//打印数据
		for(int x=0;x<index;x++){
			System.out.print(arr[x]);
		}
	}
}
