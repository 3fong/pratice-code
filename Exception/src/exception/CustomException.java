package exception;

class FuShuException extends Exception{
	private int value;
	FuShuException(){
		super();
	}
	FuShuException(String msg,int value){
		super(msg);
		this.value=value;
	}
	public int getValue(){
		return value;
	}
}
class Demo {
	int div(int a,int b)throws FuShuException{
		if(b<0)
			throw new FuShuException("除数不能小于等于0",b);
		return a/b;
	}
}
public class CustomException {

	public static void main(String[] args) {
		Demo d = new Demo();
		try{
			int x = d.div(4,-1);
			System.out.println(x);
		}catch(FuShuException e){
			System.out.println(e.toString());
		}
	}

}
