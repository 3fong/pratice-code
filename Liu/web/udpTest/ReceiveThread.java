package udpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *
 */
public class ReceiveThread implements Runnable {
	private DatagramSocket ds;

	public ReceiveThread(DatagramSocket ds) {
		super();
		this.ds = ds;
	}
	public void run(){
		try{
			while(true){
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys,bys.length);
				
				ds.receive(dp);
				
				String ip = dp.getAddress().getHostAddress();
				String s = new String(dp.getData(),0,dp.getLength());
				System.out.println(ip+":"+s);			
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
