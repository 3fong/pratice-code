package test2;

import java.lang.reflect.Field;

/*
 *定义工具类，用于当你直接输入类名和成员变量时，就可以添加值或修改值。
 */
public class Tool {
	public void setProperty(Object obj,String propertyName,Object value)throws Exception{
		Class c = obj.getClass();
		Field field = c.getDeclaredField(propertyName);
		field.setAccessible(true);
		field.set(obj,value);
	}
}
