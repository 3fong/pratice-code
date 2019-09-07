package stringBuffer;
/*
 * StringBuffer和String的转换
 * Buffer-->String
 * 		toString()、String的构造方法;
 * String-->Buffer
 * 		StringBuffer的构造方法、append();
 */
public class BufferAndString {

	public static void main(String[] args) {
		//Buffer-->String
		//方法一：
		StringBuffer sb = new StringBuffer();
		String s = sb.toString();
		sop("s:"+s);
		//方法二：
		String s2 = new String(sb);
		sop("s2:"+s2);
		
		//String-->Buffer
		//方法一：
		String str = new String();
		StringBuffer sbu = new StringBuffer(str);
		sop("sbu:"+sbu);
		
		//方法二：
		sbu.append(str);
		sop("sbu"+sbu);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
