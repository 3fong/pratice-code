package web.tcp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *�ͻ��˶�ȡ�ı���������������ı�
 */
public class Server6 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\copy.txt"),true);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		s.close();
		pw.close();
	}

}
