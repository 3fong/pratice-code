package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 *TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 		这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 * 
 * 连接被拒绝。TCP协议一定要先看服务器。
 */
public class Client1 {
	public static void main(String[] args) throws IOException, IOException {
		//创建发送端的Socket对象
		//Socket(InetAddress ia,int port)
		//Socket(String host,int port)
//		Socket s = new Socket(InetAddress.getByName("127.0.0.1"),12306);
		Socket s = new Socket("127.0.0.1",12306);
		
		//获取输出流
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp.我来了".getBytes());
		
		s.close();
	}
}
