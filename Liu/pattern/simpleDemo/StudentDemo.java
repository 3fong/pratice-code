package simpleDemo;
/*
 *����ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ��α�֤�����ڴ���ֻ��һ��������?
 * 		A���ѹ��췽��˽��
 * 		B:�ڳ�Աλ���Լ�����һ������
 * 		C:ͨ��һ�������ķ����ṩ����
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		
		System.out.println(s1==s2);
	}

}
