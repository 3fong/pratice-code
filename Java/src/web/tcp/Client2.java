package web.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 *�ͻ���	����󣬽��շ�����Ϣ
 *����socket����
 *�����
 *������
 *�ر���
 */
public class Client2 {

	public static void main(String[] args) throws IOException{
		Socket s = new Socket(InetAddress.getByName("127.0.0.1"),12306);
		
		OutputStream os = s.getOutputStream();
		os.write("ni hao a ���˼�".getBytes());
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len=is.read(bys);
		
		//������ת���ַ�
		String str = new String(bys,0,len);
		System.out.println(str);

		s.close();
	}

}
