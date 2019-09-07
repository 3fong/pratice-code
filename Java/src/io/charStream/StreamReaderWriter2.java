package io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *��ϰ��������¼�����ݰ���utf-8���������ļ��С�
 *������
 *	�漰����?����ת����
 * InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ���
 * InputStreamReader(InputStream is,String charsetName):��ָ���ı����ȡ���
 * 
 * OutputStreamWriter(OutputStream out):���Ĭ�ϱ�����ֽ��������ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out,String charsetName):���ָ��������ֽ������ת��Ϊ�ַ���
 */
public class StreamReaderWriter2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream("F:\\A.txt",true),"Unicode"));//�ɸ�д
		String line =null;
		while((line=br.readLine())!=null){
			if(line.equals("over"))
				break;
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
