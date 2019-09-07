package collection;

import java.util.HashSet;
import java.util.Iterator;

//HashSet存储自定义对象

class Person1{
	private String name;
	private int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int hashCode(){
		return name.hashCode()+age*10;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Person1))
			return false;
		Person1 p = (Person1)obj;
		return this.name.equals(p.name)&&this.age==(p.age);
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class MyHashCode {

	public static void main(String[] args) {
		HashSet<Person1> hs = new HashSet<Person1>();
		
		hs.add(new Person1("lisi",20));
		hs.add(new Person1("liwu",20));
		hs.add(new Person1("lisi",20));
		hs.add(new Person1("lisi",22));
		
		for(Iterator<Person1> it = hs.iterator();it.hasNext();){
			Person1 p = it.next();
			System.out.println(p.getName()+"...."+p.getAge());
		}
	}

}
