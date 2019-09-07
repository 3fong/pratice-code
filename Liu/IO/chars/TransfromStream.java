package chars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *ת����  ���Խ��б����д����
 * InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����
 * InputStreamReader(InputStream is,String charsetName):��ָ���ı����ȡ����
 * 
 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out,String charsetName):����ָ��������ֽ�������ת��Ϊ�ַ���
 * ���ֽ���ת��Ϊ�ַ�����
 * �ַ��� = �ֽ��� +�����
 */
public class TransfromStream {

	public static void main(String[] args) throws IOException {
		show1();
		show();
	}
	public static void show() throws IOException{
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\a.txt"));
		
		//ϵͳĬ�ϱ����ʱGBK������ͽ���ı�Ҫһ�¡�
		InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\a.txt"),"UTF-8");
		int len=0;
		while((len=isr.read())!=-1){
			System.out.println((char)len);			
		}
		isr.close();
	}
	public static void show1() throws IOException{
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"));
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"),"UTF-8");
		osw.write("�����");
		
		osw.close();
	}
}
