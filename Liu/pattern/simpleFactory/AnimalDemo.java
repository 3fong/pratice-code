package simpleFactory;
/*
 *简单工厂模式
	又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例。
	优点：客户端不需要创建对象，从而明确了各个类的职责
	缺点：增加新对象或对象创建方式的改变，都需要修改工厂类，不利于后期的维护。
 */
public class AnimalDemo {

	public static void main(String[] args) {
//		Animal a = new Dog();
//		a.eat();
//		a=new Cat();
//		a.eat();
		
		Animal a = AnimalFactory.createAnimal("Dog");
		a.eat();
		a=AnimalFactory.createAnimal("Cat");
		a.eat();
		
		//java.lang.NullPointerException，调用时需加入判断
		a=AnimalFactory.createAnimal("pig");
		if(a!=null){
			a.eat();
		}else{
			System.out.println("无此对象");
		}
	}

}
