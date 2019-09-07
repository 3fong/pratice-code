package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 *创建求和线程run方法
 *	  Runnable接口复写的是run()，无返回值
 *	  Callable接口复写的是call()，有返回值
 */
class MySum implements Callable<Integer>{
	private int num;
	public MySum(int num) {
		super();
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int x=0;x<=num;x++){
			sum+=x;
		}
		return sum;
	}
	
}
public class ThreadPoolDemo2 {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();
		
		Future<Integer> f1 = es.submit(new MySum(100));
		Future<Integer> f2 = es.submit(new MySum(50));
		
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		es.shutdown();
	}

}
