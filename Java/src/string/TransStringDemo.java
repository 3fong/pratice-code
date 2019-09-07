package string;
/*
 *3.1将字符数数组转成字符串
static String valueOf(char[]);
3.2将字符串转成字符数组
char[] toCharArray();
3.3将字节数组转成字符串
String(byte[]);
String(byte[],offset,count)：将字节数组中的一部分转成字符串。		
3.4将字符串转成字节数组
byte[]  getBytes();
3.5将基本数据类型转成字符串
static String valueOf(int) 
static String valueOf(double) 
3+"";//String.valueOf(3)
特殊：字符串和字节数组在转换过程中是可以指定编码表的。
3.6将字符串转成大写或小写
String toUpperCase();
String toLowerCase();
3.7将字符串两端的多个空格去除
String trim();
3.8将字符串拼接
String concat(String str);
 */
public class TransStringDemo {

	public static void main(String[] args) {
		String s = "abcdefg";
		//String-->char[]
		char ch = s.charAt(0);//遍历可获取字符数组
		char[] chs = s.toCharArray();
		//char[]-->String
		String str1 = new String(chs,0,chs.length);
		String str2 = String.valueOf(chs);
		String str3 = String.copyValueOf(chs);
		
		//String-->byte[]
		byte[] bys = s.getBytes();
		//byte[]-->String
		String str4 = bys.toString();//[B@4dcbadb4
		String str5 = new String(bys);
		
		String str6 = String.valueOf(20);
		String str7 = String.valueOf(true);
		
		String st = "  Hello World   ";
		String str8 = st.toUpperCase();
		String str9 = st.toLowerCase();
		String str10 = st.trim();
		String str11 = s.concat(st);//s+st
		sop(str11);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
