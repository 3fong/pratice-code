package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 *���󣺰ѵ�ǰĿ¼�µ�java.txt�����ݸ��Ƶ�g���µ�b.txt��
 *
 *����������ʶ��ʲôʱ��ð������ֽ�ת��Ϊһ��������?
 * �ڼ���������ĵĴ洢�������ֽڣ�
 * 		��һ���ֽڿ϶��Ǹ�����
 * 		�ڶ����ֽڳ������Ǹ���������������������ûӰ�졣
 */
public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		show();
	}
	//����������ĵ�ת��
	public static void show(){
//		String s = "abcde";//[97, 98, 99, 100, 101]
		//�ַ���ת�ֽ�
		
		String s = "�Ұ���";//[-50, -46, -80, -82, -60, -29]
		byte[] bytes = s.getBytes();
		//������ת���ַ���
		System.out.println(Arrays.toString(bytes));
	}
	public static void show2() throws IOException{
		FileInputStream fis = new FileInputStream("java.txt");
		
		FileOutputStream fos = new FileOutputStream("F:\\b.txt");
		
		int len=0;
		while((len=fis.read())!=-1){
			fos.write(len);
			
			//�������ʱ�漰ǿת������ֲ���ʶ���ַ�����ֱ�����ֽ���д��û�����⣬��Ϊδ�漰ת��
			System.out.println((char)len);
		}
		fis.close();
		fos.close();
	}
}
