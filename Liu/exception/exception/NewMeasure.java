package exception;
/*
 *JDK7������һ���µ��쳣��������
 * 		try{
 * 
 * 		}catch(�쳣��1 | �쳣��2 | ...  ���� ) {
 * 			...
 * 		}
 * 
 * 		ע�⣺���������Ȼ��࣬����Ҳ�����á�
 * 			A:����ʽ��һ�µġ�(ʵ�ʿ����У��ö�ʱ����ܾ������ͬ���͵����⣬����ͬһ������)
 *			B:����쳣�������ƽ����ϵ��
 */
public class NewMeasure {

	public static void main(String[] args) {
		show();
	}
	public static void show(){
		int a = 10;
		int b = 0;
		int [] arr = {0,1,2};
		
		try{
			System.out.println("a/b:"+a/b);
			System.out.println("arr[3]:"+arr[3]);
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("�����쳣");
		}
		System.out.println("over");
	}
}
