package exception;
/*
 *
 */
public class Teacher {
	public void check(int num) throws MyException{
		if(num>100 || num<0)
			throw new MyException("成绩在0-100之间");
		else{
			System.out.println("分数没有问题");
		}
	}
}
