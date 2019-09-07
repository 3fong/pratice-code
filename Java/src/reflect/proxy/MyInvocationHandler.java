package reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 *InvocationHandler �Ǵ���ʵ��ĵ��ô������ ʵ�ֵĽӿڡ� 
ÿ������ʵ�����һ�������ĵ��ô�����򡣶Դ���ʵ����÷���ʱ�����Է������ý��б��벢��
��ָ�ɵ���ĵ��ô������� invoke ������

 */
public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	MyInvocationHandler(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ȩ��У��");
		Object result = method.invoke(target, args);
		System.out.println("��־��¼");
		return result;
	}

}
