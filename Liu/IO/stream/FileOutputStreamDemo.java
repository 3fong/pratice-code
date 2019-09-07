package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *public void write(int b):写一个字节
 *public void write(byte[] b):写一个字节数组
 *public void write(byte[] b,int off,int len):写一个字节数组的一部分
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		//把FileOutputStream定义成成员变量，并初始化，方便finally内变量使用
		FileOutputStream fos = null;
		try{
//			fos = new FileOutputStream("java.txt");
			
			fos.write("akljflaj".getBytes());
			
			//加入换行
			fos.write("\r\n".getBytes());
			byte[] bytes = {12,5,12,8};
			fos.write(bytes,0,bytes.length);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//如果fos不是null，才需要关闭流 否则java.lang.NullPointerException
			if(fos!=null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}		
	}
}
