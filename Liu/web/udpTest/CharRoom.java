package udpTest;

import java.io.IOException;
import java.net.DatagramSocket;

/*
 *
 */
public class CharRoom {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		DatagramSocket dsr = new DatagramSocket(14471);
		
		SendThread st = new SendThread(ds);
		ReceiveThread rt = new ReceiveThread(dsr);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
	}

}
