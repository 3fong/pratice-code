package collection;

import java.util.Map;
import java.util.TreeMap;

/*
 * ��ȡ�ַ�������ĸ���ֵĴ���
 * ˼·��
 * 1 ���ַ���ת�����ַ����飬��ΪҪ��ÿһ����ĸ���в���
 * 2 ����һ��map���ϣ���Ϊ��ӡ��˳��ʹ��treemap
 * 3 �����ַ�����
 * 		��ÿһ���ַ���Ϊ��ȥ��map����
 * 		�������null��������ĸ��1����map����
 * 		������ز���null��˵������ĸ��map�����Ѿ����ڲ��ж�Ӧ����
 * 		��ô�ͻ�ȡ�ô���������������Ȼ�󽫸���ĸ��������Ĵ������뵽map�����У����ǵ���ԭ�������Ӧ��ֵ��
 * 4 ��map�����е����ݱ��ָ�����ַ����γɷ��ء�
 */

public class MapTest {

	public static void main(String[] args) {
		String s = "afajAFJALJF0LJLKE8";

		System.out.println(getCount(s));
	}
	public static String getCount(String str){
		char[] chs = str.toCharArray();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		int count=0;
		for(int x=0;x<chs.length;x++){
			if(!(chs[x]>='a'&&chs[x]<='z'||chs[x]>='A'&&chs[x]<='Z'))
				continue;

			Integer value = tm.get(chs[x]);
			if(value!=null)
				count=value;
			count++;
			tm.put(chs[x],count);
			count = 0;
		}
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Character,Integer> me : tm.entrySet()){
			sb.append(me.getKey()+"("+me.getValue()+")");
		}
		return sb.toString();
	}
}
