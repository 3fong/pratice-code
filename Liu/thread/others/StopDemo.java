package others;
/*
 *public final void stop():���߳�ֹͣ����ʱ�ˣ����ǻ�����ʹ�á�
 * public void interrupt():�ж��̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��
 */
public class StopDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadStop ts = new ThreadStop();
		ts.start();
		Thread.sleep(3000);
		ts.interrupt();
//		ts.stop();
	}

}
