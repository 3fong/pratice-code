package io.charStream;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 *�ڶ��ַ���Scanner
 */
public class StudentSortDemo2 {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		
		show(ts);
		TreeSet<Student> ts1 = new TreeSet<Student>(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getSum()-o1.getSum();
				if(num==0){
					return o1.getYu()-o2.getYu();
				}
				return num;
			}			
		});
		show(ts1);
	}

	private static void show(TreeSet<Student> ts) {
		Scanner s = new Scanner(System.in);
		for(int x=0;x<5;x++){
			System.out.println("����������");
			String name = s.nextLine();
			System.out.println("���������ĳɼ�");
			String s2 = s.nextLine();
			System.out.println("��������ѧ�ɼ�");
			String s3 = s.nextLine();
			System.out.println("������Ӣ��ɼ�");
			String s4 = s.nextLine();
			
			int yu = Integer.parseInt(s2);
			int math = Integer.parseInt(s2);
			int eng = Integer.parseInt(s2);
			ts.add(new Student(name,yu,math,eng));
		}
		for(Student stu : ts){
			System.out.println(stu.toString());
		}
	}

}
