package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *TCP协议接收数据：
 * A:创建接收端的Socket对象
 * B:监听客户端连接。返回一个对应的Socket对象
 * C:获取输入流，读取数据显示在控制台
 * D:释放资源
 */
public class Server1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12306);
		
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len=is.read(bys);
		
		String str = new String(bys,0,len);		
		String ip = s.getInetAddress().getHostAddress();		
		System.out.println(ip+":"+str);
		
		s.close();
		//ss.close();//不应该关闭
	}
}
