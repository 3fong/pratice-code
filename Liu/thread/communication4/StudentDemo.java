package communication4;
/*
 *最终版代码中：
 * 		把Student的成员变量给私有了。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		设置或者获取的线程里面只需要调用方法即可。
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		
		SetStudent ss = new SetStudent(s);
		GetStudent gs = new GetStudent(s);
		
		Thread t1 = new Thread(ss);
		Thread t2 = new Thread(gs);
		t1.start();
		t2.start();
	}

}
