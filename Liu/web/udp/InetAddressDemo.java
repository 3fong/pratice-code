package udp;

import java.io.IOException;
import java.net.InetAddress;

/*
 *如果一个类没有构造方法：
 * A:成员全部是静态的(Math,Arrays,Collections)
 * B:单例设计模式(Runtime)
 * C:类中有静态方法返回该类的对象(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * 看InetAddress的成员方法：
 * public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到IP地址对象
 * 
 *  		//获取主机信息
			InetAddress ia = InetAddress.getLocalHost();
			//获取主机IP
			String ip = ia.getHostAddress();
			//获取主机名称
			String name = ia.getHostName();
 */
public class InetAddressDemo {

	public static void main(String[] args) throws IOException {
		InetAddress ia = InetAddress.getByName("异次元");
//		InetAddress ia = InetAddress.getByName("127.0.0.1");
		
		//获取：主机名
		String name = ia.getHostName();
		
		//获取：，IP地址
		String ip = ia.getHostAddress();
		System.out.println(name+":"+ip);
	}
}
