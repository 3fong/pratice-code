package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 用TreeSet对自定义元素进行排序。
 * 第二种方式：Comparator、compare
 */
class Student1{
	private String name;
	private int age;
	Student1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
class MyComparator implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2){
//		Student1 s1 = (Student1)obj1;
//		Student1 s2 = (Student1)obj2;
		int num = s1.getName().compareTo(s2.getName());
		if(num==0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		return num;
	}
}
public class MyTreeSetTwo {

	public static void main(String[] args) {
		TreeSet<Student1> ts = new TreeSet<Student1>(new MyComparator());
		
		ts.add(new Student1("lisi",21));
		ts.add(new Student1("lisi",20));
		ts.add(new Student1("liwu",20));
		ts.add(new Student1("liwu",18));
		ts.add(new Student1("liwu",20));
		ts.add(new Student1("liwu",18));
		
		for(Iterator<Student1> it = ts.iterator();it.hasNext();){
			Student1 s = it.next();
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}
}
