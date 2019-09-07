package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {

	public static void main(String[] args) {
		ByteArrayInputStream bi = new ByteArrayInputStream("afjalkjfla".getBytes());
		ByteArrayOutputStream bo =new ByteArrayOutputStream();
		
		int len=0;
		while((len=bi.read())!=-1){
			bo.write(len);
		}
		System.out.println(bo.size());
		System.out.println(bo.toString());
		
//		bo.writeTo(new FileOutputStream(""));
	}

}
