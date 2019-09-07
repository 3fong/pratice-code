package web.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *UDPЭ�������ݣ�
 * A:�������ն�Socket����
 * B:����һ����ݰ�(��������)
 * C:����Socket����Ľ��շ����������
 * D:������ݰ���ʾ�ڿ���̨
 * E:�ͷ���Դ
 */
public class Receive1 {

	public static void main(String[] args) throws IOException {
		// �������ն�Socket����   DatagramSocket(int port)
		DatagramSocket ds = new DatagramSocket(12306);
		
		// ����һ����ݰ�(��������)
		// DatagramPacket(byte[] buf, int length)
		byte[] bys =new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys,bys.length);
		
		ds.receive(dp);
		
		//������ݰ���ʾ�ڿ���̨
		//��ȡip
		InetAddress ia = dp.getAddress();
		String ip = ia.getHostAddress();
		
		// public byte[] getData():��ȡ��ݻ�����
		// public int getLength():��ȡ��ݵ�ʵ�ʳ���
		byte[] bys2 = dp.getData();
		int len = dp.getLength();
		String s = new String(bys2,0,len);
		System.out.println(ip+":"+s);
		
		ds.close();
	}

}
