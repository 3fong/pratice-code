package com.itheima;

import java.lang.reflect.Field;

/**
3、 写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.   

public void setProperty(Object obj, String propertyName, Object value){   
}
思路：
1、要修改任意对象中的成员变量的值，想到字段的反射
2、调用set方法进行赋值
*/
class Demo{
	Object name;
}
public class Test3
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		Object o = new Object();
		//打印未赋值的对象值
		System.out.println(d.name);
		setProperty(d,"name",o);
		
		//打印赋值后对象值
		System.out.println(d.name);
		System.out.println(o);
	}
	public static void setProperty(Object obj, String propertyName, Object value) {
	    try {
	    	//通过反射获取对象的成员变量
	        Field fd=obj.getClass().getDeclaredField(propertyName);
	        //进行赋值
	        fd.set(obj, value);
	        
	      //进行异常处理
	    } catch (SecurityException e) {
	    	throw new SecurityException("请联系管理员");
	    } catch (NoSuchFieldException e) {
	    	System.out.println("无此字段："+e.toString());
	    } catch (IllegalArgumentException e) {
	    	throw new IllegalArgumentException("非法参数");
	    } catch (IllegalAccessException e) {
	    	System.out.println("无权访问："+e.toString());
	    } catch(Exception e){
	    	System.out.println("赋值失败");
	    }
	}
}
