package chars;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *String(byte[] bytes, String charsetName):ͨ��ָ�����ַ��������ֽ�����
 * byte[] getBytes(String charsetName):ʹ��ָ�����ַ����ϰ��ַ�������Ϊ�ֽ�����
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "��Ů";
		//���� ���ַ���ת���ֽ�����
//		byte[] by = s.getBytes("GBK");//[-61, -64, -59, -82]
		
		byte[] by = s.getBytes("utf-8");//[-25, -66, -114, -27, -91, -77]
		//���ֽ�����ת���ַ���
		System.out.println(Arrays.toString(by));
		
		//���� ���ֽ�����ת���ַ���
		String str = new String(by,"utf-8");
		System.out.println(str);
		
		//���������󣬽���ʱ�ǲ�ʶ�����ĵı����ʱ������ͨ���ٱ����ȡ��ȷ�ֽ����顣
//		String str = new String(by,"ISO8859-1");
//		System.out.println(str);
//		byte[] by2 = str.getBytes("ISO8859-1");
//		System.out.println(Arrays.toString(by));
//		
//		String str2 = new String(by2,"utf-8");
//		System.out.println(str2);		
	}

}
