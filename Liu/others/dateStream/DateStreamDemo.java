package dateStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *可以读写基本数据类型的数据
 * 数据输入流：DataInputStream(InputStream in)
 * 数据输出流：DataOutputStream(OutputStream out) 
 */
public class DateStreamDemo {

	public static void main(String[] args) throws IOException {
//		show();
		printShow();
	}
	public static void show() throws IOException{
		DataOutputStream dop = new DataOutputStream(new FileOutputStream("F:\\a.txt"));
		
		dop.writeInt(12);
		dop.writeByte(127);
		dop.writeByte(128);
		dop.writeBoolean(true);
		dop.writeFloat(12.45f);
		dop.writeDouble(12.34);
		dop.close();
	}
	public static void printShow() throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream("F:\\a.txt"));
		
		int a = dis.readInt();
		byte b = dis.readByte();
		byte c = dis.readByte();
		boolean d = dis.readBoolean();
		float e = dis.readFloat();
		double f = dis.readDouble();
		System.out.println(a+":"+b+":"+c+":"+d+":"+f);
		
		dis.close();
	}
}
