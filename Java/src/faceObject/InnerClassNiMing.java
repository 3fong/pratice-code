package faceObject;
/*
 *�����ڲ��ࣺ�Ǿֲ��ڲ���ļ���ʽ�����������������õ����Ρ�
 *1 �����ڲ�����ʵ�����ڲ���ļ�д��ʽ
	2 ���������ڲ����ǰ�᣺
		�ڲ�������Ǽ̳�һ�����ʵ�ֽӿڡ�
	3 �����ڲ���ĸ�ʽ�� new �����ӿ�(){�������������}
 */
abstract class Fu1{
	public abstract void play();
}
class Outer1{
	int x=10;
	public void show(){
		System.out.println("i like u");
	}
	class Inner extends Fu1{
		public void play(){
			System.out.println("play:"+x);
		}
	}
	//�����ڲ��ඨ���ھֲ�
	public void function(){
		new Fu1(){
			public void play(){
				System.out.println("i like u, too");
			}
		}.play();
	}
}
public class InnerClassNiMing {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.show();
		Outer1.Inner oi = o.new Inner();
		oi.play();
		o.function();
	}

}
