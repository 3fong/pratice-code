package thread;

//死锁原理：嵌套锁且相互持有锁

class Dead implements Runnable{
	private boolean flag;
	Dead(boolean flag){
		this.flag=flag;
	}
	public void run(){
		if(flag){
			synchronized(MyLock.locka){
				System.out.println("a");
				synchronized(MyLock.lockb){
					System.out.println("b");
				}
			}
		}
		else{
			synchronized(MyLock.lockb){
				System.out.println("else...b");
				synchronized(MyLock.locka){
					System.out.println("else...a");
				}
			}
		}
	}
}
class MyLock{
	static Object locka=new Object();
	static Object lockb=new Object();
}
public class DeadLock {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Dead(true));
		Thread t2 = new Thread(new Dead(false));
		t1.start();
		t2.start();
	}

}
