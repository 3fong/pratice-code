package extend;
/*
 * 猫狗案例：
 * 		具体事物：猫狗
 * 		共性：姓名，年龄，吃饭
 * 分析：从具体到抽象
 * 	猫：
 * 		成员变量：姓名，年龄
 * 		构造方法：有
 * 		成员方法：吃饭（吃鱼）
 * 	狗：
 * 		成员变量：姓名，年龄
 * 		构造方法：有
 * 		成员方法：吃饭 （吃骨头）
 * 	抽象类：Animal
 * 		成员变量：姓名，年龄
 * 		构造方法：有
 * 		成员方法：吃饭
 * 	实现：从抽象到具体
 * 		Animal
 * 		Cat
 * 		Dog
 */
abstract class Animal2{
	String name;
	int age;
	Animal2(){}
	Animal2(String name,int age){
		this.name=name;
		this.age=age;
	}
	public abstract void eat();
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
class Cat2 extends Animal2{
	public void eat(){
		System.out.println("吃鱼");
	}	
}
class Dog2 extends Animal2{
	Dog2(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("吃骨头");
	}	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Animal2 a = new Cat2();
		a.setName("tom");
		a.setAge(1);
		System.out.println("姓名："+a.getName()+",年龄："+a.getAge());
		a.eat();
		
		Animal2 a2 = new Dog2("bob",2);
		System.out.println("姓名："+a2.getName()+",年龄："+a2.getAge());
		a2.eat();
	}

}
