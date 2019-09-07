package reflect;

import java.lang.reflect.Constructor;

/*
 *���䣺���ǰ�Java���еĸ��ֳɷ�ӳ�����Ӧ��Java�ࡣ
 *��ȡClass��������ַ�ʽ��
	a ����.class; �磺System.class;ȱ�㣺��Ҫ��ȷ������༰�����
	b ����.getClass(); �磺new Date().getClass();ȱ�㣺����ȷ������ࡣ
	c Class.forName("����"); �磺Class.forName("java.util.Date");
  ��ȡ���췽����
  	Constructor getConstructor():���ع������췽����
	Constructor getDeclaredConstructor()������ָ�����췽����ʹ�ñ������ʺ󣬿��Է�������Ȩ�ޡ�
	Constructor[] getConstructors():�������й��й��췽��
	Constructor[] getDeclaredConstructors()���������й��췽�������С�˽��
 */
public class ReflectConstructor {

	public static void main(String[] args) throws Exception {
		myConstructor();
	}

	private static void myConstructor() throws Exception {
		Class clazz = Class.forName("reflect.Person");
		//��ȡ�޲ι��췽��
		Constructor con = clazz.getConstructor();
		Object obj = con.newInstance();
		Person p = (Person)obj;
		System.out.println(p);
		
		//��ȡ���ι��췽�� IllegalArgumentException:��Ϊ��˽�г�Ա�����޷�ֱ�ӷ���
//		Constructor con2 = clazz.getConstructor(String.class,int.class);
//		Person p2 = (Person)con.newInstance("����ϼ",27);
//		System.out.println(p2);
		
//		Constructor con2 = clazz.getDeclaredConstructor(String.class,int.class);
//		con2.setAccessible(true);
//		Person p2 = (Person)con2.newInstance("����ϼ",27);
//		System.out.println(p2.getName()+":"+p2.getAge());
		
		Constructor[] con3 = clazz.getConstructors();
		for(Constructor c :con3){
			System.out.println(c);
		}
		Constructor[] con4 = clazz.getDeclaredConstructors();
		for(Constructor c :con4){
			System.out.println(c);
		}
	}

}
