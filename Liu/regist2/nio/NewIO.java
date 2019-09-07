package nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 *JDK7的之后的nio：
 * Path:路径
 * Paths:有一个静态方法返回一个路径
 * 		public static Path get(URI uri)
 * Files:提供了静态方法供我们使用
 * 		public static long copy(Path source,OutputStream out):复制文件
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines,
 * 													Charset cs,OpenOption... options)
 */
public class NewIO {

	public static void main(String[] args) throws IOException {
//		myCopy();
		myWrite();
	}

	private static void myWrite() throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("java");
		al.add("wrold");
		//目的地，
		Files.write(Paths.get("F:\\al.txt"),al,Charset.forName("GBK"));
	}
	private static void myCopy() throws IOException {
		//public static long copy(Path source,OutputStream out):复制文件
		//可以看出这个方法只要有路径和输出流就可以复制文件，现在的IO读取和输出便捷更多
		Files.copy(Paths.get("G:\\a.txt"),new FileOutputStream("F:\\a.txt"));		
	}

}
