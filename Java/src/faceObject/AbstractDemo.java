package faceObject;
/*
 *����������ʵ��
 *	����ֱ�Ӵ������������ֻ��ͨ�������ഴ����
 */
abstract class Student{
	public abstract void study();
	void sleep(){
		System.out.println("����");
	}
}
class BaseStudent extends Student{
	public void study(){
		System.out.println("ѧϰ");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Student s = new BaseStudent();
		s.sleep();
		s.study();
	}
}
