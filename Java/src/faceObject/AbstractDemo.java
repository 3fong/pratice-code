package faceObject;
/*
 *创建抽象类实例
 *	不能直接创建抽象类对象，只能通过其子类创建。
 */
abstract class Student{
	public abstract void study();
	void sleep(){
		System.out.println("躺着");
	}
}
class BaseStudent extends Student{
	public void study(){
		System.out.println("学习");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Student s = new BaseStudent();
		s.sleep();
		s.study();
	}
}
