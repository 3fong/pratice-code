package communication3;
/*
	����3:��Ȼ���ݰ�ȫ�ˣ������أ�һ��һ��Ƭ���ÿ����Ҿ������ε�һ��һ�������
 * ���ʵ����?
 * 		ͨ��Java�ṩ�ĵȴ����ѻ��ƽ����
 * 
 * �ȴ����ѣ�
 * 		Object�����ṩ������������
 * 			wait():�ȴ�
 * 			notify():���ѵ����߳�
 * 			notifyAll():���������߳�
 * 		Ϊʲô��Щ������������Thread������?
 * 			��Щ�����ĵ��ñ���ͨ����������ã������Ǹղ�ʹ�õ�������������������
 * 			���ԣ���Щ�������붨����Object���С�
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
