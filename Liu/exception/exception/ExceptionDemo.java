package exception;
/*
 *�����쳣�Ĵ���
 *try����У�������ڳ����쳣ʱ����������ִ�в���
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int [] arr = {0,1,2};
		
		try{
			System.out.println("a/b:"+a/b);
			System.out.println("arr[3]:"+arr[3]);
		}catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		}
		System.out.println("over");
	}

}
