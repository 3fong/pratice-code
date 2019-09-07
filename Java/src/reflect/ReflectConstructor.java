package reflect;

import java.lang.reflect.Constructor;

/*
 *反射：就是把Java类中的各种成分映射成相应的Java类。
 *获取Class对象的三种方式：
	a 类名.class; 如：System.class;缺点：需要明确具体的类及其对象。
	b 对象.getClass(); 如：new Date().getClass();缺点：需明确具体的类。
	c Class.forName("类名"); 如：Class.forName("java.util.Date");
  获取构造方法：
  	Constructor getConstructor():返回公共构造方法；
	Constructor getDeclaredConstructor()：返回指定构造方法，使用暴力访问后，可以访问任意权限。
	Constructor[] getConstructors():返回所有共有构造方法
	Constructor[] getDeclaredConstructors()：返回所有构造方法，公有、私有
 */
public class ReflectConstructor {

	public static void main(String[] args) throws Exception {
		myConstructor();
	}

	private static void myConstructor() throws Exception {
		Class clazz = Class.forName("reflect.Person");
		//获取无参构造方法
		Constructor con = clazz.getConstructor();
		Object obj = con.newInstance();
		Person p = (Person)obj;
		System.out.println(p);
		
		//获取带参构造方法 IllegalArgumentException:因为有私有成员变量无法直接访问
//		Constructor con2 = clazz.getConstructor(String.class,int.class);
//		Person p2 = (Person)con.newInstance("林青霞",27);
//		System.out.println(p2);
		
//		Constructor con2 = clazz.getDeclaredConstructor(String.class,int.class);
//		con2.setAccessible(true);
//		Person p2 = (Person)con2.newInstance("林青霞",27);
//		System.out.println(p2.getName()+":"+p2.getAge());
		
		Constructor[] con3 = clazz.getConstructors();
		for(Constructor c :con3){
			System.out.println(c);
		}
		Constructor[] con4 = clazz.getDeclaredConstructors();
		for(Constructor c :con4){
			System.out.println(c);
		}
	}

}
