package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *客户端键盘录入，服务器输出文本文件
 */
public class Client4 {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("127.0.0.1",12306);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//启动自动刷新需要两步：构造方法、println()方法。
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=br.readLine())!=null){
			if("886".equals(line))
				break;
			pw.println(line);
		}
		s.close();
	}
}
