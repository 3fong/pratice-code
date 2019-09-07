package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//用管道流进行读写数据
class Read implements Runnable{
	private PipedInputStream pi;
	Read(PipedInputStream pi){
		this.pi=pi;
	}
	public void run(){
		try{
			System.out.println("读取前");
			byte[] buf=new byte[1024];
			int len=pi.read(buf);
			System.out.println("读取后");
			System.out.println(new String(buf,0,len));			
		}
		catch(IOException e){
			throw new RuntimeException("读取失败");
		}
		finally{
			try{
				pi.close();
			}
			catch(IOException e){
				throw new RuntimeException("读取关闭失败");
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
			System.out.println("3秒后写入");
			Thread.sleep(3000);
			po.write("piped coming".getBytes());
		}
		catch(Exception e){
			throw new RuntimeException("写入失败");
		}
		finally{
			try{
				po.close();
			}
			catch(IOException e){
				throw new RuntimeException("写入关闭失败");
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