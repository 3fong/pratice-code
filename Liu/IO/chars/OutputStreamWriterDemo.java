package chars;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter的方法：
 * public void write(int c):写一个字符
 * public void write(char[] cbuf):写一个字符数组
 * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分,len是个数
 * public void write(String str):写一个字符串
 * public void write(String str,int off,int len):写一个字符串的一部分
 * 
 *  面试题：close()和flush()的区别?
 * A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
 * B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"));
		
		//数据存储以字节为基本单位，你要存储字符必须要刷新  字符=2字节。
		osw.write(97);//a
		osw.flush();
		
		char[] chs = {'a','b','c','d'};
		osw.write(chs);
		osw.flush();
		
		osw.write(chs,1,2);
		osw.flush();
		
		osw.write("逆爱是罪");
		
		osw.write("你是爱谁谁",2,3);
		osw.flush();
		osw.close();
	}

}
