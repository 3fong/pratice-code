package exception;
//上课时异常的处理
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
class Computer {
	private int state = 3;
	public void run()throws LanException,MaoException{
		if(state==2)
			throw new LanException("蓝屏");
		if(state==3)
			throw new MaoException("冒烟");
		Sop.sop("电脑运行");
	}
	public void reset(){
		state=1;
		Sop.sop("重启");
	}
}
class Teacher{
	private String name;
	private Computer com;
	Teacher(String name){
		this.name=name;
		com=new Computer();
	}
	public void takeLessons()throws NoPlanException{
		try{
			com.run();
			Sop.sop("上课");
		}catch(LanException e){
			com.reset();
		}catch(MaoException e){
			lianxi();
			throw new NoPlanException("没法干了"+e.getMessage());
		}
	}
	public void lianxi(){
		Sop.sop("练习");
	}
}
class Sop{
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
public class ExceptionTest {

	public static void main(String[] args) {
		Teacher t = new Teacher("bi");
		try{
			t.takeLessons();
		}catch(NoPlanException e){
			Sop.sop(e.toString());
			Sop.sop("放假");
		}
	}

}
