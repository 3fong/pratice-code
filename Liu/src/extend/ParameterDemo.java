package extend;
/*
 * ��ʽ������
 * 		��������Ҫ��Ķ���
 * 		�����ࣺ��Ҫ�����������
 * 		�ӿڣ���Ҫʵ�ָýӿڵ������
 */
interface Fu2{
	void show2();
}
abstract class Fu1{
	public abstract void show();
} 
class FuDemo{
	public void method(Fu1 f){
		f.show();
	}
	public void method2(Fu2 f2){
		f2.show2();
	}
}
class Zi1 extends Fu1 implements Fu2{
	public void show(){
		System.out.println("�õ�");
	}
	public void show2(){
		System.out.println("�ǳ��õ�");
	}
}
public class ParameterDemo {

	public static void main(String[] args) {
		FuDemo fd = new FuDemo();
		Fu1 f = new Zi1();
		fd.method(f);
		
		Fu2 f2 = new Zi1();
		fd.method2(f2);
	}

}
