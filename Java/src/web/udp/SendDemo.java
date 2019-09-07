package web.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *udp���շ�����Ϣ
 *		�������Ͷ˵�Socket����
 *		������ݲ�����ݴ��
 *		�������
 *		�ͷ���Դ
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		//�������Ͷ˵�Socket����
		DatagramSocket ds = new DatagramSocket();
		
		//��װ����¼�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		//��Ϊ�Ǽ���¼����붨�������䣬�����ļ���ݲ��ö��壬��Ϊ�н����־��
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			//������ݲ����
			byte[] bytes = line.getBytes();
			
			//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
			InetAddress ia = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ia,12345);
			
			ds.send(dp);
		}
		ds.close();
	}
}
