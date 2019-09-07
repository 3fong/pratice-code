package tcp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *�ͻ��˼���¼�룬����������ı��ļ�
 */
public class Server4 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\a.txt"));
		
		String line=null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		s.close();
		pw.close();
	}

}
