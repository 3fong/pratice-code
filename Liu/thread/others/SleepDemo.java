package others;
/*
 *�߳�����:public static void sleep(long millis)
 */
public class SleepDemo {

	public static void main(String[] args) {
		Sleep s1 = new Sleep();
		Sleep s2 = new Sleep();
		s1.setName("��־��");
		s2.setName("־ӱ");
		s1.start();
		s2.start();
	}

}
