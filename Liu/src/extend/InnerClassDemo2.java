package extend;
//�ڲ������η�
class Outer2{
	//˽�������ڲ���
	private class Inner2{
		public void show(){
			System.out.println("����");
		}
	}
	public void method(){
		Inner2 i = new Inner2();
		i.show();
	}
	//��̬�����ڲ���
	public static class Inner3{
		public void show(){
			System.out.println("�Ǿ�̬�ڲ��෽��");
		}
		public static void show1(){
			System.out.println("��̬�ڲ��෽��");
		}
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		//˽�����Σ��ⲿ�������޷�ֱ�Ӵ�������
//		Outer2.Inner2 oi = new Outer2().new Inner2();
//		oi.show();
		
		Outer2 o = new Outer2();
		o.method();
		
		//��̬�����ڲ���ķ��ʷ�ʽ����ʱ�ڲ�����Կ����ǳ�Ա������
		Outer2.Inner3 oi3 = new Outer2.Inner3();
		oi3.show();
		oi3.show1();
		
		//��̬������ֱ�ӵ���
		Outer2.Inner3.show1();
	}

}
