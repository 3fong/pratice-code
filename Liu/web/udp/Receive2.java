package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *
 */
public class Receive2 {

	public static void main(String[] args) throws IOException{
		DatagramSocket ds = new DatagramSocket(11111);
//		while(true){
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys,bys.length);
			
			ds.receive(dp);
			
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			System.out.println(ip+":"+s);
//		}
		ds.close();
	}

}
