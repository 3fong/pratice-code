package src;

import java.util.Set;
import java.util.TreeMap;

/*
 *�����ldkafskgha����������ĸ���ֵĴ��������ʽΪ��l(1)d(1)����
 *������
 *		���ַ���ת���ַ����飬���뼯��
 *		��ĸ�����־��ж����ϵ����Map����Ҫ������TreeMap
 *		����������������ַ����飬��ֵͨ�����ϵ�get����Ϊ��������ֵ
 *		�������Ǿ���ֵ���õ��ַ�������
 */
public class GetNum {

	public static void main(String[] args) {
		String s = "ldkafskgha";
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		char[] chs = s.toCharArray();
		
		int count = 0;
		for(char c : chs){
			Integer value = tm.get(c);
			if(value!=null)
				count=value;
			count++;
			tm.put(c, count);
			count=0;
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character c : set){
			Integer value = tm.get(c);
			sb.append(c+"("+value+")");
		}
		System.out.println(sb.toString());
	}

}
