package extend;

/*
 * 猫狗继承案例
 * 猫特点分析：
 * 	成员变量：姓名，年龄，颜色
 * 	构造函数：无参 带参
 * 	成员方法：吃 咬尾巴
 * 狗特点分析：
 * 	成员变量：姓名，年龄，颜色
 * 	构造函数：无参 带参
 * 	成员方法：吃 看门
 * 父类特点分析：
 * 	成员变量：姓名，年龄，颜色
 * 	构造函数：无参 带参
 * 	成员方法：吃
 */
class Animal{
	private String name;
	private String color;
	Animal(){}
	Animal(String name,String color){
		this.name=name;
		this.color=color;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void eat(){
		System.out.println("吃饭");
	}
}
class Cat extends Animal{
	Cat(){}
	Cat(String name,String color){
		super(name,color);
	}
	public void biteTail(){
		System.out.println("咬尾巴");
	}
}
class Dog extends Animal{
	Dog(){}
	Dog(String name,String color){
		super(name,color);
	}
	public void watchDoor(){
		System.out.println("看家");
	}
}
public class ExtendsDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("bob");
		d.setColor("black");
		System.out.println("名字："+d.getName()+",颜色："+d.getColor());
		
		Dog d2 = new Dog("hanks","white");
		System.out.println("名字："+d2.getName()+",颜色："+d2.getColor());
		d.eat();
		d.watchDoor();
	}
}
