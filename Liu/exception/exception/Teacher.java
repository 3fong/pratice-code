package exception;
/*
 *
 */
public class Teacher {
	public void check(int num) throws MyException{
		if(num>100 || num<0)
			throw new MyException("�ɼ���0-100֮��");
		else{
			System.out.println("����û������");
		}
	}
}
