package web.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *�ͻ����ı��ļ������������������̨
 */
public class Server5 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		s.close();
		
		ss.close();
	}

}
