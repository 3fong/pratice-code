package faceObject;

import java.lang.reflect.Method;

/*
 *��Ա�ڲ��಻�Ǿ�̬�ģ�
		�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
		Outer.Inner oi = new Outer().new Inner();
      ��Ա�ڲ����Ǿ�̬�ģ�
		�ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
		�Ǿ�̬������Outer.Inner oi = new Outer.Inner();
		ֱ�����������þ�̬������Outer.Inner.show2();
 */
class Outer{
	int x=1;
	//һ���಻���Ա�private���Σ������ڲ����ڳ�Աλ����ʱ���ԡ�
	private class Inner{
		public void play(){
			System.out.println(x);
		}
	}
	//��̬�����ڲ����൱�ڳ�Ա����
	public static class Inner1{
		int x = 3;
		public void show(){
			int x =6;
			System.out.println(x);
			System.out.println(this.x);
		}
		public static void show1(){
			System.out.println(new Outer().x);
			//����̬���κ󣬾Ͳ��ܷ����ⲿ��Ա��������Ϊ��̬�ȳ�ʼ��
//			System.out.println(Outer.this.x);
		}
	}
	
	//�ڲ��౻˽�к��ⲿ�޷�ֱ�ӷ��ʣ�ֻ��ͨ���ⲿ�෽������
	void method(){
		Inner i = new Inner();
		i.play();
	}
}
public class InnerClass1 {

	public static void main(String[] args) throws Exception{
		//�÷�������ڲ���
		//Class clazz = Class.forName("faceObject.Inner");
//		Object obj = clazz.newInstance();
//		Method md = clazz.getDeclaredMethod("show");
//		md.setAccessible(true);
//		md.invoke(obj);
		
		Outer o = new Outer();
		o.method();
		
		//���ʾ�̬�ڲ���ķǾ�̬����
		Outer.Inner1 oi = new Outer.Inner1();
		oi.show();
		//���ʾ�̬�ڲ���ľ�̬����
		Outer.Inner1.show1();
	}

}
