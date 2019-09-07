package thread;

//线程间通信。加锁时注意锁的唯一性。
class Res{
	String name;
	String sex;
	boolean flag = false;
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
				if(r.flag)
					try{r.wait();}catch(Exception e){}
				if(x==0){
					r.name="二娃";
					r.sex="男";								
				}
				else{
					r.name="cuihua";
					r.sex="wwwwwwwwwww";
				}
				x=(x+1)%2;
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
				if(!r.flag)
					try{r.wait();}catch(Exception e){}
				System.out.println(r.name+":"+r.sex);
				r.flag=false;
				r.notify();
			}
		}
	}
}
public class InputOutputDemo {

	public static void main(String[] args) {
		Res r = new Res();
		Input in = new Input(r);
		Output ou = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(ou);
		t1.start();
		t2.start();
	}
}
