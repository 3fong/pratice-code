package src;
/*
 *编写一个java程序实现多线程，在线程中输出线程的名字，隔300毫秒输出一次，共输出20次。
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
