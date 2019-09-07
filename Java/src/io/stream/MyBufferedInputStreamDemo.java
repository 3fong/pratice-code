package io.stream;

import java.io.IOException;

/*
 *�����Զ��建����
 */
public class MyBufferedInputStreamDemo {

	public static void main(String[] args) throws IOException{
		MyBufferedInputStream mb = new MyBufferedInputStream(System.in);
		
		int len=0;
		while((len=mb.myRead())!=-1){
			System.out.print(len);
		}
		mb.myClose();
	}

}
