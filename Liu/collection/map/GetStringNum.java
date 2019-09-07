package map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 *���� ��"aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
 *������
 *		�ַ��ʹ������ɿ�����ֵ��Ӧ��ϵ��ʹ��Map���ϣ���Ҫ������TreeMap
 *		TreeMap�ļ�ֵ��Ӧ�����ַ�������
 *		���������
 *		����ֵ�жϣ���Ϊnull��ֵΪ1��
 *				����Ϊnull��ֵ+1
 *		�������StringBuilder�����ʽ		
 */
public class GetStringNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String s = show1(str);
		System.out.println(s);
	}
	public static String show(String s){
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] chs = s.toCharArray();
//		for(int x=0;x<chs.length;x++){
//			char ch = chs[x];
		
		for(char ch : chs){
			Integer i = tm.get(ch);
			if(i==null){
				tm.put(ch,1);
			}else{
				i++;
				tm.put(ch,i);
				
			}
		}
		StringBuilder sb = new StringBuilder();
		
		Set<Character> keySet = tm.keySet();
		for(Character c : keySet){
			Integer i = tm.get(c);
			sb.append(c+"("+i+")");
		}
		return sb.toString();
	}
	public static String show1(String s){
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] chs = s.toCharArray();
		int count=0;
		for(char ch : chs){
			Integer i = tm.get(ch);
			
			//�����������ɸѡ��Ϣ����ȡ���ȡֵ��Χ���ų�����Ҫ��Ϣ
//			if(!(ch>='a'&& ch<='z' || ch>='A' && ch<='Z'))
//				continue;
			if(i!=null)
				count=i;
			count++;
			tm.put(ch,count);
			count=0;
		}
		
		StringBuilder sb = new StringBuilder();
		
		Set<Map.Entry<Character,Integer>> entrySet = tm.entrySet();
		for(Map.Entry<Character,Integer> me : entrySet){
			Character cha = me.getKey();
			Integer in = me.getValue();
			sb.append(cha+"("+in+")");
		}
		return sb.toString();
	}
}
