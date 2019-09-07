package thread;

//创建两个线程和主线程交替执行

class Demo extends Thread{

	Demo(String name){
		super(name);
	}
	public void run(){
		for(int x=0;x<60;x++){
			System.out.println((Thread.currentThread()==this)+"...."+this.getName()+x);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Demo d1 = new Demo("one");
		Demo d2 = new Demo("two");
		d1.start();
		d2.start();
		
		for(int x=0;x<60;x++){
			System.out.println("........"+x);
		}
		
	}

}
