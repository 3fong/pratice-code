package communication;
/*
 * ������
 * 		��Դ�ࣺStudent	
 * 		����ѧ������:SetThread(������)
 * 		��ȡѧ�����ݣ�GetThread(������)
 * 		������:StudentDemo
 * 
 * ����1������˼·д���룬��������ÿ�ζ���:null---0
 * ԭ��������ÿ���߳��ж��������µ���Դ,������Ҫ���ʱ�����úͻ�ȡ�̵߳���ԴӦ����ͬһ��
 * ���ʵ����?
 * 		������������ݴ���������ͨ�����췽�����ݸ���������
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
