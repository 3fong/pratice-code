package test2;
/*
 *
 */
public class ToolDemo {

	public static void main(String[] args) throws Exception {
		Person p =new Person();
		Tool t = new Tool();
		t.setProperty(p,"name","����ϼ");
		t.setProperty(p,"age",27);
		System.out.println(p);
		
		Dog d = new Dog();
		t.setProperty(d,"color","black");
		t.setProperty(d,"price",12.34f);//ע��floatֵҪ�Ӻ�׺
		System.out.println(d);
	}

}
class Dog{
	private String color;
	float price;
	@Override
	public String toString() {
		return "Dog [color=" + color + ", price=" + price + "]";
	}
	
}
class Person{
	private String name;
	int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}