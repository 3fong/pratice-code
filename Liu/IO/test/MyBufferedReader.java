package test;

import java.io.IOException;
import java.io.Reader;

/*
 *��Readerģ��BufferedReader��readLine()����
 * readLine():һ�ζ�ȡһ�У����ݻ��з��ж��Ƿ������ֻ�������ݣ������ػ��з�
 * ������
 * 		��ֻ��һ�������������Ա��������Ĵ���
 * 		Reader�����ֶ�ȡ��ʽ��һ�ζ�һ����һ�ζ�һ������
 * 		���������£����������Ч���������������飬����ĳ���һ��ȷ�����޷����ģ������޷�ȷ�ϣ��������鲻����
 * 		һ�ζ�һ�����ڸ�������������Ҫ�����ַ������ַ�������������ʱ�洢��Ҳ�����������-->StringBuilder
 * 		�жϱ�ǵ�ȷ�ϣ���������һ�������ԻسǷ�Ϊ��ǣ����ַ�Ϊ'\n'ʱ�������ַ����ﵽ�������Ч�������������ַ���
 * 		ͬʱ���ı�ĩβ����δ����'\n'�����Σ����ǿ��Ը����ַ��������ĳ����ж��Ƿ�������Ҫ�����
 */
public class MyBufferedReader {
	private Reader r;
	public MyBufferedReader(Reader r) {
		this.r=r;		
	}
	public String Myread() throws IOException {
		StringBuilder sb = new StringBuilder();
		
		int len =0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else{
				//��Ϊlen���ֽ���������Ҫ����ǿǿת
				sb.append((char)len);
			}			
		}
		//��Ϊǰ���Իس���'\n'Ϊ�������б�ǣ��п��ܴ���д����βδ����سǵ�����
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void close() throws IOException {
		r.close();
	}	
}
