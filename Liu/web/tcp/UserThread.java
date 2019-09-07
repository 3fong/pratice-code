package tcp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *给服务器加上多线程，方便多客户访问
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
			PrintWriter pw = new PrintWriter(new FileWriter("F:\\新建文件夹\\"+name),true);
		
			String line = null;
			while((line=br.readLine())!=null){
				pw.println(line);
			}
			
//			OutputStream os = s.getOutputStream();
//			os.write("文件上传成功".getBytes());			
			PrintWriter pw2 = new PrintWriter(s.getOutputStream(),true);
			pw2.println("文件上传成功");
			
			s.close();
			pw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
