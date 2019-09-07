package randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 *随机访问流：
 * 		RandomAccessFile类不属于流，是Object类的子类。
 * 		但它融合了InputStream和OutputStream的功能。
 * 		支持对文件的随机访问读取和写入。
 * public RandomAccessFile(String name,String mode)：第一个参数是文件路径，第二个参数是操作文件的模式。
 * 		模式有四种，我们最常用的一种叫"rw",这种方式表示我既可以写数据，也可以读取数据 
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		showWrite();
		showReader();
	}
	public static void showWrite() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("F:\\a.txt","rw");
		
		raf.writeLong(4512);
		raf.writeChar('a');
		raf.writeUTF("长城");
		
		raf.close();
	}
	public static void showReader() throws IOException{
		RandomAccessFile raf = 
				new RandomAccessFile("F:\\a.txt","rw");
		
		long l = raf.readLong();
//		System.out.println("当前指针是："+raf.getFilePointer());//8
		char c = raf.readChar();
		System.out.println("当前指针是："+raf.getFilePointer());
		String s = raf.readUTF();
		System.out.println(l+":"+c+":"+s);
		
		raf.seek(10);
		s = raf.readUTF();//读取的信息要和seek后的数据一致
		System.out.println(s);
		raf.close();
	}
}
