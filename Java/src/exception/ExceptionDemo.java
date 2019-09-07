package exception;
/*
 *有一个圆形。
都可以获取面积。对于面积如果出现非法的数值，视为是获取面积出现问题。
 */
class GetMultyException extends Exception{
	GetMultyException(String msg){
		super(msg);
	}
}
interface Area{
	public abstract void getArea();
}
class Cricle implements Area{
	private int r;
	private final double PI = 3.14;
	Cricle(int r) throws GetMultyException{
		if(r<=0)
			throw new GetMultyException("半径不合规");
		this.r=r;
	}
	public void getArea(){
		System.out.println(Math.pow(r, 2)*PI);
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		try{
			Cricle c = new Cricle(0);
			c.getArea();
		}catch(GetMultyException gme){
			System.out.println(gme.toString());
		}
		System.out.println("over");
	}
}
