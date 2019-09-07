package chars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *转换流  可以进行编码读写功能
 * InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 * 
 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
 * 把字节流转换为字符流。
 * 字符流 = 字节流 +编码表。
 */
public class TransfromStream {

	public static void main(String[] args) throws IOException {
		show1();
		show();
	}
	public static void show() throws IOException{
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\a.txt"));
		
		//系统默认编码表时GBK，编码和解码的表要一致。
		InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\a.txt"),"UTF-8");
		int len=0;
		while((len=isr.read())!=-1){
			System.out.println((char)len);			
		}
		isr.close();
	}
	public static void show1() throws IOException{
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"));
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"),"UTF-8");
		osw.write("杨贵妃");
		
		osw.close();
	}
}
