package printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *打印流
 * 字节流打印流	PrintStream
 * 字符打印流	PrintWriter
 * 
 * 打印流的特点：
 * 		A:只有写数据的，没有读取数据。只能操作目的地，不能操作数据源。
 * 		B:可以操作任意类型的数据。
 * 		C:如果启动了自动刷新，能够自动刷新。
 * 		D:该流是可以直接操作文本文件的。
 * 			哪些流对象是可以直接操作文本文件的呢?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			看API,查流对象的构造方法，如果同时有File类型和String类型
 * 			的参数，一般来说就是可以直接操作文件的
 * PrintWriter(OutputStream out, boolean autoFlush) 自动刷新功能
 * 还是应该调用println()的方法才可以
 * 		这个时候不仅仅自动刷新了，还实现了数据的换行。
 * 
 * 		println()
 *		其实等价于于：
 *		bw.write();
 *		bw.newLine();		
 *		bw.flush();
 */
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		//启用自动刷新需要两步，构造方法和println()方法
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\a.txt"),true);
		
//		pw.write("afaljfl");
//		pw.flush();
		pw.println("java");
	}

}
