package base;
/*
 * ��ʽ���������⣺
 * 	�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ�����
 *  �������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ�����
 */
//��ʽ�����ǻ�������
class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}

//��ʽ��������������
class Student{
	public void show(){
		System.out.println("i love u");
	}
}
class StudentQuote{
	//����㿴����һ����������ʽ������һ�������ͣ��������ͣ���������ʵ��Ҫ�ĸ���Ķ���
	//����ʱ����Student s = new Student();�ĵ�ַs�������
	public void quote(Student s){
		s.show();
	}
}
public class QuoteDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println(result);
		
		StudentQuote sq = new StudentQuote();
//		Student s = new Student();
		sq.quote(new Student());
	}

}
