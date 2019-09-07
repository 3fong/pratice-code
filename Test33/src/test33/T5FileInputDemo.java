package test33;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 *5 定义一个文件输入流，调用read(byte[] b)方法将exercise.txt
 * 文件中的所有内容打印出来(byte数组的大小限制为5)。
	分析：
		byte[]说明要使用字节流，数组大小为5，正常打印肯定不行，此时可以用内存流，
			ByteArrayInputStream
			ByteArrayOutputStream
			进行临时数据存储，存储完直接返回数据就可以
 */
public class T5FileInputDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\stu.txt");
		
		String s = readFile(file);
		System.out.println(s);
	}

	private static String readFile(File file) throws IOException{
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] bys = new byte[5];
		int len=0;
		while((len=fis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		fis.close();
		return bos.toString();
	}
}
