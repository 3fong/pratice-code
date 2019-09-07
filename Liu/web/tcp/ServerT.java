package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *给服务器加上多线程
 */
public class ServerT {

	public static void main(String[] args) throws IOException {		
		ServerSocket ss = new ServerSocket(12306);
			
		while(true){
			Socket s = ss.accept();			
			new Thread(new UserThread(s)).start();
			
		}
	}

}
