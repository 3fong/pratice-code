package test33;
/*
 *��дһ��������������һ�����������е�ÿ��Ԫ���ö������ӳ�һ���ַ�����
	���磬��������Ϊ[1][2][3]�������γ�����Ϊ"1,2,3"���ַ�����
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
