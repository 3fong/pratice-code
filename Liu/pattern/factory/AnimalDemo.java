package factory;
/*
 *B 工厂方法模式
	抽象工厂类负责定义创建对象的接口，具体对象的创建工作有继承抽
		象工厂的具体类实现。
	优点：明确各类的具体职责，新对象的增加只需增加具体类和具体的工厂类，
		不用修改已有代码，易于维护，增强了系统的扩展性。
	缺点：需写的代码增多，增加了工作量。
 */
public class AnimalDemo {

	public static void main(String[] args) {
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();
		
		f = new CatFactory();
		a=f.createAnimal();
		a.eat();
	}

}
