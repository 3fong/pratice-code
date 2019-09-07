package extend;
/*
 * 定义接口，扩展超级猫狗的跳高功能
 * 分析：具体到抽象
 * 猫：
 * 		成员变量：姓名，颜色
 * 		构造方法：有参，无参
 * 		成员方法：吃饭（鱼）
 * 狗：
 * 		成员变量：姓名，颜色
 * 		构造方法：有参，无参
 * 		成员方法：吃饭（肉）
 * 抽象类：Animal
 * 		成员变量：姓名，颜色
 * 		构造方法：有参，无参
 * 		成员方法：吃饭(抽象)
 * 超级猫：
 * 		跳高。继承自猫
 *interface接口：
 * 		跳高，扩展功能
 * 实现：
 * 		接口
 * 		抽象类Animal
 * 		猫继承Animal
 * 		狗继承Animal
 * 		超级猫继承猫实现接口
 */
interface Jump{
	public abstract void jump();
}
abstract class Animal3{
	private String name;
	private String color;
	Animal3(){}
	Animal3(String name,String color){
		this.name=name;
		this.color=color;
	}
	public abstract void eat();
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
}
class Cat3 extends Animal3{
	Cat3(){}
	Cat3(String name,String color){
		super(name,color);
	}
	public void eat(){
		System.out.println("吃鱼");
	}
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String name,String color){
		super(name,color);
	}
	public void eat(){
		System.out.println("吃肉");
	}
}
class SuperCat extends Cat3 implements Jump{
	public void jump(){
		System.out.println("超级猫变身");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Animal3 a = new Cat3("tom","blue");
		System.out.println("name:"+a.getName()+",color:"+a.getColor());
		a.eat();
		SuperCat sc = new SuperCat();
		sc.setName("tianmao");
		sc.setColor("black");
		System.out.println("name:"+sc.getName()+",color:"+sc.getColor());
		sc.jump();
	}

}
