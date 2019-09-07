package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *�̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��߳�
	���г�Ϊ����״̬���ȴ���һ��������ʹ�á�
	public static ExecutorService newCachedThreadPool();
	public static ExecutorService newFixedThreadPool(int Threads);
	public static ExecutorService newSingleThreadExecutor();
	���淵���̳߳أ������̷߳������£�
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
		//�����̳߳ض��󣬿���Ҫ���������̶߳���
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.submit(new ThreadPool());
		es.submit(new ThreadPool());
		//�����̶��̳߳أ���ǰ���߳�ִ������ִ�����߳�
		es.submit(new ThreadPool());
		
		es.shutdown();
	}
}
