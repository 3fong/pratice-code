package thread;
/*
 *�������ڲ��ഴ�����̶߳���
 */
public class NIMingThread {

	public static void main(String[] args) {
		/*//����Thread������
		new Thread(){
			public void run(){
				for(int x=0;x<30;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		}.start();
		
		//����Runnable�����࣬�������ڲ���ȡ�����֣�������á�
		Runnable r = new Runnable(){
			public void run(){
				for(int x=0;x<35;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		};
		new Thread(r).start();*/
		
		//��ϰ棬���е���Thread��Runnableû�����С�
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<25;x++){
					System.out.println(Thread.currentThread().getName()+":Runnable"+x);
				}
			}
		},"����"){
			public void run(){
				for(int x=0;x<35;x++){
					System.out.println(Thread.currentThread().getName()+":Thread"+x);
				}
			}
		}.start();
	}
}
