package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//�ùܵ������ж�д����
class Read implements Runnable{
	private PipedInputStream pi;
	Read(PipedInputStream pi){
		this.pi=pi;
	}
	public void run(){
		try{
			System.out.println("��ȡǰ");
			byte[] buf=new byte[1024];
			int len=pi.read(buf);
			System.out.println("��ȡ��");
			System.out.println(new String(buf,0,len));			
		}
		catch(IOException e){
			throw new RuntimeException("��ȡʧ��");
		}
		finally{
			try{
				pi.close();
			}
			catch(IOException e){
				throw new RuntimeException("��ȡ�ر�ʧ��");
			}
		}
	}
}
class Write implements Runnable{
	private PipedOutputStream po;
	Write(PipedOutputStream po){
		this.po=po;
	}
	public void run(){
		try{
			System.out.println("3���д��");
			Thread.sleep(3000);
			po.write("piped coming".getBytes());
		}
		catch(Exception e){
			throw new RuntimeException("д��ʧ��");
		}
		finally{
			try{
				po.close();
			}
			catch(IOException e){
				throw new RuntimeException("д��ر�ʧ��");
			}
		}
	}
}
public class PipedStreamDemo {

	public static void main(String[] args) throws IOException{
		PipedInputStream pi = new PipedInputStream();
		PipedOutputStream po = new PipedOutputStream();
		pi.connect(po);
		
		Read r = new Read(pi);
		Write w = new Write(po);
		new Thread(r).start();
		new Thread(w).start();
	}
}