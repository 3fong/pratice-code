package reflect;
/*
 *反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 *获取class文件对象的方式：
 * A:Object类的getClass()方法
 * B:数据类型的静态属性class
 * C:Class类中的静态方法
 * 		public static Class forName(String className)
 */
public class GetClassDemo {

	public static void main(String[] args) throws ClassNotFoundException {		
		Person p = new Person();
		Class c = p.getClass();
		
		//类文件是同一个文件
		//方式一：
		Person p1 = new Person();
		Class c1 = p1.getClass();
		
		System.out.println(p==p1);//false
		System.out.println(c==c1);//true
		
		//方式二：
		Class c2 = Person.class;
		System.out.println(c==c2);//true
		
		//方式三：
		Class c3 = Class.forName("reflect.Person");
		System.out.println(c==c3);//true
	}

}
