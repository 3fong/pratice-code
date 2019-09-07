package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *
 */
public class Send2 {

	public static void main(String[] args) throws IOException{
		DatagramSocket ds = new DatagramSocket();
		
//		InetAddress ia = InetAddress.getLocalHost();
//		System.out.println(ia);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = null;
//		while((line=br.readLine())!=null){
//			if(line.equals("886"))
//				break;
			
			byte[] bys = "hello".getBytes();
			DatagramPacket dp = new DatagramPacket(bys,bys.length,
					InetAddress.getByName("127.0.0.1"),11111);
			
			ds.send(dp);
//		}
		
		
		ds.close();
	}

}
