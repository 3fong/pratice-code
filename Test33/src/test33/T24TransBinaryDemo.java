package test33;

import java.util.Scanner;

/*
 *�Ӽ��̽���һ������,�����ʮ���Ƶ�����ת���ɶ����Ʋ����������̨,������"end"ʱ,����.
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
