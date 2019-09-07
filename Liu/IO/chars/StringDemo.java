package chars;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *String(byte[] bytes, String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "美女";
		//编码 将字符串转成字节数组
//		byte[] by = s.getBytes("GBK");//[-61, -64, -59, -82]
		
		byte[] by = s.getBytes("utf-8");//[-25, -66, -114, -27, -91, -77]
		//将字节数组转成字符串
		System.out.println(Arrays.toString(by));
		
		//解码 将字节数组转成字符串
		String str = new String(by,"utf-8");
		System.out.println(str);
		
		//当编码无误，解码时是不识别中文的编码表时，可以通过再编码获取正确字节数组。
//		String str = new String(by,"ISO8859-1");
//		System.out.println(str);
//		byte[] by2 = str.getBytes("ISO8859-1");
//		System.out.println(Arrays.toString(by));
//		
//		String str2 = new String(by2,"utf-8");
//		System.out.println(str2);		
	}

}
