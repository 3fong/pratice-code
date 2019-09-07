package exception;
/*
 *��һ��Բ�Ρ�
�����Ի�ȡ������������������ַǷ�����ֵ����Ϊ�ǻ�ȡ����������⡣
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
			throw new GetMultyException("�뾶���Ϲ�");
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
