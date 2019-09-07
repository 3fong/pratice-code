package exception;
/*
 *�Զ����쳣������javaδ������쳣
 *throw��throws������
 *λ�ò�ͬ�������У�����������
 *��ʽ��ͬ�������׳�һ���쳣���󣻿��׳�����쳣�࣬�ö��Ÿ���
 *���������Բ�ͬ��һ���ᷢ�������ܻᷢ��
 *����ͬ���Լ������׸������ߴ���
 */
class ChushuException extends Exception{
	private int value;
	
	public ChushuException() {
		super();	
	}
	ChushuException(String msg,int value){
		 super(msg);
		 this.value = value;
	 }
	 public int getValue(){
		 return value;
	 }
}
public class MyException {
	public int div(int a,int b) throws ChushuException{
		if(b<=0){
			throw new ChushuException("�������Ϲ�",b);
		}
		return a/b;
	}
	public static void main(String[] args) {
		MyException me = new MyException();
		try{			
			int a = me.div(5, 0);
			System.out.println(a);
		}catch(ChushuException ce){
			System.out.println(ce.toString());
			System.out.println("�������ָ�����");	
		}
		System.out.println("over");
	}

}
