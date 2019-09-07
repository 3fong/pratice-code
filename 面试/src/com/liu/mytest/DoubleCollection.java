package com.liu.mytest;

import java.util.ArrayList;

/*
 *���ϵ�Ƕ�ױ���
 *�ü��ϱ�������༶����ѧ�����
 *������
 *		�༶�Ƕ����ü��ϴ�
 *		ѧ��Ҳ�Ƕ�����Ӧ���ڰ༶�У�������Ƕ�ױ���
 */
public class DoubleCollection {

	public static void main(String[] args) {
		//�洢�༶����ļ��� ѧУ
		ArrayList<ArrayList<Student>> arrAl = new ArrayList<ArrayList<Student>>();
		
		//�洢ѧ�����ļ��� �༶һ
		ArrayList<Student> stuAl = new ArrayList<Student>();
		
		stuAl.add(new Student("�仨",18));
		stuAl.add(new Student("��С��",19));
		stuAl.add(new Student("�䴺��",17));
		
		//�洢ѧ�����ļ��� �༶��
		ArrayList<Student> stuAl1 = new ArrayList<Student>();
		
		stuAl1.add(new Student("��",18));
		stuAl1.add(new Student("С��",19));
		
		//�洢ѧ�����ļ��� �༶��
		ArrayList<Student> stuAl2 = new ArrayList<Student>();
		
		stuAl2.add(new Student("����",18));
		stuAl2.add(new Student("����",19));
		stuAl2.add(new Student("����",17));
		stuAl2.add(new Student("����",17));
		
		//��ѧУ�м���༶
		arrAl.add(stuAl);
		arrAl.add(stuAl1);
		arrAl.add(stuAl2);
		
		for(ArrayList<Student> al : arrAl){
			for(Student s : al){
				System.out.println(s.getName()+":"+s.getAge());
			}
		}
	}

}
