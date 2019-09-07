package String;

/*
 * ��ָ���ַ�����ת��
 * ˼·��
 * 1���ַ����������
 * 2��ת
 * 3������ַ���
 */
public class MyreverseDemo {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(s);
		String m = myReverse(s,1,3);
		System.out.println(m);
	}
	public static String myReverse(String str,int start,int end){
		char[] chs = str.toCharArray();
		
		reverse(chs,start,end);
		return new String(chs);
	}
	private static void reverse(char[] arr,int x,int y){
		for(int start=x,end=y-1;start<end;start++,end--){
			swap(arr,start,end);
		}
	}
	private static void swap(char[] arr,int a,int b){
		char temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
