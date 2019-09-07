package test33;
/*
 *声明一个共享数组，起两个线程，两个线程分别隔一段时间(可以写一个随机数)，给数组中添加数据，
	每一个线程为数组添加3个数据即可。
 */
class AddNum implements Runnable{
	int[] arr=new int[3];
	public void run(){
		try {
			synchronized(arr){
				for(int x=0;x<3;x++){
					Thread.sleep(300);
					int num = (int)(Math.random()*10+1);		
					arr[x]=num;
					System.out.print(Thread.currentThread().getName()+":"+arr[x]+" ");
					System.out.println();
				}
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
public class T20AddNumDemo {

	public static void main(String[] args) {
		AddNum an = new AddNum();
		
		Thread t1 = new Thread(an);
		Thread t2 = new Thread(an);
		t1.start();
		t2.start();
				
	}
}
