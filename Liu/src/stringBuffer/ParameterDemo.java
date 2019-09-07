package stringBuffer;
/*
 * 形式参数：
 * 		基本类型：形式参数的改变不影响实际参数
 * 		引用类型：形式参数的改变直接影响实际参数
 * 
 * String作为参数传递
 * StringBuffer作为参数传递 
 * 注意：
 * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
 */
public class ParameterDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1+s2);
		stringParam(s1,s2);
		System.out.println(s1+s2);
		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
//		System.out.println(sb1.toString()+sb2.toString());
		//StringBuffer可以直接输出
		System.out.println(sb1);
		System.out.println(sb1+"---"+sb2);
		bufferParam(sb1,sb2);
		System.out.println(sb1+"---"+sb2);
	}
	public static void stringParam(String s1,String s2){
		s1=s2;
		s2=s1+s2;
	}
	public static void bufferParam(StringBuffer sb1,StringBuffer sb2){
		sb1=sb2;
		sb2.append(sb1);
	}
}
