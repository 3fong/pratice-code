package reflect;
/*
 *
 */
public class Person {
	private String name;
	int age;
	public String address;
	public Person() {
		super();
		
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	private Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void show(){
		System.out.println("show");
	}
	public void method(String s){
		System.out.println("method"+s);
	}
	public String getString(String s,int i){
		return s+"---"+i;
	}
	private void function(){
		System.out.println("function");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
