package string;

/**
 * @author David
 *String的一些方法
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "JavaSE";
		
		byte[] b = s.getBytes();
		for(int x=0;x<b.length;x++){
			System.out.print(b[x]+" ");//74 97 118 97 83 69 
		}
		
		char[] chs = s.toCharArray();
		
		String st = s.valueOf(chs);
		for(int x=0;x<st.length();x++){
			System.out.println(st);
		}
		
		int x=100;
		String str = s.valueOf(x);
		System.out.println(x);
		
		System.out.println(s.toLowerCase()+s.toUpperCase());
		
		System.out.println(s.concat(st));
	}
}
