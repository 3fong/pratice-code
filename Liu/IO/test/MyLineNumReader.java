package test;

import java.io.IOException;
import java.io.Reader;

/*
 *�Զ����кŻ�����LineNumberReader
 *������	
 *		��Ϊ����BufferedReader�����࣬����Ҫ����ʹ����Ҫ�߱�BufferedReader�Ĺ���
 *		�кŵ����úͻ�ȡ���ܼ򵥣�����ֻҪ���к����������ݶ�ȡ�󶨲ź���
 */
public class MyLineNumReader {
	private Reader r;
	private int num;
	public MyLineNumReader(Reader r) {
		this.r = r;
	}
	public String MyRead() throws IOException{
		StringBuilder sb = new StringBuilder();
		
		//������������Ϊ��ȡ���ݣ���������Ӧ�����ڶ�ȡ������
		num++;
		
		int len=0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n'){
				return sb.toString();
			}
			else{
				//��Ϊ���ַ���������Ҫ���ֽ�ת��Ϊ�ַ�
				sb.append((char)len);
			}
		}
		//�ж���'\n'������
		if(sb.length()!=0){
			return sb.toString();
		}
		return null;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
//		num++;//ֻҪ���þ�����������������ʱ�������ϳ���
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}	
}
