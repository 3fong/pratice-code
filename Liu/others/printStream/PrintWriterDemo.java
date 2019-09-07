package printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *��ӡ��
 * �ֽ�����ӡ��	PrintStream
 * �ַ���ӡ��	PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		A:ֻ��д���ݵģ�û�ж�ȡ���ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		B:���Բ����������͵����ݡ�
 * 		C:����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		D:�����ǿ���ֱ�Ӳ����ı��ļ��ġ�
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			��API,��������Ĺ��췽�������ͬʱ��File���ͺ�String����
 * 			�Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ļ���
 * PrintWriter(OutputStream out, boolean autoFlush) �Զ�ˢ�¹���
 * ����Ӧ�õ���println()�ķ����ſ���
 * 		���ʱ�򲻽����Զ�ˢ���ˣ���ʵ�������ݵĻ��С�
 * 
 * 		println()
 *		��ʵ�ȼ����ڣ�
 *		bw.write();
 *		bw.newLine();		
 *		bw.flush();
 */
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		//�����Զ�ˢ����Ҫ���������췽����println()����
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\a.txt"),true);
		
//		pw.write("afaljfl");
//		pw.flush();
		pw.println("java");
	}

}
