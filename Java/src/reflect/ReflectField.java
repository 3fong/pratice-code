package reflect;

import java.lang.reflect.Field;

/*
 *��ȡ��Ա����
 *	Field getField(String name):���صĹ�����Ա�ֶΣ�
 *	Field getDeclaredField(String name)
 	Field[] getFields():���ذ������г�Ա�ֶε����飻
 	Field[] getDeclaredFields():���ذ������г�Ա�ֶε����飻
 	set(Object obj,Object value)//���ö����ָ����Ա����ֵ
 	Object get(Object obj)������ָ�������ϴ� Field ��ʾ���ֶε�ֵ


 */
public class ReflectField {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("reflect.Person");
//		myField1(clazz);
//		myField2(clazz);
//		myField3(clazz);
		myField4(clazz);
	}
	
	private static void myField1(Class clazz) throws Exception{
		Person p = (Person)clazz.newInstance();
		Field fi = clazz.getField("address");
		fi.set(p,27);
		System.out.println(fi.get(p));
	}

	//Ϊ����ֵ�������ж���set(������,������ֵ);
	private static void myField2(Class clazz) throws Exception{
		Person p = (Person)clazz.newInstance();
		Field fi = clazz.getDeclaredField("age");		
//		fi.setAccessible(true);
		fi.set(p,27);
		System.out.println(fi.get(p));
	}
	//��ȡȫ�����г�Ա����
	private static void myField3(Class clazz) {
		Field[] fis = clazz.getFields();
		for(Field f : fis){
			System.out.println(f);
		}
	}
	//��ȡ���г�Ա���������С�˽��
	private static void myField4(Class clazz) {
		Field[] fis = clazz.getDeclaredFields();
		for(Field f : fis){
			System.out.println(f);
		}
	}

}
