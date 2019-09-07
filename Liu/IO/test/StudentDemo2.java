package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import test2.Man;

/*
 *����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 *�ڶ�������
 *		�ȵ�һ�ַ���ԭ��򵥺ܶ࣬Ҳδ�漰�����ת��
 */
public class StudentDemo2 {

	public static void main(String[] args) throws IOException {
		Set<Student> ss = getInfo();
		outInfo(ss);
	}
	public static Set<Student> getInfo(){		
		Set<Student> ss = new TreeSet<Student>(new Comparator<Student>(){
			public int compare(Student s1,Student s2){
				int num = s2.getSum()-s1.getSum();
				if(num==0){
					return s1.getName().compareTo(s2.getName());
				}
				return num;
			}
		});
		
		//java.util.InputMismatchException
		for(int x=1;x<=5;x++){
			Scanner s = new Scanner(System.in);
			System.out.println("������ѧ��������");
			String name = s.nextLine();
			System.out.println("���������ĳɼ�");
			int ch = s.nextInt();
			System.out.println("��������ѧ�ɼ�");
			int math = s.nextInt();
			System.out.println("������Ӣ��ɼ�");
			int egn = s.nextInt();
			
			
			Student stu = new Student();
			stu.setName(name);
			stu.setCh(ch);
			stu.setMath(math);
			stu.setEgn(egn);
//			
//			Student stu = new Student(name,ch,math,egn);
			ss.add(stu);
		}		
		return ss;
	}
	public static void outInfo(Set<Student> ss) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\stu3.txt"));
		
		for(Student s : ss){
			bw.write(s.toString()+"\t");
			bw.write(Integer.toString(s.getSum()));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
