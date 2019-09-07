package threadPool;

import java.util.concurrent.Callable;

/*
 *��������߳�run����
 */
public class SumCallable implements Callable<Integer> {
	private int num;	
	public SumCallable(int num) {
		super();
		this.num = num;
	}

	public Integer call(){
		int sum=0;
		for(int x=1;x<=num;x++){
			sum+=x;
		}
		return sum;
	}
}
