package system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 *��׼���������
 * System���е�������Ա������
 *		public static final InputStream in ����׼����������
 * 		public static final PrintStream out ����׼���������
 * 
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 * ����¼�����ݣ�
 * 		A:main������args���ղ�����
 * 			java HelloWorld hello world java
 * 		B:Scanner(JDK5�Ժ��)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		C:ͨ���ַ���������װ��׼������ʵ�� in���ֽ�����Ҫͨ��ת�������ܻ�ȡ�ı�����
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemDemo {

	public static void main(String[] args) throws IOException {
		showOut();
	}
	public static void showIn() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		//���ַ���ת��int
		int i = Integer.parseInt(line);
		System.out.println(i);
	}
	public static void showOut() throws IOException{
		PrintStream ps = System.out;
		ps.println("abcd");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("java");
		bw.newLine();
		bw.flush();
		
		bw.close();
	}
}
