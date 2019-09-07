package reflect;

import java.lang.reflect.Constructor;

/*
 *ͨ�������ȡ���췽����ʹ�á�
 *	public Constructor[] getConstructors():���й������췽��
 *	public Constructor[] getDeclaredConstructors():���й��췽��
 *
 *	public Constructor<T> getConstructor(Class<?>... parameterTypes)
	������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�class�ֽ����ļ�����
	
	public T newInstance(Object... initargs)
	ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
 */
public class GetConstructorDemo {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("reflect.Person");
		
//		getCons1(c);
//		getCon(c);
		getCon2(c);
	}
	//��ȡ�������췽��
	public static void getCons1(Class c){
		// ��ȡ�������췽�� 
//		Constructor[] cons = c.getConstructors();
//		for(Constructor con : cons){
//			System.out.println(con);
//		}
		//��ȡ���й��췽��
		Constructor[] cons = c.getDeclaredConstructors();
		for(Constructor con :cons){
			System.out.println(con);
		}
		
	}
	//��ȡ�������췽��
	public static void getCon(Class c) throws Exception{
		//�޲�
//		Constructor con = c.getConstructor();
	
//		Object obj = con.newInstance();
//		System.out.println(obj);
		
		//����˽���ֶ�
		Constructor con1 = c.getDeclaredConstructor(String.class,int.class);
		//��������
		con1.setAccessible(true);
		Object obj1 = con1.newInstance("zhangsan",27);
		System.out.println(obj1);
	}
	//����ͨ������ȥ��ȡ�ù��췽����ʹ�ã�
	public static void getCon2(Class c) throws Exception{
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("����ϼ",27,"����");
		System.out.println(obj);
	}
}
