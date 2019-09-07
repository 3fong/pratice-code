package web.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 *���ͻ�����Ϣ��Ϊ�ַ�������������Ϣ
 *�����������˼·���뷴����Ϣ�����ȴû��Ӧ��Ϊʲô��?
 * ��ȡ�ı��ļ��ǿ�����null��Ϊ������Ϣ�ģ������أ�ͨ�����ǲ������������Ϣ�ġ�
 * ���ԣ���������Ͳ�֪��������ˡ����㻹����������㷴�������ԣ����໥�ȴ��ˡ�
 * 
 * ��ν����?
 * A:�ڶ�дһ����ݣ����߷���������ȡ���������˵���Ҿͽ�����Ҳ����ɡ�
 * 		���������Խ�����⣬���ǲ��á�
 * B:Socket�����ṩ��һ�ֽ������
 * 		public void shutdownOutput()
 */
public class Client3 {

	public static void main(String[] args) throws IOException{
		Socket s = new Socket("127.0.0.1",12306);
		
//		BufferedReader br = new BufferedReader(new FileReader("F:\\b.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line=br.readLine())!=null){
			if(line.equals("886")){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		s.shutdownOutput();
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line2 = br2.readLine();
		System.out.println(line2);

		br.close();
		s.close();
	}

}
