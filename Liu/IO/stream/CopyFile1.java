package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 *需求：把当前目录下的java.txt的内容复制到g盘下的b.txt中
 *
 *计算机是如何识别什么时候该把两个字节转换为一个中文呢?
 * 在计算机中中文的存储分两个字节：
 * 		第一个字节肯定是负数。
 * 		第二个字节常见的是负数，可能有正数。但是没影响。
 */
public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		show();
	}
	//计算机对中文的转换
	public static void show(){
//		String s = "abcde";//[97, 98, 99, 100, 101]
		//字符串转字节
		
		String s = "我爱你";//[-50, -46, -80, -82, -60, -29]
		byte[] bytes = s.getBytes();
		//将数组转成字符串
		System.out.println(Arrays.toString(bytes));
	}
	public static void show2() throws IOException{
		FileInputStream fis = new FileInputStream("java.txt");
		
		FileOutputStream fos = new FileOutputStream("F:\\b.txt");
		
		int len=0;
		while((len=fis.read())!=-1){
			fos.write(len);
			
			//输出中文时涉及强转，会出现不能识别字符，但直接用字节流写出没有问题，因为未涉及转换
			System.out.println((char)len);
		}
		fis.close();
		fos.close();
	}
}
