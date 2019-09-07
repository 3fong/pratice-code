package web.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *�����	��ȡ�������������Ϣ
 *����socket����
 *����ʱ�����
 *��ȡ��
 *������
 *�����
 *�ر���
 */
public class Server2 {

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		
		String str = new String(bys,0,len);
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+":"+str);
		
		OutputStream os = s.getOutputStream();
		os.write("�ϴ��ɹ�".getBytes());
		
		s.close();
	}

}
