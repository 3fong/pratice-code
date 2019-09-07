package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 *客户端	输出后，接收反馈信息
 *建立socket对象
 *输出流
 *接收流
 *关闭流
 */
public class Client2 {

	public static void main(String[] args) throws IOException{
		Socket s = new Socket(InetAddress.getByName("127.0.0.1"),12306);
		
		OutputStream os = s.getOutputStream();
		os.write("ni hao a 老人家".getBytes());
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len=is.read(bys);
		
		//将数组转成字符串
		String str = new String(bys,0,len);
		System.out.println(str);

		s.close();
	}

}
