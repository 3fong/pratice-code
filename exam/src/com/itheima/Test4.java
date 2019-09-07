package com.itheima;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 4、 ArrayList list = new ArrayList(); 在这个泛型为Integer的ArrayList中存放一个String类型的对象。
 * 分析：
 * 1、泛型是一个类型安全机制，它的设计参考了数组的特点，也就是对象类型一旦确定，方法接收的对象类型也将被固定。
 * 即：List的泛型为<Integer>的话，List集合中必须放Integer类型的对象，这样Java就可以放心的把对象当Integer使用。
 * 2、现在要向Integer中存String类型的对象，这个显然是泛型不允许的，但通过反射可以直接获得add方法的字节码，
 * 跳过编译层在运行时直接添加，相当于欺骗了编译层。
 */

public class Test4
{
	public static void main(String[] args)
	{
		//创建一个接受Integer对象的ArrayList集合
		ArrayList<Integer> list = new ArrayList<Integer>();
        String str = "heima";
        
        //获取list类，并返回类中公共成员方法的数组
        Method[] method = list.getClass().getMethods();
        try {
        		//将String类型对象存入ArrayList集合中
                method[0].invoke(list, str);
        } catch (Exception e) {
                e.printStackTrace();
        }
        //获取集合中对象
        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }		
	}
}