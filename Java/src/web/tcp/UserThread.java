package web.tcp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *����������϶��̣߳������ͻ�����
 */
public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		super();
		this.s = s;
	}
	public void run(){
		BufferedReader br = null;
		try {
			br =new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String name = System.currentTimeMillis()+".txt";
			PrintWriter pw = new PrintWriter(new FileWriter("F:\\�½��ļ���\\"+name),true);
		
			String line = null;
			while((line=br.readLine())!=null){
				pw.println(line);
			}
			
//			OutputStream os = s.getOutputStream();
//			os.write("�ļ��ϴ��ɹ�".getBytes());			
			PrintWriter pw2 = new PrintWriter(s.getOutputStream(),true);
			pw2.println("�ļ��ϴ��ɹ�");
			
			s.close();
			pw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
