package thread;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 *需求：用多线程向集合中每隔300毫秒存入一个整数
 */
class Store implements Runnable{
	ArrayList<Integer> al = new ArrayList<Integer>();
	public void run(){
		try {
			int num = (int)(Math.random()*10+1);
			al.add(num);
			for(ListIterator<Integer> li = al.listIterator();li.hasNext();){
				for(int x=0;x<3;x++){
					Thread.sleep(300);
					int num2 = (int)(Math.random()*10+1);
					li.add(num2);
					System.out.println(Thread.currentThread().getName()+":"+al);
				}
			}												
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
public class StoreNumDemo {

	public static void main(String[] args) {
		Store s = new Store();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.start();
		t2.start();
	}
}
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