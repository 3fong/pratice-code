package new5;
/*
 *JDK1.8�ӿ��п��Զ���Ĭ��Ȩ�޺;�̬����
 */
interface Inter1{
	public abstract void show();
	//Ĭ��Ȩ��
	public default void method(){
		System.out.println("Ĭ��");
	}
	//��̬
	public static void method2(){
		System.out.println("jingtai");
	}
}
public class JDK8 {

	public static void main(String[] args) {
		//�������ڲ��ำֵ��������÷���
		Inter1 i = new Inter1(){
			public void show(){
				System.out.println("show");
			}
		};
		i.show();
		i.method();
		//���þ�̬
		Inter1.method2();
	}
}
