package extend;
/*
 * �����౾���޷�ʵ��������ͨ����̬��ʽ������ʵ����
 *abstract���ܺ���Щ�ؼ��ֹ���?
	private	��ͻ
	final	��ͻ	
	static	������
	����Ĺ���ֵ��һ�������ͬʱʹ�á� 
 */
abstract class Animal1{
	private static int num = 10;
	public abstract void show();
	public static int getNum(){
		return num;
	}
}
abstract class Ca1t extends Animal1{}

class Dog1 extends Animal1{
	public void show(){
		System.out.println("kongfu");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Animal1 a = new Dog1();
		a.show();
		int num = a.getNum();
		System.out.println(num);
	}

}
