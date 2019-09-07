package stringBuffer;
/*
 * 把数组拼接成一个字符串
 */
public class ArrayToString {

	public static void main(String[] args) {
		int[] arr = {1,2,45,3,4,5};
		String s = stringTo(arr);
		System.out.println("s:"+s);
		
		String s2 = bufferTo(arr);
		System.out.println("s2:"+s2);
	}
	public static String stringTo(int[] arr){
		String s = "[";
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1){
				s+=arr[x]+",";
			}
			else{
				s+=arr[x]+"]";
			}
		}
		return s;
	}
	public static String bufferTo(int[] arr){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1){
				sb.append(arr[x]+",");
			}
			else{
				sb.append(arr[x]+"]");
			}
		}
		return sb.toString();
	}
}
