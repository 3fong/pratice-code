package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *��ȡ��ݵķ��������֣�������ͼ�����add�����������ַ�ʽ���ʹ��ʱ���ᷢ�������쳣��
 *list���ϻ�ȡԪ�������ַ�����iterator()��listIterator()��size()��get()һ��ʹ��
 *	�����ַ������Խ��������������
 */
public class BingFaDemo {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		//���Ԫ��
		li.add("java01");
		li.add("java02");	
		li.add("java03"); 
		sop("li="+li);
//		getList1(li);
		getList2(li);
//		getList3(li);
		sop(li);
	}

	private static void getList1(List<String> li) {
		for(Iterator<String> it =li.iterator();it.hasNext();){
			String s = it.next();
			if(s.equals("java02")){
				// public class ConcurrentModificationException extends 
				//RuntimeException ��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣��
				li.add("java007");
				li.remove("java03");
			}
		}
	}
	//listIterator()�������
	private static void getList2(List<String> li) {
		for(ListIterator<String> list = li.listIterator();list.hasNext();){
			String s = list.next();
			if(s.equals("java02")){
				list.add("java007");				
			}else if(list.hasNext()){
				list.remove();//���б����Ƴ��� next �� previous ���ص����һ��Ԫ��
			}
		}
	}
	//size()��get()����������ʣ���Ϊ����ʹ�ü����з���
	private static void getList3(List<String> li) {
		for(int x=0;x<li.size();x++){
			String s = li.get(x);
			if(s.equals("java02")){
				li.add("java007");
				li.remove("java03");
			}
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}	
}
