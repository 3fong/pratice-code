package String;

public class MyTirm {

	public static void main(String[] args) {
		String s ="   afa  afaf   ";
		System.out.println("("+s+")");
		String t =tirmMy(s);
		System.out.println("("+t+")");
	}
	public static String tirmMy(String str){
		int start=0,end=str.length()-1;
			while(start<=end&&str.charAt(start)==' ')
				start++;
			while(start<=end&&str.charAt(end)==' ')
				end--;
		return str.substring(start,end+1);
	}
}
