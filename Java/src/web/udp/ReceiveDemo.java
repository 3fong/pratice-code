package web.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *����������նˣ�
 * 		java.net.BindException: Address already in use: Cannot bind
 * 		�˿ڱ�ռ�á�
 * 
 * 		����UDP���ն˵�Socket����
 * 		������ݰ����ڽ������
 * 		�������
 * 		������ݰ�
 * 		�ͷ���Դ
 */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true){
			//������ݰ�
			byte[] bytes = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
			
			//�������
			ds.receive(dp);
			
			//�������  getAddress()����InetAddress��
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			
			System.out.println("from"+ip+"data is:"+s);
		}
		//����Ӧ��һֱ���ŵȴ������ݣ�����Ҫ�ر�
//		ds.close();
	}
}
