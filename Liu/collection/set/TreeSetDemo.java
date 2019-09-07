package set;

import java.util.Comparator;
import java.util.TreeSet;

/*
 *TreeSet�����ص㣺���� Ψһ
 *1 ��Ȼ����  
 *	���巽ʽ��ʵ��Comaparable ��дcompareTo()����
 *2 �Ƚ�������
 *	���巽ʽ��ʵ��Comparator ��дcompare()����
 *���ֱȽϷ�ʽ����
 *	��Ȼ��������Ԫ�ؾ߱��Ƚ��ԣ�Ĭ��������ֵ�˳���ţ�
 *	�Ƚ��������ü��Ͼ߱��Ƚ��ԡ�
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		show2();
	}
	public static void show(){
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person("��ѧ��",50));
		ts.add(new Person("���»�",51));
		ts.add(new Person("�Ź���",30));
		ts.add(new Person("���ǳ�",54));
		ts.add(new Person("��ѧ��",50));
		ts.add(new Person("���»�",51));
		
		for(Person p : ts){
			System.out.println(p.getName()+p.getAge());
		}
	}
	public static void show1(){
		//�Ƚ���������ͨ��TreeSet�Ĺ��췽������
		TreeSet<Person> ts = new TreeSet<Person>(new MyComparator());
		
		ts.add(new Person("��ѧ��",50));
		ts.add(new Person("��Ǯ",56));
		ts.add(new Person("����",51));
		ts.add(new Person("�Ź�����",30));
		ts.add(new Person("��",54));
		ts.add(new Person("��ѧ��",50));
		ts.add(new Person("���»�����",51));
		
		for(Person p : ts){
			System.out.println(p.getName()+p.getAge());
		}
	}
	//��һ����ʹ�ñȽ�������ʱ����ͨ�������ڲ���ķ�������㻹��ʡ�ڴ�
	public static void show2(){
		//�Ƚ���������ͨ��TreeSet�Ĺ��췽������
		TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>(){
			public int compare(Person p1 ,Person p2){
				int num = p1.getName().compareTo(p2.getName());
				if(num==0){
					int num1 = p1.getName().length()-p2.getName().length();
					if(num1==0){
						return p1.getAge()-p2.getAge();
					}
				}
				return num;
			}
		});
		
		ts.add(new Person("��ѧ��",50));
		ts.add(new Person("��Ǯ",56));
		ts.add(new Person("����",51));
		ts.add(new Person("�Ź�����",30));
		ts.add(new Person("��",54));
		ts.add(new Person("��ѧ��",50));
		ts.add(new Person("���»�����",51));
		
		for(Person p : ts){
			System.out.println(p.getName()+p.getAge());
		}
	}
}
