package integer;
/*
 *3.1十进制转成其他进制：
	Integer.toString(String,radix)
	toBinaryString();
	toHexString();
	toOctalString();
3.2其他进制转成十进制：
Integer.parseInt(String,radix);radix:要转的进制数，String：标的字符串。
 */
public class BinaryHex {

	public static void main(String[] args) {
		sop(Integer.toBinaryString(100));
		sop(Integer.toHexString(100));
		sop(Integer.toOctalString(100));
		
		//十进制转其他进制
		sop(Integer.toString(100,2));
		sop(Integer.toString(100,8));
		sop(Integer.toString(100,16));
		
		//其他进制转十进制，注意数据类型是字符串
		sop(Integer.parseInt("1100100",2));
		sop(Integer.parseInt("64",16));
		sop(Integer.parseInt("144",8));
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
