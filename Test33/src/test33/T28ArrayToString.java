package test33;
/*
 *编写一个程序，这个程序把一个整数数组中的每个元素用逗号连接成一个字符串，
	例如，根据内容为[1][2][3]的数组形成内容为"1,2,3"的字符串。
 */
public class T28ArrayToString {

	public static void main(String[] args) {
		int[] arr = {1,2,6,4,5,7,8,15,19};
//		String s = trans(arr);
		String s = trans1(arr);
		System.out.println(s);
	}

	private static String trans(int[] arr) {
		String s = "";
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1)
				s+=arr[x]+",";
			else
				s+=arr[x];
		}
		return s;
	}
	private static String trans1(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1)
				sb.append(arr[x]+",");
			else
				sb.append(arr[x]);
		}
		return sb.toString();
	}
}
