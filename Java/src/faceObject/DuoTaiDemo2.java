package faceObject;
/*
 *	������ѧ���� ѧϰ ˯��
	�߼���ѧ���� ѧϰ ˯��
	���Խ�������������г�ȡ��
 */
abstract class Student1{
	public abstract void study();
	public void sleep(){
		System.out.println("˯��");
	}
}
class XiaoStudent extends Student1{
	public void sleep(){
		System.out.println("վ��˯");
	}
	public void study(){
		System.out.println("һ��ѧ");
	}
}
class AdvStudent extends Student1{
	public void sleep(){
		System.out.println("��˯");
	}
	public void study(){
		System.out.println("������ѧ");
	}	
}
//�ö�̬���������Բ�����������÷���
class DoStudent{
	public void doSome(Student1 s){
		s.study();
		s.sleep();
	}
}
public class DuoTaiDemo2 {

	public static void main(String[] args) {
//		Student1 s = new XiaoStudent();
//		s.sleep();
//		s.study();
		
		DoStudent ds = new DoStudent();
		ds.doSome(new XiaoStudent());//Student1 s = new XiaoStudent();
		ds.doSome(new AdvStudent());
	}
}
