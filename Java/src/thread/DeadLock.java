package thread;
/*
 *À¿À¯«È–Œ
 */
class Lock{
	public static final Object o1 = new Object();
	public static final Object o2 = new Object();
}
class Demo extends Thread{
	private int x=0;
	public void run(){
		while(true){
			if(x%2==0){
				synchronized(Lock.o1){
					System.out.println(getName()+":if---1");
					synchronized(Lock.o2){
						System.out.println(getName()+"if---2");
					}
				}				
			}else{		
				synchronized(Lock.o2){
					System.out.println(getName()+"else---2");
					synchronized(Lock.o1){
						System.out.println(getName()+"else---1");
					}
				}
			}
			x++;
		}
	}
}
public class DeadLock {

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo();
		d.start();
		d1.start();
	}

}
