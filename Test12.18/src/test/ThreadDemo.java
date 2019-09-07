package test;
/*
 *2.编写一个java程序实现多线程，在线程中输出线程的名字，隔300毫秒输出一次，共输出20次。
 	分析:
 		实现多线程有两种方式：
 			1：继承Thread
 			2：实现Runnable
 		由于Runnable避免了继承的局限性，所以我在此例中使用了Runnable
 		复写run方法，定义多线程执行代码。因为共享语句有多条，所以加入锁
 		保证数据合理性。
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
		
		Thread t1 = new Thread(name,"赵云");
		Thread t2 = new Thread(name,"李元霸");
		t1.start();
		t2.start();
	}
}
