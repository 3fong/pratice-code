package test33;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * һ��ArrayList����aList�д������ɸ��ַ���Ԫ�أ�
 *  ����������ArrayList����ɾ����������ֵΪ"abc"���ַ���Ԫ�أ�
	������
		�ж��ַ����Ƿ������contains
		�ѵ�ֱ��ʹ��Iterator�������޸�ʱ���ڲ��������쳣
		���������ListIterator  ��ͨforѭ��
 */
public class T16DelectList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("fadf");
		al.add("abc");
		al.add("af");
		al.add("abc");
		
		System.out.println(al);
		method1(al);
//		method2(al);		
		System.out.println(al);
	}
	private static void method1(ArrayList<String> al) {
		for(ListIterator<String> li = al.listIterator();li.hasNext();){
			String s = li.next();
			if(s.contains("abc"))
				li.remove();
		}
		for(String s : al){
			System.out.println(s);
		}
	}
	private static void method2(ArrayList<String> al) {
		for(int x=0;x<al.size();x++){
			String s = al.get(x);
			if(s.equals("abc"))
				al.remove(s);
		}
	}
}
