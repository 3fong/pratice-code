package string;
/*
 *int类型和String类型的相互转换
 * 
 * int -- String
 * 		String.valueOf(number)
 * 
 * String -- int
 * 		Integer.parseInt(s)
 */
public class IntToString {

	public static void main(String[] args) {
		//int -- String
		int num = 10;
		String s1 = String.valueOf(num);
		String s2 = num+"";
		String s3 = Integer.toString(num);
		System.out.println(s1+":"+s2+":"+s3);
		
		//String -- int
		String str = "23";
		int n1 = Integer.parseInt(str);
		Integer i = new Integer(str);
		int n2 = i.intValue();
		System.out.println(n1+":"+n2);
	}
}
