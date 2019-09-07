package chars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *复制图片	 4种方式
	g:\\a.jpg
	f:\\b.jpg
 */
public class CopyPicture {

	public static void main(String[] args) throws IOException {
		File origin = new File("G:\\a.jpg");
		File aim = new File("F:\\b.jpg");
//		method1(origin,aim);
//		method2(origin,aim);
//		method3(origin,aim);
		method4(origin,aim);
		
	}

	private static void method4(File origin, File aim) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(aim));
		
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=bis.read(bytes))!=-1){
			bos.write(bytes,0,len);			
		}
		bis.close();
		bos.close();
	}
	private static void method3(File origin, File aim) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(aim));
		
		int len=0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
	private static void method2(File origin, File aim) throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(aim);
		
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			fos.write(bytes,0,len);
		}
		fis.close();
		fos.close();
	}
	private static void method1(File origin, File aim) throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(aim);
		
		int len=0;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		fis.close();
		fos.close();
	}

}
