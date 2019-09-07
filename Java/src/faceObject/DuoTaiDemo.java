package faceObject;
/*
1 多态的表现：父类的引用指向类自己的子类对象；父类的引用也可接收自己的子类对象。
2 多态的前提：类与类之间必须有关系，要么继承、要么实现；通常还有一个前提：存在覆盖。
3 优点：扩展性；维护性； 缺点：父类无法访问子类方法
 */
abstract class Animal{
	public abstract void eat();
}
class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void play(){
		System.out.println("抓老鼠");
	}
}
public class DuoTaiDemo {

	public static void main(String[] args) {
		//多态，向上转型
		Animal a = new Cat();
		a.eat();
		//向下转型，使用自己特有方法
		Cat c = (Cat)a;
		c.play();
	}

}
