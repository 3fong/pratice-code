package web.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *��������շ��ĳ��ַ�������������Ϣ
 */
public class Server3 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\jia.txt"),true);
		String line =null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("�ϴ��ɹ���");
		bw.newLine();
		bw.flush();
		
		s.close();
//		br.close();
		pw.close();
	}
}
