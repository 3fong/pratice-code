package string;
/*
 *字符串中，返回-1代表被访问字符串中没有标的字符（串）。
 */
public class GetStringDemo {

	public static void main(String[] args) {
		String s = "abcdafg";
//		getStr(s);
//		judgeStr(s);
		otherStr(s);
	}
	//charAt()返回字符 indexOf()返回索引 substring()返回字符串
	public static void getStr(String s){
		char ch = s.charAt(3);
		
		int index = s.indexOf('a');		
		int index1= s.indexOf('a',3);
		
		int index2 =s.indexOf("bc");
		int index3 =s.indexOf("da",2);
		
		//从角标3开始获取剩余字符串
		String str = s.substring(3);
		String str1 =s.substring(4,6);
		sop(str1);
	}
	//判断返回值都是boolean
	public static void judgeStr(String s){
		boolean b1 = s.contains("bcd");
		boolean b2 = s.isEmpty();
		boolean b3 = s.startsWith("a");
		boolean b4 = s.endsWith(".java");
		boolean b5 = s.equals("abfba");
		boolean b6 = s.equalsIgnoreCase("abcDaFg");
		sop(b6);
	}
	//替换replace() 切割split() 比较compareTo()
	public static void otherStr(String s){
		String str1 = s.replace('a','z');
		String str2 = s.replace("abc","lady");
		
		String st = "a.b.c.d";
		String[] strs = st.split("\\.");
		for(int x=0;x<strs.length;x++){
			System.out.println(strs[x]);
		}
		int num = s.compareTo(st);

	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
