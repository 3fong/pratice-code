package collection.test;
/*
 *��fhafajflanlfnLFAJFLA����ȡ���ַ����ĸ���ֵĴ���
	ϣ���ӡ����ǣ�a(1)c(2)....
	������
		��ӡ�����Կ����Ǵ��ڶ�Ӧ��ϵ��ͬʱ����ĸ������TreeMap����
		������count
		
 */

import java.util.Set;
import java.util.TreeMap;

public class GetCount {

	public static void main(String[] args) {
		String s = "fhafa4545jflanl5==fnLFAJFLA";
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		char[] chs = s.toCharArray();
		int count = 0;
		for (char c : chs) {
			// ����ɸѡ��Ϣ
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				Integer value = tm.get(c);
				if (value != null)
					count = value;
				count++;
				tm.put(c, count);
				count = 0;
			}
		}
		// ���̶���ʽ��ӡ
		Set<Character> set = tm.keySet();
		for (Character c : set) {
			Integer value = tm.get(c);
			System.out.print(c + "(" + value + ")");
		}
	}
}
