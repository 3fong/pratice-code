package test33;

import java.util.Set;
import java.util.TreeMap;

/*
 *1�� ȡ��һ���ַ�������ĸ���ֵĴ������磺�ַ�����"abcdekka27qoq" ��
 * �����ʽΪ��a(2)b(1)k(2)...
	������
		��ĸ�ʹ������ж�Ӧ��ϵ��ʹ��map���ϣ���ĸ������TreeMap
		�ַ���ת�����飬��ȡ�ַ���map������ȡ��Ӧ��ֵ�������ϸ���ֵ��ֵ���ǳ��ִ���
		ֻҪ�ַ�����Ҫ���ַ�����map���ϵļ������ж�
		���ַ���������ȱ�������ʽ
 */
public class T1GetNum {

	public static void main(String[] args) {
		String s = "abcdekka27qoq";
		String str = show(s);
		System.out.println(str);
	}

	private static String show(String s) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		char[] chs = s.toCharArray();
		
		int count =0;
		for(char c : chs){
			if(Character.isLowerCase(c)||Character.isUpperCase(c)){
				Integer value = tm.get(c);
				if(value!=null)
					count=value;
				count++;
				tm.put(c,count);
				count=0;
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character c : set){
			Integer value = tm.get(c);
			sb.append(c+"("+value+")");
		}
		return sb.toString();
	}

}
