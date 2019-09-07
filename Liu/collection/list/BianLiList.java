package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
 *List�ı��������ַ������Լ���������
 */
public class BianLiList {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		Student s1 = new Student("������",80);
		Student s2 = new Student("�Ŵ�ɽ",30);		
		Student s4 = new Student();
		s4.setName("�־���");
		s4.setAge(40);
		
		list.add(s1);
		list.add(s2);
		list.add(new Student("���޼�",10));
		list.add(s4);
//		show(list);
		
		show1(list);
//		show(list);
	}
	//��õķ���Iterator()
	public static void show(List list){
		for(Iterator it = list.iterator();it.hasNext();){
			Student s = (Student)it.next();
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
	//listItetator()��������������쳣 ���Ƚ��ַ�������Զ������Ҫ��дequals����
	//����equals��Object�еģ�ֻ��Ƚϵ�ֵַ��
	public static void show1(List list){
		for(ListIterator it = list.listIterator();it.hasNext();){
			Student s = (Student)it.next();
			if(s.equals(new Student("���޼�",10))){
				it.add(new Student("����",8));
			}			
		}
		show(list);
	}
	//for��get(),�������Ԫ�أ�������������쳣�ĵڶ��ַ�����
	public static void show2(List list){
		for(int x=0;x<list.size();x++){
			Student s = (Student)list.get(x);
			if(s.equals(new Student("���޼�",10))){
				list.add(new Student("����",8));
			}
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
	public static void show3(List list){
		Object[] obj = list.toArray();
		for(int x=0;x<obj.length;x++){
			Student s = (Student)obj[x];
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
