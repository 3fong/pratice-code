package web.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 *TCPЭ�鷢����ݣ�
 * A:�������Ͷ˵�Socket����
 * 		��һ�����ɹ�����˵�������Ѿ������ɹ��ˡ�
 * B:��ȡ�������д���
 * C:�ͷ���Դ
 * 
 * ���ӱ��ܾ�TCPЭ��һ��Ҫ�ȿ���������
 */
public class Client1 {
	public static void main(String[] args) throws IOException, IOException {
		//�������Ͷ˵�Socket����
		//Socket(InetAddress ia,int port)
		//Socket(String host,int port)
//		Socket s = new Socket(InetAddress.getByName("127.0.0.1"),12306);
		Socket s = new Socket("127.0.0.1",12306);
		
		//��ȡ�����
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp.������".getBytes());
		
		s.close();
	}
}
