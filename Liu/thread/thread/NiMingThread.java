package thread;
/*
 *�����ڲ���ĸ�ʽ��
 * 		new �������߽ӿ���() {
 * 			��д����;
 * 		};
 * 		���ʣ��Ǹ�����߽ӿڵ��������
 */
public class NiMingThread {

	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(getName()+"--------"+x);
				}
			}
		}.start();
		
		Runnable r = new Runnable(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(Thread.currentThread().getName()+"++++"+x);
				}
			}
		};
//		Thread t = new Thread(r);
//		t.start();
		new Thread(r,"��").start();
		
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(Thread.currentThread().getName()+"*****"+x);
				}
			}
		},"����").start();
		
		//���ѵģ�ִֻ��Thread��run������
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		},"���Ƴ�"){
			public void run(){
				for(int x=0;x<20;x++){
					System.out.println(getName()+"-------"+x);
				}
			}
		}.start();;
	}

}
