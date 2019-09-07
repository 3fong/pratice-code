package thread;
/*
 *用匿名内部类创建多线程对象
 */
public class NIMingThread {

	public static void main(String[] args) {
		/*//匿名Thread的子类
		new Thread(){
			public void run(){
				for(int x=0;x<30;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		}.start();
		
		//匿名Runnable的子类，给匿名内部类取个名字，方便调用。
		Runnable r = new Runnable(){
			public void run(){
				for(int x=0;x<35;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		};
		new Thread(r).start();*/
		
		//结合版，运行的是Thread，Runnable没有运行。
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<25;x++){
					System.out.println(Thread.currentThread().getName()+":Runnable"+x);
				}
			}
		},"大乔"){
			public void run(){
				for(int x=0;x<35;x++){
					System.out.println(Thread.currentThread().getName()+":Thread"+x);
				}
			}
		}.start();
	}
}
