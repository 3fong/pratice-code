package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *Ԥ�����Classʵ������
	 �������˸������������ͣ�byte��short��int��long��float��double��char��
	 boolean���͹ؼ��� void�� �����������͵��ֽ��붼����ӵ��֮��Ӧ�İ�װ���е�TYPE������ʾ��
	�磺������������int������Ӧ�İ�װ����Integer�࣬���ԣ�int.class == Integer.TYPE��
	 ֻҪ����Դ�����г��ֵ����ͣ����и��Ե�Classʵ�������磺int[].class��void.class��
 */
class MyMain{
	public static void main(String[] args){
		for(String s :args)
			System.out.println(s);
	}
}
public class ReflectTest {

	public static void main(String[] args) throws Exception {
//		Class clazz = Class.forName("reflect.Person");
		// baseType();
//		getType(clazz);
		visitMain();
	}
	//����������
	private static void visitMain() throws Exception{
		//����main����,��ͨ��ʽ��
//		MyMain.main(new String[]{"aaa","222","333"});
		
		//���䷽ʽ�������ڲ�֪���������������Ρ�
		Class clazz = Class.forName("reflect.MyMain");
		Method me = clazz.getMethod("main",String[].class);
		
		/*
		 * jdk1.4��jdk1.5��invoke����������
			jdk1.5��public Object invoke(Object obj,Object...args)
			jdk1.4��public Object invoke(Object obj,Object...[] args)
			����Ĵ��������Ϊjdk1.5����1.4����Ĳ����쳣��
		 */
		//IllegalArgumentException:wrong number of arguments.
//		me.invoke(null,new String[]{"aaa","222","333"});
		//������ȷд�����������������һ�����壬��Ҫ��
		me.invoke(null,new Object[]{new String[]{"aaa","222","333"}});
//		me.invoke(null,(Object)new String[]{"aaa","222","333"});
	}

	private static void baseType() {
		sop(int.class.isPrimitive());// �ж��Ƿ��ǻ�����������
		sop(String.class.isPrimitive());// false
		sop(int.class == Integer.class);// false�����������ͺ����װ�಻ͬ
		sop(int.class == Integer.TYPE);// true
		sop(int[].class.isPrimitive());// false�������Լ��ֽ������ͣ����ǲ��ǻ�����������
		sop(void.class.isPrimitive());// true
	}

	private static void getType(Class clazz) throws Exception {
		// ��Ϊ���췽��˽�У�����ͨ��������ȡ
		Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
		con.setAccessible(true);// ����˽�й��췽�������÷���Ȩ�ޣ�����ͨ�����룬���������쳣
		Person p = (Person) con.newInstance("zhans", 27);

		// ��Ϊ��Ա������˽�е�Ҫͨ��������ȡ
		Field fi = clazz.getDeclaredField("name");
		fi.setAccessible(true);
		sop(fi.get(p));
		// sop(name);
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
