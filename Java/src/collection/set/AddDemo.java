package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *Set�ӿڷ��ࣺ
  |--HashSet:���򡣵ײ���ݽṹ�ǹ�ϣ�?�̷߳�ͬ����
	|--LinkedHashSet���ײ���ݽṹ�ɹ�ϣ���������ɡ�
		��ϣ�?֤Ԫ�ص�Ψһ�ԣ����?֤Ԫ������
  |--TreeSet:�ֵ�˳�򡣵ײ���ݽṹ�Ǻ�������̷߳�ͬ�������Զ�Set�����е�Ԫ�ؽ�������
	HashSet��֤Ԫ��Ψһ��ԭ�?�ж�Ԫ�ص�hashCodeֵ��equals�Ƚ�ֵ�Ƿ���ͬ��
 */
public class AddDemo {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("�¹�Ӣ",23));
		set.add(new Person("��̫��",43));
		set.add(new Person("�¹�Ӣ",23));
		set.add(new Person("������",24));
		for(Iterator<Person> it = set.iterator();it.hasNext();){
			Person p = it.next();
			System.out.println(p.getName()+":==:"+p.getAge());
		}
	}
}
