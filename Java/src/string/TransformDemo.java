package string;
/*
 *常见操作：基本数据类型和字符串类型之间的转换。
A:String和StringBuffer相互转换
	String -- StringBuffer
		构造方法、append();
	StringBuffer -- String
		toString()方法、String的构造方法。
B:String和char[]的互换
	String -- char[]
		toCharArray()	
	char[] -- String
		valueOf(char[])、String(char[])构造方法。
C：Arrays类：针对数组操作的工具类
	String toString(int[] arr):把数组转成字符串
	void sort(int[] arr)排序
	int binarySearch(int[] arr,int key):二分查找。

String[] arr -->int[] ints
	字符串转int
	ints[x]=Integer.parseInt(arr[x]);
 */
public class TransformDemo {
	public static void main(String[] args) {
		//String和StringBuffer互换
		String str = "abc";
		StringBuffer sb = new StringBuffer(str);
		sb.append(str);
		System.out.println(sb.toString());
		String s = new String(sb);
		System.out.println(s);
		
		//String和char[]的转换
		String st = "abcde";
		char[] chs = st.toCharArray();
		System.out.println(chs);
		String str1 = new String(chs);
		String str2 = String.valueOf(chs);
		System.out.println(str1+":"+str2);
		//未复写toString方法，返回地址值[C@15db9742
		String str3 = chs.toString();
		System.out.println(str3);
		
		//将String[]转成int[]
		String[] strs = {"121","45","474"};
		int[] is =new int[strs.length];
		for(int x=0;x<strs.length;x++){
			is[x] = Integer.parseInt(strs[x]);
			System.out.print(is[x]+" ");
		}
	}
}
