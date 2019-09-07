package web.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 *�ͻ��˼���¼�룬����������ı��ļ�
 */
public class Client4 {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("127.0.0.1",12306);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�����Զ�ˢ����Ҫ���������췽����println()������
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=br.readLine())!=null){
			if("886".equals(line))
				break;
			pw.println(line);
		}
		s.close();
	}
}
