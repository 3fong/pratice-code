package simpleFactory;
/*
 *简单工厂模式：
 *	将创建对象独立封装成一个类，这样测试方法只负责调用，不用创建
 */
public class AnimalFactory {
	//加入静态，可以直接用类名调用；返回Animal，用多态扩展功能，简化代码
	public static Animal createAnimal(String type){
		if("Dog".equals(type)){
			return new Dog();
		}else if("Cat".equals(type)){
			return new Cat();
		}else{
			return null;
		}
	}
}
