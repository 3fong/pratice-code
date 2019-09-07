package faceObject;
/*
 *	基础班学生： 学习 睡觉
	高级班学生： 学习 睡觉
	可以将这两类事物进行抽取。
 */
abstract class Student1{
	public abstract void study();
	public void sleep(){
		System.out.println("睡觉");
	}
}
class XiaoStudent extends Student1{
	public void sleep(){
		System.out.println("站着睡");
	}
	public void study(){
		System.out.println("一般学");
	}
}
class AdvStudent extends Student1{
	public void sleep(){
		System.out.println("略睡");
	}
	public void study(){
		System.out.println("玩了命学");
	}	
}
//用多态传递引用性参数，方便调用方法
class DoStudent{
	public void doSome(Student1 s){
		s.study();
		s.sleep();
	}
}
public class DuoTaiDemo2 {

	public static void main(String[] args) {
//		Student1 s = new XiaoStudent();
//		s.sleep();
//		s.study();
		
		DoStudent ds = new DoStudent();
		ds.doSome(new XiaoStudent());//Student1 s = new XiaoStudent();
		ds.doSome(new AdvStudent());
	}
}
