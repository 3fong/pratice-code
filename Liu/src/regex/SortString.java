package regex;

import java.util.Arrays;

/*
 *	��������һ���ַ���:"91 27 46 38 50"
 * 	��д����ʵ�������������ǣ�"27 38 46 50 91"
 * ������
 * 	
 */
public class SortString {

	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		System.out.println(s);
//		String s1 = show(s);
//		System.out.println(s1);
		
		String s1 = show1(s);
		System.out.println(s1);
	}
	public static String show(String s){
		String regex = " ";
		String[] str = s.split(regex);
		
		for(int x=0;x<str.length-1;x++){
			if(str[x].compareTo(str[x+1])>0){
				String str1 = str[x];
				str[x]=str[x+1];
				str[x+1]=str1;
			}
		}
		String s2 = "";
		for(int x=0;x<str.length;x++){
			if(x<str.length-1)
				s2+=str[x]+" ";
			else
				s2+=str[x];
		}
		return s2;
	}
	//��String[]-->int[]����
	public static String show1(String s){
		String regex = " ";
		String[] strings = s.split(regex);
		
		//���ַ���������int����
		int[] arr = new int[strings.length];
		for(int x=0;x<strings.length;x++){
			arr[x] = Integer.parseInt(strings[x]);
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		//������ת���ַ���
		for(int x=0;x<arr.length;x++){
			sb.append(arr[x]+" ");
		}
		String s2 = sb.toString().trim();
		return s2;
	}
}
