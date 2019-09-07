package stringBuffer;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		
		//sb添加字符串并赋值给另一个缓冲区，它们指向同一个对象
		StringBuffer sb2 = sb.append("world");
		sop("sb:"+sb);
		sop(sb==sb2);
		
		sb2.insert(5,"java");
		sop("sb:"+sb);
		sop(sb==sb2);
		
		sb.deleteCharAt(3);
		sop("sb:"+sb);
		
		sb.delete(0,4);
		sop("sb:"+sb);
		
		//replace(int,int,String);
		sb.replace(0,4,"hello");
		sop("sb:"+sb);
		
		sb2.reverse();
		sop(sb2);
		
		//substring(int)
		//substring(int,int)
		String s = sb2.substring(0,5);
		sop(s);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
