package test33;

import java.lang.reflect.Method;

/*
 *��Ŀ�������е��ڲ����ܲ��ܷ��ʷ����еľֲ�������Ϊʲô��
 *���Է��ʼ�final�ľֲ�������
 */
class Outer{
	public Object method(){
		final int x = 5;
		class Inner{
			public void run(){
				//���Ծֲ��������������Ͳ�����final���Բ��ӣ����Ϻ�Ͳ����ٸ�ֵ
				System.out.println(x);
			}
		}
		Inner i = new Inner();
		i.run();
		return i;//����Inner���󷽱��÷������
	}
}
public class T11InnerClassDemo {

	public static void main(String[] args) throws Exception{
		Outer o = new Outer();
		Object obj = o.method();
		
		Class clazz = obj.getClass();
		Method me = clazz.getMethod("run");
		me.invoke(obj);
	}

}
