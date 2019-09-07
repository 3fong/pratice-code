package reflect;
/*
 *
 */
public class Person {
	private String name;
	static int age;
	public static String address;
	public Person() {
		System.out.println("Person is run");		
	}
	private Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static void show(){
		System.out.println("show");
	}
	void show(String name){
		System.out.println("name.....");
	}
	private String getName(){
		System.out.println("请接收返回值");
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
