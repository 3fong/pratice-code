package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��	
	ѧ����Student
		��Ա������name,age
		���췽�����޲�,����
		��Ա������getXxx()/setXxx()
 */
public class StudentDemo {

	public static void main(String[] args) {
//		objectArray();
		collectionArray();
	}
	public static void collectionArray(){
		Collection<Student> al = new ArrayList<Student>();
		al.add(new Student("zhao",12));
		al.add(new Student("qian",12));
		al.add(new Student("sun",12));
		al.add(new Student("li",12));
		al.add(new Student("han",12));
		
//		for(Iterator<Student> it = al.iterator();it.hasNext();){
//			Student s = it.next();
//			System.out.println(s);
//		}
		
		//����������
		Object[] obj = al.toArray();
		for(int x=0;x<obj.length;x++){
			Student s = (Student)obj[x];
			System.out.println(s.getName()+s.getAge());
		}
	}
	//��������
	public static void objectArray(){
		Student[] stu = new Student[5];
		
		Student s1 = new Student("��",21);
		Student s2 = new Student("Ǯ",21);
		Student s3 = new Student("��",21);
		Student s4 = new Student("��",21);
		Student s5 = new Student("��",21);
		
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		stu[3]=s4;
		stu[4]=s5;
		
		//stu�̳���Object��û����ӷ�����
//		for(int x=0;x<stu.length;x++){
//			stu[x].
//		}
		
		for(int x=0;x<stu.length;x++){
			Student s = stu[x];
//			System.out.println(s.getName()+s.getAge());
			System.out.println(s);//ֱ����������Զ�����toString()������Ҫ��û�и�д�ͻ᷵�ص�ֵַ��
		}
	}
}
