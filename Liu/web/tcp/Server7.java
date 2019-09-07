package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *���ո���ͼƬ��������
 */
public class Server7 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		
		Socket s = ss.accept();
		
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\c.jpg"));
		
		byte[] bys = new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys,0,len);
			bos.flush();
		}
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("ͼƬ�ϴ��ɹ�");
		
//		OutputStream os = s.getOutputStream();
//		os.write("�ļ��ϴ��ɹ�".getBytes());
		s.close();
		bos.close();
		ss.close();
	}

}
