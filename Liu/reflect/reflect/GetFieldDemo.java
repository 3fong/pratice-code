package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 *ͨ�������ȡ��Ա������ʹ��
 */
public class GetFieldDemo {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("reflect.Person");
		//��Ϊ���ʳ�Ա����������Ҫ�ж���
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);
		
//		getField(c,obj);
//		getField1(c,obj);
//		getFields(c);
		getFields1(c);
	}
	
	private static void getFields1(Class c) {
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields){
			System.out.println(f);
		}
	}

	private static void getFields(Class c) {
		//��ȡ������Ա����
		Field[] fields = c.getFields();
		for(Field f : fields){
			System.out.println(f);
		}
	}

	private static void getField1(Class c, Object obj) throws Exception{
		//����˽�г�Ա����
		Field field = c.getDeclaredField("name");
		field.setAccessible(true);
		field.set(obj,"����");
		System.out.println(obj);
	}

	private static void getField(Class c,Object obj) throws Exception{
		//���ʹ�����Ա����
		Field field = c.getField("address");
		field.set(obj,"����");
		System.out.println(obj);
	}
	
}
