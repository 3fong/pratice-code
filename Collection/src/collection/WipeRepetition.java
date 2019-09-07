package collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 去除重复人的信息。姓名、年龄相同视为重复
 * 思路： 
 * 1 将姓名、年龄封装成Person对象，定义Person方法
 * 2 复写equals方法，建立比较方式
 * 3 将对象添加进集合，创建新集合进行筛选相同对象
 */

class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		return this.name.equals(p.name)&&this.age==(p.age);
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class WipeRepetition{
	public static void main(String[] args){
		ArrayList<Person> al = new ArrayList<Person>();
		
		al.add(new Person("lisi",20));
		al.add(new Person("liwu",20));
		al.add(new Person("lisi",20));
		al.add(new Person("lisi",21));
		
		for(Iterator<Person> it = al.iterator();it.hasNext();){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"..."+p.getAge());
		}
		System.out.println("-----------------------");
		al=myWipe(al);
		
		for(Iterator<Person> it = al.iterator();it.hasNext();){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"..."+p.getAge());
		}
	}
	public static ArrayList<Person> myWipe(ArrayList<Person> al){
		ArrayList<Person> newA = new ArrayList<Person>();
		for(Iterator<Person> it = al.iterator();it.hasNext();){
			Person p = it.next();
			if(!newA.contains(p))
				newA.add(p);
		}
		return newA;
	}
}
