package ramStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 *内存操作流：用于处理临时存储信息，程序结束，数据就从内存中消失。
	字节数组：
		ByteArrayInputStream
		ByteArrayOutputStream
	字符数组：
		CharArrayReader
		CharArrayWriter
	字符串：
		StringReader
		StringWriter
	特点：
	缓冲区随着数据的不断写入而自动增长。
	未使用系统资源，不用进行close关闭。
 */
public class RamStream {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream ba = new ByteArrayOutputStream();
		
		for(int x=0;x<10;x++){
			//将字符串转成byte数组
			ba.write(("hewls"+x).getBytes());
		}
//		ba.write(45121);
		//创建一个新分配的 byte 数组
		byte[] by = ba.toByteArray();
		
		ByteArrayInputStream bi = new ByteArrayInputStream(by);
		
		int len=0;
		while((len=bi.read())!=-1){
			System.out.print((char)len);
		}
	}
//	public static 
}
