package string;
/*
 *���������������������ͺ��ַ�������֮���ת����
A:String��StringBuffer�໥ת��
	String -- StringBuffer
		���췽����append();
	StringBuffer -- String
		toString()������String�Ĺ��췽����
B:String��char[]�Ļ���
	String -- char[]
		toCharArray()	
	char[] -- String
		valueOf(char[])��String(char[])���췽����
C��Arrays�ࣺ�����������Ĺ�����
	String toString(int[] arr):������ת���ַ���
	void sort(int[] arr)����
	int binarySearch(int[] arr,int key):���ֲ��ҡ�

String[] arr -->int[] ints
	�ַ���תint
	ints[x]=Integer.parseInt(arr[x]);
 */
public class TransformDemo {
	public static void main(String[] args) {
		//String��StringBuffer����
		String str = "abc";
		StringBuffer sb = new StringBuffer(str);
		sb.append(str);
		System.out.println(sb.toString());
		String s = new String(sb);
		System.out.println(s);
		
		//String��char[]��ת��
		String st = "abcde";
		char[] chs = st.toCharArray();
		System.out.println(chs);
		String str1 = new String(chs);
		String str2 = String.valueOf(chs);
		System.out.println(str1+":"+str2);
		//δ��дtoString���������ص�ֵַ[C@15db9742
		String str3 = chs.toString();
		System.out.println(str3);
		
		//��String[]ת��int[]
		String[] strs = {"121","45","474"};
		int[] is =new int[strs.length];
		for(int x=0;x<strs.length;x++){
			is[x] = Integer.parseInt(strs[x]);
			System.out.print(is[x]+" ");
		}
	}
}
