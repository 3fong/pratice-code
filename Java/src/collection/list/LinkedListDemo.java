package collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 *ʹ��LinkedListģ��һ����ջ���߶�����ݽṹ��
��ջ���Ƚ���  ��ͬ���ӡ�
���У��Ƚ��ȳ�  ��ͬˮ�ܡ�
LinkedList:���з�����			JDK1.6���·�����null
	addFirst();//�ȴ��Ϊβ	offerFirst();
	addLast();//�ȴ��Ϊ��		offerLast();
	getFirst();				peekFirst()
	getLast();				peekLast();
	removeFirst();			pollFirst()
	removeLast();			pollLast();
 */
class Dui {
	 LinkedList link;
	Dui(){
		link=new LinkedList();
	}
	public void set(Object o) {
		link.addFirst(o);
	}

	public Object get() {
		return link.removeLast();//�����Ƴ����ѭ������ѭ��
	}

	public boolean isNull() {
		return link.isEmpty();
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {
		Dui d = new Dui();
		d.set("safa");
		d.set("sfa");
		d.set("sa");
		d.set("safa");
		d.set("s");
		while (!d.isNull()) {
			System.out.println(d.get());
		}
		//Dui�ĵײ���LinkedList������ʹ�õ����˽��ʱ������
		for(Object o : d.link){
			String s = (String)o;
			System.out.println(s);
		}
	}
}
