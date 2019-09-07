package web.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *TCPЭ�������ݣ�
 * A:�������ն˵�Socket����
 * B:����ͻ������ӡ�����һ����Ӧ��Socket����
 * C:��ȡ����������ȡ�����ʾ�ڿ���̨
 * D:�ͷ���Դ
 */
public class Server1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12306);
		
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len=is.read(bys);
		
		String str = new String(bys,0,len);		
		String ip = s.getInetAddress().getHostAddress();		
		System.out.println(ip+":"+str);
		
		s.close();
		//ss.close();//��Ӧ�ùر�
	}
}
