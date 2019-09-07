package string;
/*
 *3.1���ַ�������ת���ַ���
static String valueOf(char[]);
3.2���ַ���ת���ַ�����
char[] toCharArray();
3.3���ֽ�����ת���ַ���
String(byte[]);
String(byte[],offset,count)�����ֽ������е�һ����ת���ַ�����		
3.4���ַ���ת���ֽ�����
byte[]  getBytes();
3.5��������������ת���ַ���
static String valueOf(int) 
static String valueOf(double) 
3+"";//String.valueOf(3)
���⣺�ַ������ֽ�������ת���������ǿ���ָ�������ġ�
3.6���ַ���ת�ɴ�д��Сд
String toUpperCase();
String toLowerCase();
3.7���ַ������˵Ķ���ո�ȥ��
String trim();
3.8���ַ���ƴ��
String concat(String str);
 */
public class TransStringDemo {

	public static void main(String[] args) {
		String s = "abcdefg";
		//String-->char[]
		char ch = s.charAt(0);//�����ɻ�ȡ�ַ�����
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
