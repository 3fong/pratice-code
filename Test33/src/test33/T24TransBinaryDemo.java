package test33;

import java.util.Scanner;

/*
 *从键盘接受一个数字,将这个十进制的数字转换成二进制并输出到控制台,当输入"end"时,结束.
 */
public class T24TransBinaryDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			String str = s.nextLine();
			if(str.equals("end"))
				break;
			int num = Integer.parseInt(str);
//			String binary = Integer.toBinaryString(num);
			String binary = Integer.toString(num,16);
			System.out.println(binary);
		}
	}

}
