package io;

import java.util.Arrays;

/*
 * 针对不识别中的编码方式，可以通过两次编码获取正确值
 * 编码：字符串变成字节数组
 * String-->byte[]; str.getBytes(charsetName);
 * 解码：字节数组转成字符串
 * byte[]-->String; new String(byte[],charsetName);
 */
public class EncodeDemo {

	public static void main(String[] args)throws Exception {
		String s = "你好";
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
