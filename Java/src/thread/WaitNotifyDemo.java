package thread;
/*
 *线程间通讯：资源共享机制。
注意：
1、本例有两个同步，因为有两个共同操作数据。
2、多个同步时，锁的选择要具有唯一性、共享性，否则线程无法建立相对关系。
3、wait()、notify()、notyfyAll()被定义在Object类中。因为锁可以是任意对象，锁的方法具有通用性。
 */
class Res{
	String name;
	int age;
	boolean flag=false;
}
class Input implements Runnable{
	private Res r;
	Input(Res r){
		this.r=r;
	}
	public void run(){
		int x = 0;
		while(true){			
			synchronized(r){
				if(r.flag){				
					try {
						r.wait();
					} catch (Exception e) {}				
				}
				if(x%2==0){
					r.name="zhangsan";
					r.age=20;
				}else{
					r.name="张无忌";
					r.age=9;
				}
				x++;
				r.flag=true;
				r.notify();				
			}
		}
	}
}
class Output implements Runnable{
	private Res r;
	Output(Res r){
		this.r=r;
	}
	public void run(){
		while(true){
			synchronized(r){
				if(!r.flag){
					try {
						r.wait();
					} catch (Exception e) {}
				}
				System.out.println(r.name+"--"+r.age);
				r.flag=false;
				r.notify();
			}
		}
	}
}
public class WaitNotifyDemo {

	public static void main(String[] args) {
		Res r = new Res();
		Input i = new Input(r);
		Output o = new Output(r);
		
		new Thread(i).start();
		new Thread(o).start();
	}

}
