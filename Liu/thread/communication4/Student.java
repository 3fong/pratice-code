package communication4;
/*
 *代码优化，将设置和获取方法抽取出来，方便方法调用
 */
public class Student {
	private String name;
	private int age;
	private boolean flag;//使用默认值，如果是true代表有值
	public synchronized void set(String name,int age){
		
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		}
		this.name=name;
		this.age=age;
			
		flag=true;
		this.notify();
	}
	public synchronized void get(){			
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		}
		System.out.println(this.name +":"+this.age);
		flag=false;
		this.notify();
	}
}
