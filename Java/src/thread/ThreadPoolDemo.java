package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程
	池中成为空闲状态，等待下一个对象来使用。
	public static ExecutorService newCachedThreadPool();
	public static ExecutorService newFixedThreadPool(int Threads);
	public static ExecutorService newSingleThreadExecutor();
	上面返回线程池，启动线程方法如下：
	Future<?>submit(Runnable task)
	<T>Future<T>submit(Callable<T> task)
 */
class ThreadPool implements Runnable {
	public void run(){
		for(int x=0;x<20;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//创建线程池对象，控制要创建几个线程对象。
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.submit(new ThreadPool());
		es.submit(new ThreadPool());
		//建立固定线程池，等前面线程执行完再执行新线程
		es.submit(new ThreadPool());
		
		es.shutdown();
	}
}
