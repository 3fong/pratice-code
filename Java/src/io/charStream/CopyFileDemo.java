package io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *���󣺽�D�̵��ļ����Ƶ�F��
 */
public class CopyFileDemo {

	public static void main(String[] args) {
		File src = new File("F:\\z.txt");
		File aim = new File("D:\\aaaa.txt");
		copyFile(src,aim);
	}

	private static void copyFile(File src, File aim) {
		//JDK7�¼�����try(){} ()���ڽ������������Լ��ٹر���
		try(BufferedReader br = new BufferedReader(new FileReader(src));
			BufferedWriter bw = new BufferedWriter(new FileWriter(aim));){	
			String line=null;
			while((line=br.readLine())!=null){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}	
}
