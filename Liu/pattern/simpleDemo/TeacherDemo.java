package simpleDemo;
/*
 *����ģʽ��
 * 		����ʽ����һ���ؾʹ�������
 * 		����ʽ���õ�ʱ�򣬲�ȥ��������
 * 
 * �����⣺����ģʽ��˼����ʲô?��дһ���������֡�
 * 		����������ʽ(�ǲ��������ĵ���ģʽ)
 * 		���ԣ�����ʽ(���ܻ������ĵ���ģʽ)
 * 			A:������(�ӳټ���)	
 * 			B:�̰߳�ȫ����
 * 				a:�Ƿ���̻߳���	��
 * 				b:�Ƿ��й�������	��
 * 				c:�Ƿ��ж����������������� ��  
 */
public class TeacherDemo {

	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		
		System.out.println(t1==t2);
	}

}
