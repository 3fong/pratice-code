package ticketSynchronised;
/*
 *�����߳����� 
 *	ͬ����������ԭ�� ���Կ����ϲ���
 */
public class Ticket implements Runnable {
	private int ticket=100;
	Object o = new Object();
	public void run(){
		while(true){
					//-->t1 -->t2 -->t3 �����߳�������������ж�������t1�Ƚ�ȥ
					//C:t1����ʱ��t2��t3������ִ��Ȩ����������˭��ȡִ��Ȩ����Ϊ���ţ����޷���ȥ��F�������߳���������ִ��Ȩ
			synchronized(o){//-->A:t1 ���룬����
				if(ticket>0){
					try {
						Thread.sleep(10);//B:t1����������10���룬ɥʧִ��Ȩ 
											//D��t1���߽����ػ��ִ��Ȩ�����������ִ��
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
				}//E:t1ִ�н��������ų�ȥ��
			}
		}
	}
}
