package ticketSynStatic;
/*
 *a ͬ������顣������һ��������װ���룬���Ⱥ�������һ��ͬ���ԡ�
	synchronized(����)
	{
		��Ҫ��ͬ���Ĵ���-->�����������ݵ����
	}
 *b ͬ�����������躯��ͬ���ԡ�
	public synchronized void add(){}
      
      ͬ������������������
      ͬ��������this
      ��̬ͬ�����������ֽ����ļ�
 */
public class TikcetRunnableDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t,"ó");
		Thread t2 = new Thread(t,"ֱ��");
		Thread t3 = new Thread(t,"����ƥ��");
		t1.start();
		t2.start();
		t3.start();
	}

}
