package new5;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *? ͨ���:�����Ϊռλ���������ڶ��巺��δ��ȷ�����͡�
	3.4.1���͵ĸ߼�Ӧ��
	�����޶� ���ã����ڹ�����չ��
	�� extends E���ɽ���E���ͻ�E�������͡� ���ޡ�
	�� super E:�ɽ���E���ͻ�E�ĸ����͡� ���ޡ�
 */
public class LimitGenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(5);
		al1.add(6);

		printList(al);
	}

	// ��������Ҫ�����ķ��������������ʱ��֪Ҫʹ����һ�����Ϳ�����"?"��ռλ
	private static <T> void printList(ArrayList<T> al) {
		for (Iterator<T> it = al.iterator(); it.hasNext();) {
			// System.out.println(it.next());//Object obj = it.next();
			T t = it.next();// ? �޷�ʹ�����͵����з�����
			System.out.println(t);
		}
	}

}
