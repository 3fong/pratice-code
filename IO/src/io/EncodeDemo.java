package io;

import java.util.Arrays;

/*
 * ��Բ�ʶ���еı��뷽ʽ������ͨ�����α����ȡ��ȷֵ
 * ���룺�ַ�������ֽ�����
 * String-->byte[]; str.getBytes(charsetName);
 * ���룺�ֽ�����ת���ַ���
 * byte[]-->String; new String(byte[],charsetName);
 */
public class EncodeDemo {

	public static void main(String[] args)throws Exception {
		String s = "���";
		byte[] b = s.getBytes("GBK");
		
		System.out.println(Arrays.toString(b));
		
		String s1 =new String(b,"ISO8859-1");
		System.out.println(s1);
		byte[] b1 = s1.getBytes("ISO8859-1");
		System.out.println(Arrays.toString(b));
		String s2 = new String(b1,"GBK");
		System.out.println(s2);
	}

}
