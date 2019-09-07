package reflect;

import java.lang.reflect.Field;

/*
 *定义工具类，用于当你直接输入类名和成员变量时，就可以添加值或修改值。
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
		//创建工具对象
		Tool t = new Tool();
		t.setProperty(p,"name","林青霞");
		t.setProperty(p,"age",27);
		System.out.println(p);
	}

}
