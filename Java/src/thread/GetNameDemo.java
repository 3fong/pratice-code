package thread;
/*
 *获取线程名称有三种方法：
 *getName()
 *构造方法
 */
class Get extends Thread{
	private String name;	
	public Get() {
		super();		
	}
	Get(String name){
		this.name=name;
	}
	public void run(){
		for(int x=0;x<50;x++){
			System.out.println(getName()+":"+x);
		}
	}
}
class Three implements Runnable{
	public void run(){
		for(int x=0;x<40;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
public class GetNameDemo {

	public static void main(String[] args) {
		Get g1 = new Get();
		Get g2 = new Get();
		//方法一：自定义构造方法赋名
		Get g3 = new Get("海淀小霸王");
		//方法二：setName()赋名
		g1.setName("zhangsan");
		g2.setName("强");
		Three t = new Three();
		//方法三：Thread构造方法赋名
		Thread t1 = new Thread(t,"谁吃了我的奶酪");
		g1.start();
		g2.start();
	}

}
