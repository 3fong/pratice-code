package set;

import java.util.HashSet;

/*
 *����1���洢�ַ���������֤Ԫ��Ψһ��
 *	�����û����д������������Ĭ��ʹ�õ�Object()��һ����˵��ͬ��ͬ��
 * 	��String����д��hashCode()��equals()���������ԣ����Ϳ��԰�������ͬ���ַ���ȥ����ֻ����һ����
 *����2���洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ�ء�
 *  �Զ����Ҫ�Լ���дhashCode()��equals()����
 */
public class HashSetDemo {

	public static void main(String[] args) {
		mySet();
		
		//��ָ���쳣
//		String name = null;
//		System.out.println(name.hashCode());
	}
	public static void stringSet(){
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("hello");
		hs.add("java");
		hs.add("android");
		hs.add("hadoop");
		hs.add("hello");
		hs.add("android");
		hs.add("hadoop");
		
		for(String s : hs){
			System.out.println(s);
		}
	}
	//ʹ��HashSet����Ҫ��дhashCode��equals����������ϵͳĬ�ϰ�Object�еķ�������
	public static void mySet(){
		HashSet<Student> hs = new HashSet<Student>();
		
		hs.add(new Student("����",22));
		hs.add(new Student("���Ѿ�",23));
		hs.add(new Student("��ʩ",27));
		hs.add(new Student("������",24));
		hs.add(new Student("����",22));
		hs.add(new Student("������",24));
		
		for(Student s : hs){
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
