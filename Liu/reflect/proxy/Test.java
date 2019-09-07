package proxy;

import java.lang.reflect.Proxy;

/*
 *动态代理：通过反射来生成一个代理
 *		JDK提供的代理只能针对接口做代理。
 *Proxy类中有一个方法可以创建动态代理对象
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
		//创建动态代理对象
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
