package tcp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *可以多客户访问的服务器
 */
public class ClientT {

	public static void main(String[] args) throws IOException{
		Socket s = new Socket("127.0.0.1",12306);
		
		BufferedReader br = new BufferedReader(new FileReader("F:\\b.txt"));
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		s.shutdownOutput();

//		InputStream is  = s.getInputStream();
//		byte[] bys = new byte[1024];
//		int len =is.read(bys);
//		System.out.println(new String(bys,0,len));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line2 = br2.readLine();
		System.out.println(line2);
		
		s.close();
		br.close();
	}

}
