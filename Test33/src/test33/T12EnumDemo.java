package test33;

import java.lang.reflect.Method;

/*
 *13������һ����ͨ��ö�٣�������ơ��̵ơ��Ƶƣ�
 *  ��Ҫ�л����һ���Ƶķ��������磺��ƻ�ȡ��һ�������̵ƣ��̵ƻ�ȡ��һ�����ǻƵơ�
	1.ö��˵ʵ�ڵ�,���ǰ��Լ������඼���Լ�����.�Լ�����ЩԪ��,�����Լ����������.
 *  2.���ิд���෽��.�������������ö��Ԫ��,��ô����ö������.
 *  3.enum,�Ŵ�����ö����.ö���е�Ԫ��Ҫд���ʼλ��.
 *  4.ö��Ҳ����˵,��java������һ���ϰ�ȫ����ϵ.��Ԫ�ؽ����˱�Ҫ�����Ʋ���.�����Ƿ����޷��ƽ��.

 */
class Red{
	public Green next(){
		System.out.println("red");
		return new Green();
	}
}
class Green{
	public Yellow next(){
		System.out.println("green");
		return new Yellow();
	}
}
class Yellow{
	public Red next(){
		System.out.println("yellow");
		return new Red();
	}	
}
enum traffic{
	RED {
		@Override
		public traffic next() {
			return GREEN;
		}
	},GREEN {
		@Override
		public traffic next() {
			return YELLOW;
		}
	},YELLOW {
		@Override
		public traffic next() {
			return RED;
		}
	};
	public abstract traffic next(); 
}
public class T12EnumDemo {
	public static void main(String[] args) throws Exception{
		traffic t = traffic.RED.next();
		System.out.println(t);
		
		//InstantiationException ָ����������޷���ʵ����
		Class clazz = t.getClass();
		Object obj = clazz.newInstance();
		Method me = clazz.getMethod("next");
		me.invoke(obj);
	}
}
