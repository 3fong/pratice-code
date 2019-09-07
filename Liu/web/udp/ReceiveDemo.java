package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *多次启动接收端：
 * 		java.net.BindException: Address already in use: Cannot bind
 * 		端口被占用。
 * 
 * 		创建UDP接收端的Socket对象
 * 		创建数据包用于接收数据
 * 		接收数据
 * 		解析数据包
 * 		释放资源
 */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true){
			//创建数据包
			byte[] bytes = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
			
			//接收数据
			ds.receive(dp);
			
			//解析数据  getAddress()返回InetAddress类
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			
			System.out.println("from"+ip+"data is:"+s);
		}
		//接收应该一直开着等待接收数据，不需要关闭
//		ds.close();
	}
}
