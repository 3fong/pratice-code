package test33;
/*
 *
 */
public class T30StringDemo {

	public static void main(String[] args) {
		String s = "welcome";
		String str = JiaMi(s);
		System.out.println(str);
	}

	private static String JiaMi(String s) {
		StringBuilder sb = new StringBuilder();
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length-1;x++){
//			chs[x] = (char)(chs[x]+3);
			chs[x]+=3;
			sb.append(chs[x]);
		}
		sb.insert(0,chs[chs.length-1]);
		return sb.toString();
	}

}
