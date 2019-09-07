package ramStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 *�ڴ�����������ڴ�����ʱ�洢��Ϣ��������������ݾʹ��ڴ�����ʧ��
	�ֽ����飺
		ByteArrayInputStream
		ByteArrayOutputStream
	�ַ����飺
		CharArrayReader
		CharArrayWriter
	�ַ�����
		StringReader
		StringWriter
	�ص㣺
	�������������ݵĲ���д����Զ�������
	δʹ��ϵͳ��Դ�����ý���close�رա�
 */
public class RamStream {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream ba = new ByteArrayOutputStream();
		
		for(int x=0;x<10;x++){
			//���ַ���ת��byte����
			ba.write(("hewls"+x).getBytes());
		}
//		ba.write(45121);
		//����һ���·���� byte ����
		byte[] by = ba.toByteArray();
		
		ByteArrayInputStream bi = new ByteArrayInputStream(by);
		
		int len=0;
		while((len=bi.read())!=-1){
			System.out.print((char)len);
		}
	}
//	public static 
}
