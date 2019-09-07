package io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 *���󣺼����������뵽����̨
	System.in:��Ӧ�ı�׼�����豸�����̡� ����InputStream���͡�
	����ʽ������û�л�ȡ����ݾͻ�ȴ�
	System.out:��Ӧ�ı�׼������豸������̨������PrintStream���͡�
	Ϊ�˱��ڹۿ�������ϣ���׼�����������¼�룬����ʵ����readLine���ܣ���Ҫ���ֽ���
	ת�����ַ��������ô˹��ܡ�
	ת������InputStreamReader��OutputStreamWriter
      ת����ʲôʱ��ʹ�ã�
	ͨ�����漰���ַ����ת��ʱʹ�á������ַ���ֽ�֮���������
	System.setIn();System.setOut()
 */
public class StreamReaderWriter {

	public static void main(String[] args) throws IOException{
		//��Դ��Ϊ�ı�
		System.setIn(new FileInputStream("F:\\z.txt"));
		//�޸�Ŀ��·��
		System.setOut(new PrintStream("F:\\copy.txt"));
		//����׼������ת����ת���ַ����������뻺����
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//���ַ�����ת����ת�ɱ�׼����������뻺����
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line=br.readLine())!=null){
			if(line.equals("over"))
				break;
			bw.write(line);
			bw.newLine();
			bw.flush();
//			System.out.println(line);
		}		
	}
}
