package web.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *UDPЭ�鷢����ݣ�
 * A:�������Ͷ�Socket����
 * B:������ݣ�������ݴ��
 * C:����Socket����ķ��ͷ���������ݰ�
 * D:�ͷ���Դ
 */
public class Send1 {

	public static void main(String[] args) throws IOException{
		DatagramSocket ds = new DatagramSocket();
		
		byte[] bys = "hello,��ã�".getBytes();
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(bys,bys.length,ia,12306);
		
		// ����Socket����ķ��ͷ���������ݰ�
		// public void send(DatagramPacket p)
		ds.send(dp);
		
		ds.close();
	}

}
