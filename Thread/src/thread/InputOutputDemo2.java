package thread;
//�Ż��̼߳�ͨѶ����

class Res1{
	private String name;
	private String sex;
	private boolean flag=false;
	public synchronized void set(String name,String sex){
		while(this.flag)
			try{this.wait();}catch(Exception e){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out(){
		while(!this.flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(this.name+"..."+this.sex);
		flag=false;
		this.notify();
	}
}
class Input1 implements Runnable{
	private Res1 r;
	Input1(Res1 r){
		this.r=r;
	}
	public void run(){
		int x = 0;
		while(true){
			if(x==0)
				r.set("����","��");
			else
				r.set("cuihua","wwwwwwww");
			x=(x+1)%2;
		}
	}
}
class Output1 implements Runnable{
	private Res1 r;
	Output1(Res1 r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.out();
		}
	}
}
public class InputOutputDemo2 {

	public static void main(String[] args) {
		Res1 r = new Res1();
		
		new Thread(new Input1(r)).start();
		new Thread(new Output1(r)).start();
	}

}
