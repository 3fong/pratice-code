package communication4;
/*
 *���հ�����У�
 * 		��Student�ĳ�Ա������˽���ˡ�
 * 		�����úͻ�ȡ�Ĳ�������װ���˹��ܣ�������ͬ����
 * 		���û��߻�ȡ���߳�����ֻ��Ҫ���÷������ɡ�
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
