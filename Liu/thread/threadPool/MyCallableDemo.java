package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *
 */
public class MyCallableDemo {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.submit(new MyCallable());
		es.submit(new MyCallable());
		
		es.shutdown();
	}

}
