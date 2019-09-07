package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 *注意：Runnable接口复写的是run()，无返回值
 *	  Callable接口复写的是call()，有返回值
 */
public class SumCallableDemo {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);

		//返回Future接口，检查计算是否完成，可以获取结果
		Future<Integer> f1 = es.submit(new SumCallable(50));
		Future<Integer> f2 = es.submit(new SumCallable(100));
				
		//调用Future的get()方法获取结果。
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		es.shutdown();
	}

}
