package thread;
/*
 *�̼߳�ͨѶ����Դ������ơ�
ע�⣺
1������������ͬ������Ϊ��������ͬ�������ݡ�
2�����ͬ��ʱ������ѡ��Ҫ����Ψһ�ԡ������ԣ������߳��޷�������Թ�ϵ��
3��wait()��notify()��notyfyAll()��������Object���С���Ϊ������������������ķ�������ͨ���ԡ�
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
					r.name="���޼�";
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
