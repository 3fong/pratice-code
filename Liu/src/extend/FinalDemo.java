package extend;

class Student{
	int y=20;
	int age=40;
	final int x=10;
	Student(int x){
		//δʹ���ⲿx�����Բ�����
		x=20;
		System.out.println(x);
	}
}
class Super extends Student{

	Super(int x){
		super(x);
	}
	public final void show(){
		y=30;
//		x=20;
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		Super s = new Super(50);
		s.show();
		
		Student sd = new Student(80);
		System.out.println(sd.age);
		
		//�������ñ�������ֵַ���ܷ����仯�������ֵ�ɱ�
		final Student sd2 = new Student(80);
		sd2.age=50;
		System.out.println(sd2.age);
	}
}
