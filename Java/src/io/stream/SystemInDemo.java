package io.stream;

import java.io.IOException;
import java.io.InputStream;

/*
 *����
	ͨ�����¼����ݡ���¼��һ����ݺ󣬾ͽ�������ݽ��д�ӡ��
	���¼��������over,��ôֹͣ¼�롣
    ע�⣺�ֶ�������붨������ǣ���ȡ�ı����ã���Ϊ�н�����
 */
public class SystemInDemo {

	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		StringBuilder sb = new StringBuilder();
		//���廻�кͽ����� ���о���readLine�Ĵ���
		while(true){
			int len=is.read();
			if(len=='\r')
				continue;
			if(len=='\n'){	
				String s = sb.toString();
				if("over".equals(s))
					break;
				//���ַ�ת���ɴ�д�����
				System.out.println(s.toUpperCase());
				//����ַ����
				sb.delete(0,sb.length());
			}
			else
				sb.append((char)len);				
		}	
	}

}
