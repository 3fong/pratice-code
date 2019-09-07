package system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 *标准输入输出流
 * System类中的两个成员变量：
 *		public static final InputStream in “标准”输入流。
 * 		public static final PrintStream out “标准”输出流。
 * 
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 * 键盘录入数据：
 * 		A:main方法的args接收参数。
 * 			java HelloWorld hello world java
 * 		B:Scanner(JDK5以后的)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		C:通过字符缓冲流包装标准输入流实现 in是字节流，要通过转换流才能获取文本数据
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
		//将字符串转成int
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
