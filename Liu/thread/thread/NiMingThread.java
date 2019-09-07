package thread;
/*
 *匿名内部类的格式：
 * 		new 类名或者接口名() {
 * 			重写方法;
 * 		};
 * 		本质：是该类或者接口的子类对象。
 */
public class NiMingThread {

	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(getName()+"--------"+x);
				}
			}
		}.start();
		
		Runnable r = new Runnable(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(Thread.currentThread().getName()+"++++"+x);
				}
			}
		};
//		Thread t = new Thread(r);
//		t.start();
		new Thread(r,"张").start();
		
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(Thread.currentThread().getName()+"*****"+x);
				}
			}
		},"刘备").start();
		
		//最难的，只执行Thread的run方法。
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		},"关云长"){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(getName()+"-------"+x);
				}
			}
		}.start();;
	}

}
