package src;
/*
 *��дһ��java����ʵ�ֶ��̣߳����߳�������̵߳����֣���300�������һ�Σ������20�Ρ�
 */
class PrintName extends Thread{
	public void run(){
		try {
			Thread.sleep(300);
			for(int x=0;x<10;x++){
				System.out.println(getName()+":"+x);
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		PrintName pn1 = new PrintName();
		PrintName pn2 = new PrintName();
		pn1.start();
		pn2.start();
	}

}
