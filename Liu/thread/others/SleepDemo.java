package others;
/*
 *线程休眠:public static void sleep(long millis)
 */
public class SleepDemo {

	public static void main(String[] args) {
		Sleep s1 = new Sleep();
		Sleep s2 = new Sleep();
		s1.setName("林志玲");
		s2.setName("志颖");
		s1.start();
		s2.start();
	}

}
