package thread;
/*
 *��ȡ�߳����������ַ�����
 *getName()
 *���췽��
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
		//����һ���Զ��幹�췽������
		Get g3 = new Get("����С����");
		//��������setName()����
		g1.setName("zhangsan");
		g2.setName("ǿ");
		Three t = new Three();
		//��������Thread���췽������
		Thread t1 = new Thread(t,"˭�����ҵ�����");
		g1.start();
		g2.start();
	}

}
