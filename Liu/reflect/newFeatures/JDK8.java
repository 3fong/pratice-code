package newFeatures;
/*
 *JDK1.8�ӿ��п��Զ���Ĭ��Ȩ�޺;�̬����
 */
interface Inter{
	//���󷽷�
	public abstract void show();
	
	//default����
	public default void defaultPrint(){
		System.out.println("����ϼ");
	}
	
	//static����
	public static void staticPrint(){
		System.out.println("�汱����--ˮһ��");
	}
}
class InterImpl implements Inter{
	public void show(){
		System.out.println("show");
	}
}
public class JDK8 {

	public static void main(String[] args) {
		Inter.staticPrint();
		
		//Inter.defaultPrint();//��̬���ܷ��ʷǾ�̬
		Inter i = new InterImpl();
		i.show();
		i.defaultPrint();
	}

}
