package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *udp接收发送信息
 *		创建发送端的Socket对象
 *		创建数据并把数据打包
 *		发送数据
 *		释放资源
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		//创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		//封装键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		//因为是键盘录入必须定义结束语句，传输文件数据不用定义，因为有结束标志。
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			//创建数据并打包
			byte[] bytes = line.getBytes();
			
			//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
			InetAddress ia = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ia,12345);
			
			ds.send(dp);
		}
		ds.close();
	}
}
