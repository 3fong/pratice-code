package reflect.proxy;

import java.lang.reflect.Proxy;

/*
 *��̬���?ͨ���������һ������
 *		JDK�ṩ�Ĵ���ֻ����Խӿ������?
 *Proxy������һ���������Դ�����̬�������
	public static Object newProxyInstance(ClassLoader loader,
						Class<?>[]interfaces,InvocationHandler h)
 */
public class Test {

	public static void main(String[] args) {
		RegistImplDemo ri = new RegistImplDemo();
		ri.entry();
		ri.regist();
		
		MyInvocationHandler mih = new MyInvocationHandler(ri);
		//������̬����
		Object obj = Proxy.newProxyInstance(ri.getClass().getClassLoader(),
					ri.getClass().getInterfaces(),mih);
		
		//�����ǽӿ�
		Regist r = (Regist)obj;
		r.entry();
		r.regist();
	}
}
