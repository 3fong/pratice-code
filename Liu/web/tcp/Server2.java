package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *服务端	读取流后输出反馈信息
 *建立socket对象
 *建立时间监听
 *读取流
 *解析流
 *输出流
 *关闭流
 */
public class Server2 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		
		String str = new String(bys,0,len);
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+":"+str);
		
		OutputStream os = s.getOutputStream();
		os.write("上传成功".getBytes());
		
		s.close();
	}

}
