package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args)throws IOException {
//		writeData();
//		readData();
		writeUTF();
		readUTF();
	}
	public static void readUTF()throws IOException{
		DataInputStream di = new DataInputStream(new FileInputStream("data.txt"));
		
		String s =di.readUTF();
		System.out.println(s);
		di.close();		
	}
	public static void writeUTF()throws IOException{
		DataOutputStream ds = new DataOutputStream(new FileOutputStream("data.txt"));
		
		ds.writeUTF("ÄãºÃ");
		ds.close();
	}
	public static void readData()throws IOException{
		DataInputStream di = new DataInputStream(new FileInputStream("data.txt"));
		
		int a =di.readInt();
		Double d =di.readDouble();
		boolean b = di.readBoolean();
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
		di.close();
	}
	public static void writeData() throws IOException{
		DataOutputStream ds = new DataOutputStream(new FileOutputStream("data.txt"));
		
		ds.writeInt(10);
		ds.writeDouble(45.1561);
		ds.writeBoolean(true);
		ds.close();
	}
}
