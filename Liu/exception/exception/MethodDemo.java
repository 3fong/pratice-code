package exception;
/*
 *Throwable�еķ�����
	getMessage():��ȡ�쳣��Ϣ������String��
	toString():�쳣���ƺ��쳣��Ϣ������String��
	printStackTrace():��ȡ�쳣���ơ���Ϣ�ͳ��ֵ�λ�á�����JVMĬ�Ϸ�����
	printStackTrace(PrintStream s)��ͨ���ø÷������쳣���ݱ�������־�ļ���

���Ա���ġ�
 */
public class MethodDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{
			System.out.println("a/b:"+a/b);
		}catch(Exception e){
//			System.out.println(e);
//			e.getMessage(); 
//			System.out.println("e.getMessage():"+e.getMessage());// / by zero
			
//			System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			
			e.printStackTrace();	//java.lang.ArithmeticException: / by zero
									//at MethodDemo.main(MethodDemo.java:15)
		}
		System.out.println("over");
	}

}
