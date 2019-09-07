package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *ConcurrentModificationException:���������쳣
 *����ԭ���ڵ���������ʱ���޸ļ��ϣ���ɵ������޷�ʶ�𼯺�
 *���������
 *		1 �õ������޸�Ԫ�أ���Ԫ���ڵ���Ԫ�غ���
 *		2 ���ϱ���Ԫ�أ���Ԫ���ڼ���ĩβ
 *
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		show1(list);
	}
	public static void show(List list){
		for(ListIterator it = list.listIterator();it.hasNext();){
			String s = (String)it.next();
			if("hello".equals(s)){
				it.add("girl");
			}			
		}
		System.out.println(list);
	}
	public static void show1(List list){
		for(int x=0;x<list.size();x++){
			String s = (String)list.get(x);
			if(s.equals("world")){
				list.add("boy");
			}
		}
		System.out.println(list);
	}
}
