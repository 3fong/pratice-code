package test33;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 *6�� �Զ����ַ��������İ�װ�࣬ͨ�������װ��Եײ��ַ����������а�װ��
           �ó���ͨ�������װ���ȡĳ���ı��ļ������磬һ��javaԴ�ļ���ʱ��
           �ܹ��ڶ�ȡ��ÿ��ǰ�涼�������кź�ð�š�
	������
		���ܶ�ȡ���ݣ�������ǰ�����кš�ð�ţ������LineNumberReader�Ĺ���
		ͬʱ����ǰ��Ҫ�߱����ж�ȡ����
 */
class MyLineNum{
	private Reader r;
	private int line;
	public MyLineNum(Reader r) {
		super();
		this.r = r;
	}
	//�����ȡ���й���
	public String myLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		line++;
		
		int len=0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else{
				sb.append((char)len);
			}
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	
} 
public class T6MyLineNum {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\stu.txt");
		String s = method(file);
		System.out.println(s);
	}

	private static String method(File file) throws IOException{
		MyLineNum mln = new MyLineNum(new FileReader("F:\\stu.txt"));
		StringBuilder sb = new StringBuilder();
		
		String line = null;
		mln.setLine(15);
		while((line=mln.myLine())!=null){
			
			//������û�д洢���У�����Ҫ�Լ����ϣ��Ի�ԭ����ԭ״��
			sb.append(mln.getLine()+":"+line+"\r\n");
		}
		//���建�������洢���ݡ����巵��ֵ�����û��߱���ӡȨ��
		return sb.toString();
	}
}
