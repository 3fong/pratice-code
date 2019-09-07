package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class Send1 {

	public static void main(String[] args) throws IOException{
		DatagramSocket ds = new DatagramSocket();
		
		byte[] bys = "hello,你好！".getBytes();
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(bys,bys.length,ia,12306);
		
		// 调用Socket对象的发送方法发送数据包
		// public void send(DatagramPacket p)
		ds.send(dp);
		
		ds.close();
	}

}
