package test2;

import java.lang.reflect.Field;

/*
 *���幤���࣬���ڵ���ֱ�����������ͳ�Ա����ʱ���Ϳ������ֵ���޸�ֵ��
 */
public class Tool {
	public void setProperty(Object obj,String propertyName,Object value)throws Exception{
		Class c = obj.getClass();
		Field field = c.getDeclaredField(propertyName);
		field.setAccessible(true);
		field.set(obj,value);
	}
}
