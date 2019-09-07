package new5;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *泛型限定 作用：用于功能扩展。
	？ extends E：可接收E类型或E的子类型。 上限。
	？ super E:可接收E类型或E的父类型。 下限。
 */
class Person{
	private String name;
	Person(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class Student extends Person{
	Student(String name){
		super(name);
	}
}
public class LimitGenericDemo2 {

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();

		al.add(new Person("abc1"));
		al.add(new Person("abc2"));
		al.add(new Person("abc3"));

		printColl(al);

		ArrayList<Student> al1 = new ArrayList<Student>();

		al1.add(new Student("abc---1"));
		al1.add(new Student("abc---2"));
		al1.add(new Student("abc---3"));

		printColl(al1); 
	}
	private static void printColl(ArrayList<? super Student> al) {
		for(Iterator<? super Student> it =al.iterator();it.hasNext();){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
