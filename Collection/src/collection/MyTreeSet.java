package collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * ͨ��TreeSet���ϸ��Զ���Ԫ������
 * ��һ�ַ�ʽ����Ȼ����Comparable��compareTo
 */

class Student implements Comparable<Student>{
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student s){
//		if(!(obj instanceof Student))
//			throw new RuntimeException("���Ͳ�ƥ��");
//		Student s = (Student)obj;
		if(this.age>s.age)
			return 1;
		if(this.age==s.age){
			return this.name.compareTo(s.name);
		}
		else
			return -1;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class MyTreeSet {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(new Student("lisi",22));
		ts.add(new Student("lisi",21));
		ts.add(new Student("liwu",22));
		ts.add(new Student("liwu",21));
		ts.add(new Student("liwu",21));
		
		for(Iterator<Student> it = ts.iterator();it.hasNext();){
			Student s = it.next();
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

}
