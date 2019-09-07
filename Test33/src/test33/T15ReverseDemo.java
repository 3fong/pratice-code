package test33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *��Ŀ����д����ѭ�������û��Ӽ����������ַ�����
 * ֱ�����롰end��ʱѭ������������������������ַ������ֵ�˳�����ӡ��
 * ������
 * 		�洢�ַ������������ӡ��û�ж�Ӧ��ϵ����TreeSet
 * 		����һ��ֱ�ӽ���һ����ת�Ƚ���
 * 		��������ת��list���ϣ���reverse������
 */
public class T15ReverseDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		
		while(true){
			String str = s.nextLine();
			if(str.equals("end"))
				break;
			ts.add(str);
		}
		
//		for(String st : ts){
//			System.out.println(st);
//		}
		printString1(ts);
	}

	private static void printString1(TreeSet<String> ts) {
		List<String> list = new ArrayList<String>();
		
		list.addAll(ts);
		
		Collections.reverse(list);
		for(String st : list){
			System.out.println(st);
		}
	}
}
