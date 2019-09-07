package exception;
/*
 *模拟上课时出现异常情形
 *分析：
 *		上课时异常分两种：电脑蓝屏、电脑冒烟
 *		蓝屏可重启处理；冒烟无法直接处理，可通过定义计划异常来间接处理
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
			throw new LanException("蓝屏");
		case 3 :
			throw new MaoException("冒烟异常");			
		}
		System.out.println("电脑运行");
	}
	public void reStart(){
		state=1;
		System.out.println("电脑重启");
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
			throw new NoPlanException("计划外事件"+":"+me.getMessage());
		}
		System.out.println("上课");
	}
	public void execise(){
		System.out.println("上自习");
	}
}
public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t = new Teacher("比");
		try{
			t.goClass();
		}catch(NoPlanException npe){
			System.out.println(npe.toString());
			System.out.println("换教室或放假");
		}
	}
}
