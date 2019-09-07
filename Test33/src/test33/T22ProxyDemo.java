package test33;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/*
 *写一个ArrayList类的代理，实现和ArrayList类中完全相同的功能，
 * 并可以计算每个方法运行的时间。

 */
public class T22ProxyDemo {

	public static void main(String[] args) {
		final ArrayList al = new ArrayList();
		
		Object obj = Proxy.newProxyInstance(List.class.getClassLoader(),
				ArrayList.class.getInterfaces(),new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				long start = System.currentTimeMillis();
				Thread.sleep(10);
				Object reVal = method.invoke(al, args);
				long end = System.currentTimeMillis();
				System.out.println(method.getName()+":耗时："+(end-start));
				return reVal;
			}
			
		});
		
		List list = (List)obj;
		list.add("jfalj");
		list.add("nieh");
		System.out.println(list.toString());
	}

}
