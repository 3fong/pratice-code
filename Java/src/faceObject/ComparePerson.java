package faceObject;
/*
 *this的应用：调用成员变量
 */
class Person{
	private String name;
	private int age;
	public Person() {
		super();	
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public boolean compare(Person p){
		return this.age==p.age&&this.name.equals(p.name);
	}
}
public class ComparePerson {

	public static void main(String[] args) {
		Person s = new Person("zhang",27);
		Person s1 = new Person("zhang",28);
		boolean flag = s.compare(s1);
		System.out.println(flag);
	}

}
