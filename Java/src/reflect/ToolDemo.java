package reflect;

import java.lang.reflect.Field;

/*
 *���幤���࣬���ڵ���ֱ�����������ͳ�Ա����ʱ���Ϳ������ֵ���޸�ֵ��
 */
class Tool{
	public void setProperty(Object obj,String propertyName,
								Object value) throws Exception{
		Class clazz = obj.getClass();
		Field field = clazz.getDeclaredField(propertyName);
		field.setAccessible(true);
		field.set(obj, value);
	}
}
public class ToolDemo {

	public static void main(String[] args) throws Exception{
		Person p = new Person();
		//�������߶���
		Tool t = new Tool();
		t.setProperty(p,"name","����ϼ");
		t.setProperty(p,"age",27);
		System.out.println(p);
	}

}
