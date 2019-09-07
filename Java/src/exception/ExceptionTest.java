package exception;
/*
 *ģ���Ͽ�ʱ�����쳣����
 *������
 *		�Ͽ�ʱ�쳣�����֣���������������ð��
 *		��������������ð���޷�ֱ�Ӵ�����ͨ������ƻ��쳣����Ӵ���
 */
class LanException extends Exception{
	LanException(String msg){
		super(msg);
	}
}
class MaoException extends Exception{
	MaoException(String msg){
		super(msg);
	}
}
class NoPlanException extends Exception{
	NoPlanException(String msg){
		super(msg);
	}
}
class Computer{
	int state = 2;
	public void run() throws LanException, MaoException{
		switch(state){
		case 2 :
			throw new LanException("����");
		case 3 :
			throw new MaoException("ð���쳣");			
		}
		System.out.println("��������");
	}
	public void reStart(){
		state=1;
		System.out.println("��������");
	}
}
class Teacher{
	private String name;
	private Computer com;
	public Teacher(String name) {
		super();
		this.name = name;
		com= new Computer();
	}
	public void goClass() throws NoPlanException{
		try{
			com.run();			
		}catch(LanException le){
			com.reStart();
		}catch(MaoException me){
			execise();
			throw new NoPlanException("�ƻ����¼�"+":"+me.getMessage());
		}
		System.out.println("�Ͽ�");
	}
	public void execise(){
		System.out.println("����ϰ");
	}
}
public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t = new Teacher("��");
		try{
			t.goClass();
		}catch(NoPlanException npe){
			System.out.println(npe.toString());
			System.out.println("�����һ�ż�");
		}
	}
}
