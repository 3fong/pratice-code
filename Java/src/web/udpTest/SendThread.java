package web.udpTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *
 */
public class SendThread implements Runnable {
	private DatagramSocket ds;
	
	public SendThread(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	public void run(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while((line=br.readLine())!=null){
				if("886".equals(line)){
					break;
				}
				byte[] bys = line.getBytes();
				DatagramPacket dp = new DatagramPacket(bys,bys.length,
							InetAddress.getByName("127.0.0.1"),14471);
				ds.send(dp);
			}
			ds.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
