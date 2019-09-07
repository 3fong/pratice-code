package com.liu.mytest;

class Test implements Runnable{
	public void run(){
		try {
			
			for(int x=0;x<10;x++){
				Thread.sleep(300);
				System.out.println(Thread.currentThread().getName()+".........."+x);
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} 		
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Test t = new Test();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}
}
