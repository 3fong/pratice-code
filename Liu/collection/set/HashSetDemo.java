package set;

import java.util.HashSet;

/*
 *需求1：存储字符串，并保证元素唯一性
 *	如果类没有重写这两个方法，默认使用的Object()。一般来说不同相同。
 * 	而String类重写了hashCode()和equals()方法，所以，它就可以把内容相同的字符串去掉。只留下一个。
 *需求2：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 *  自定义的要自己复写hashCode()和equals()方法
 */
public class HashSetDemo {

	public static void main(String[] args) {
		mySet();
		
		//空指针异常
//		String name = null;
//		System.out.println(name.hashCode());
	}
	public static void stringSet(){
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("hello");
		hs.add("java");
		hs.add("android");
		hs.add("hadoop");
		hs.add("hello");
		hs.add("android");
		hs.add("hadoop");
		
		for(String s : hs){
			System.out.println(s);
		}
	}
	//使用HashSet必须要重写hashCode和equals方法，否则系统默认按Object中的方法处理
	public static void mySet(){
		HashSet<Student> hs = new HashSet<Student>();
		
		hs.add(new Student("貂蝉",22));
		hs.add(new Student("王昭君",23));
		hs.add(new Student("西施",27));
		hs.add(new Student("杨西环",24));
		hs.add(new Student("貂蝉",22));
		hs.add(new Student("杨西环",24));
		
		for(Student s : hs){
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
