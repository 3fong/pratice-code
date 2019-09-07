package io.others;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 *�ܵ�����PipedInputStream��PipedOutputStream��
1���ص㣺
1.1 ������������������ӣ�ʡȥ��������洢��ݵ���ת���ڡ�
1.2 ʹ�ö��߳̽���ܵ�ִ��˳�����⣬��ֹ���������	
2�����ӷ�ʽ��
2.1 connect(PipedOutputStream src)�����ӣ�˳��̶���
2.2 PipedInputStream()��������δ���ӵ�PipedInputStream��
2.3 PipedOutputStream()��������δ���ӵ�PipedOutputStream��
PS��	
�������漰��IO������Properies��IO���漰�����̵߳��ǹܵ�����
 */
class Read implements Runnable{
	private PipedInputStream pis;
	public Read(PipedInputStream pis) {
		super();
		this.pis = pis;
	}
	public void run(){
		try {
			System.out.println("����ǰ��");
			byte[] bys = new byte[15];
			int len = pis.read(bys);
			System.out.println("����󡣡�������������");
			System.out.println(new String(bys,0,len));
			pis.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
class Writer implements Runnable{
	private PipedOutputStream pos;
	public Writer(PipedOutputStream pos) {
		super();
		this.pos = pos;
	}
	public void run(){
		try {
			System.out.println("3���д�����");
			Thread.sleep(3000);
			pos.write("�ܵ������ˣ�".getBytes());
			System.out.println("���д��ɹ�");
			pos.close();
		} catch (IOException | InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
public class PipedStreamDemo {

	public static void main(String[] args) throws IOException {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		pis.connect(pos);
		
		Read r = new Read(pis);
		Writer w = new Writer(pos);
		new Thread(r).start();
		new Thread(w).start();
	}

}
