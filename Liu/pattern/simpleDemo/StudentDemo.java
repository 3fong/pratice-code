package simpleDemo;
/*
 *单例模式：保证类在内存中只有一个对象。
 * 
 * 如何保证类在内存中只有一个对象呢?
 * 		A：把构造方法私有
 * 		B:在成员位置自己创建一个对象
 * 		C:通过一个公共的方法提供访问
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		
		System.out.println(s1==s2);
	}

}
