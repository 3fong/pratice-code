package collection.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*
 *������TreeSet�����д洢�Զ������ѧ����ѧ��������������
	��Ȼ������Ԫ������߱��Ƚ��ԡ�Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo������
	�Ƚ��������ü�������߱��Ƚ���.����һ���࣬ʵ��Comparator�ӿڣ�����compare������
	�����������Ϊ����ݸ�TreeSet���ϵĹ��캯��
	���ַ��������ڣ�Ԫ�����?�߱��Ƚ��Ի򲻾߱��Լ�����ıȽ��ԡ�
	�����ַ�ʽ������ʱ���ԱȽ���Ϊ����
 */
public class SortPerson {
	public static void main(String[] args) {
		//Person���Ѿ��߱��˱Ƚ��ԣ������ñȽ�������
		TreeSet<Person> ts = new TreeSet<Person>(Collections.reverseOrder(new MyComparator()));
		ts.add(new Person("����",15));
		ts.add(new Person("��",14));
		ts.add(new Person("��ʦʦ",12));
		ts.add(new Person("����",12));
		for(Person p : ts){
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
class MyComparator implements Comparator<Person>{
	public int compare(Person s1,Person s2){
		int num= s1.getName().length()-s2.getName().length();
		if(num==0){
			return s1.getAge()-s2.getAge();
		}
		return num;
	}
}