package extend;
/*
 * ����ֵ���ͣ�
 * 	��������
 * 		��������Ҫ����Ķ���
 * 		�����ࣺ��Ҫ��������Ķ���
 * 		�ӿڣ���Ҫʵ�ֽӿڵ������
 */
interface Extra{
	public abstract void show();
}
abstract class Person4{
	public abstract void show1();
}
class PersonDemo{
	public Person4 getPerson4(){
//		�޷�ֱ�Ӵ������������
//		return new Person4();
		return new Teacher();
	}
	public static Extra getExtra(){
		return new Teacher();
	}
}
class Teacher extends Person4 implements Extra{
	public void show1(){
		System.out.println("�Ͽ���");
	}
	public void show(){
		System.out.println("������");
	}
}
public class ReturnDemo {

	public static void main(String[] args) {
		//��̬���÷�������Ϊ����ֵΪһ���������Կ��Ե����䷽����
		PersonDemo.getExtra().show();
		
		//��������ʽ�����÷�����������ʽ��̣����Ƿ����ķ���ֵ�Ƕ��󣬿����ٴε��÷�����
		new PersonDemo().getExtra().show();
		
		PersonDemo pd = new PersonDemo();
		Person4 p = pd.getPerson4();
		p.show1();
	}

}
