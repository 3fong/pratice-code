package list;

import java.util.ArrayList;
import java.util.Collection;

/*
 *boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
 * boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
 * boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?ȡ����������� collection ���ڵ��ö��������ģ��򷵻� true
 */
public class CommonMethod {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
//		c.add("abc1");
//		c.add("abc2");
//		c.add("abc3");
		c.add("abc4");
		
		Collection c1 = new ArrayList();
		c1.add("abc4");
		c1.add("abc5");
		c1.add("abc6");
		c1.add("abc7");
		
//		c.addAll(c1);
//		System.out.println(c);
		
		//ֻҪ��Ԫ�ر��Ƴ��ͷ���true			
//		System.out.println(c.removeAll(c1));
//		System.out.println(c);
		
		//ȫ�������ŷ���true��
//		System.out.println(c.containsAll(c1));
		
		//retainAll()����ֵ��ʾc������û�з����仯��
		System.out.println(c.retainAll(c1));
		System.out.println(c);
		System.out.println(c1);
	}

}
