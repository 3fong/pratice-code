package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 *ע�⣺Runnable�ӿڸ�д����run()���޷���ֵ
 *	  Callable�ӿڸ�д����call()���з���ֵ
 */
public class SumCallableDemo {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);

		//����Future�ӿڣ��������Ƿ���ɣ����Ի�ȡ���
		Future<Integer> f1 = es.submit(new SumCallable(50));
		Future<Integer> f2 = es.submit(new SumCallable(100));
				
		//����Future��get()������ȡ�����
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		es.shutdown();
	}

}
