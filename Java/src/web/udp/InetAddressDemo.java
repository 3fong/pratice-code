package web.udp;

import java.io.IOException;
import java.net.InetAddress;

/*
 *���һ����û�й��췽����
 * A:��Աȫ���Ǿ�̬��(Math,Arrays,Collections)
 * B:�������ģʽ(Runtime)
 * C:�����о�̬�������ظ���Ķ���(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * ��InetAddress�ĳ�Ա������
 * public static InetAddress getByName(String host):������������IP��ַ���ַ��ʾ�õ�IP��ַ����
 * 
 *  		//��ȡ������Ϣ
			InetAddress ia = InetAddress.getLocalHost();
			//��ȡ����IP
			String ip = ia.getHostAddress();
			//��ȡ�������
			String name = ia.getHostName();
 */
public class InetAddressDemo {

	public static void main(String[] args) throws IOException {
		InetAddress ia = InetAddress.getByName("���Ԫ");
//		InetAddress ia = InetAddress.getByName("127.0.0.1");
		
		//��ȡ��������
		String name = ia.getHostName();
		
		//��ȡ����IP��ַ
		String ip = ia.getHostAddress();
		System.out.println(name+":"+ip);
	}
}
