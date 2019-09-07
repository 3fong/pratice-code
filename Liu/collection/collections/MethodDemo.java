package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *Collections:����Լ��Ͻ��в����Ĺ����࣬���Ǿ�̬������
 * 
 * �����⣺
 * Collection��Collections������?
 * Collection:�ǵ��м��ϵĶ���ӿڣ����ӽӿ�List��Set��
 * Collections:����Լ��ϲ����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * Ҫ֪���ķ���
 * public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ˳��
 * public static <T> int binarySearch(List<?> list,T key):���ֲ���
 * public static <T> T max(Collection<?> coll):���ֵ
 * public static void reverse(List<?> list):��ת
 * public static void shuffle(List<?> list):����û�
 */
public class MethodDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(45);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println(list);
		//��Ȼ���� û�з���ֵ
		Collections.sort(list);
		System.out.println(list);
		//[10, 20, 30, 40, 45, 50]
		int index = Collections.binarySearch(list,30);
		System.out.println("index:"+index);
		
		//����ֵ�Ƿ��Ͷ�������
		Integer i = Collections.max(list);
		System.out.println(i.toString());
		
		Collections.reverse(list);
		System.out.println(list);//[50, 45, 40, 30, 20, 10]
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
