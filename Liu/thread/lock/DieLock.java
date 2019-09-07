package lock;
/*
 *
 */
class MyLock{
	static Object A = new Object();
	static Object B = new Object();
}
public class DieLock extends Thread {
	private boolean flag;
	public DieLock(boolean flag) {
		super();
		this.flag = flag;
	}

	public void run(){
		if(flag){
			synchronized(MyLock.A){
				System.out.println("if A");
				synchronized(MyLock.B){
					System.out.println("if B");
				}
			}
		}else{
			synchronized(MyLock.B){
				System.out.println("else B");
				synchronized(MyLock.A){
					System.out.println("else A");
				}
			}
		}
	}
}
