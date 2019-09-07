package collection.list;

import java.util.Enumeration;
import java.util.Vector;

/*
 *Enumeration��ö�پ���Vector���е�ȡ����ʽ��ö�ٺ͵����һ��
 *Vector:�ײ���������ݽṹ���߳�ͬ����Vector���20���������飬���ǽ��˷ѿռ䡣��ArrayList���
 *��Ϊö�ٵ���ƺͷ������̫���������ȡ���ˡ�IO�кϲ������õ�ö�١�
 *Vector�����й��ܣ�
 * 1����ӹ���
 * 		public void addElement(Object obj)		--	add()
 * 2����ȡ����
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 */
public class EnumDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		for(Enumeration<String> en = v.elements();en.hasMoreElements();){
			String s = en.nextElement();
			System.out.println(s);
		}
	}

}
