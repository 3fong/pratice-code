package communication2;
/*
 * ����2��Ϊ�����ݵ�Ч����һЩ���Ҽ�����ѭ�����жϣ�������ͬ��ֵ,���ʱ��������µ�����
 * 		A:ͬһ�����ݳ��ֶ��
 * 		B:���������䲻ƥ��
 * ԭ��
 * 		A:ͬһ�����ݳ��ֶ��
 * 			CPU��һ���ʱ��Ƭ��ִ��Ȩ�����㹻��ִ�кܶ�Ρ�
 * 		B:���������䲻ƥ��
 * 			�߳����е������
 * �̰߳�ȫ���⣺
 * 		A:�Ƿ��Ƕ��̻߳���		��
 * 		B:�Ƿ��й�������			��
 * 		C:�Ƿ��ж�����������������	��
 * ���������
 * 		������
 * 		ע�⣺
 * 			A:��ͬ������̶߳�Ҫ������
 * 			B:��ͬ������̼߳ӵ���������ͬһ�ѡ�
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
