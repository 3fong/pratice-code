package tcp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *客户端文本文件，服务器输出到控制台
 */
public class Client5 {

	public static void main(String[] args) throws IOException{
		Socket s = new Socket("127.0.0.1",12306);
		
		BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		s.close();
		br.close();
	}

}
