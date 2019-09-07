package proxy;

import java.lang.reflect.Proxy;

/*
 *��̬����ͨ������������һ������
 *		JDK�ṩ�Ĵ���ֻ����Խӿ�������
 *Proxy������һ���������Դ�����̬�������
	public static Object newProxyInstance(ClassLoader loader,
						Class<?>[]interfaces,InvocationHandler h)
 */
public class Test {

	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.del();
		ud.multi();
		ud.div();
		System.out.println("------------------------");
		//������̬�������
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		
		Object obj = Proxy.newProxyInstance(ud.getClass().getClassLoader(),
				ud.getClass().getInterfaces(),handler);
		
		UserDao proxy = (UserDao)obj;
		proxy.add();
		proxy.del();
		proxy.multi();
		proxy.div();
	}
}
