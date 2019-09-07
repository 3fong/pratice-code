package web.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 *�ϴ�ͼƬ������ȡ����
 */
public class Client7 {

	public static void main(String[] args) throws IOException{
		Socket s = new Socket("127.0.0.1",12306);
		
		BufferedInputStream pis = new BufferedInputStream(new FileInputStream("F:\\a.jpg"));
		BufferedOutputStream pos = new BufferedOutputStream(s.getOutputStream());
		
		byte[] bys = new byte[1024];
		int len=0;
		while((len=pis.read(bys))!=-1){
			pos.write(bys,0,len);
			pos.flush();
		}
		
		s.shutdownOutput();
//		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//		String line = br.readLine();
//		System.out.println(line);
		
		s.close();
		pis.close();
	}

}
