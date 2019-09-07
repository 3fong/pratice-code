package test;
/*
 *2.��дһ��java����ʵ�ֶ��̣߳����߳�������̵߳����֣���300�������һ�Σ������20�Ρ�
 	����:
 		ʵ�ֶ��߳������ַ�ʽ��
 			1���̳�Thread
 			2��ʵ��Runnable
 		����Runnable�����˼̳еľ����ԣ��������ڴ�����ʹ����Runnable
 		��дrun������������߳�ִ�д��롣��Ϊ��������ж��������Լ�����
 		��֤���ݺ����ԡ�
 */
class Name implements Runnable{
	private Object obj = new Object();
	public void run(){
		try {							
			for(int x=0;x<10;x++){
				synchronized(obj){
					Thread.sleep(300);
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Name name = new Name();
		
		Thread t1 = new Thread(name,"����");
		Thread t2 = new Thread(name,"��Ԫ��");
		t1.start();
		t2.start();
	}
}
