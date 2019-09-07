package io;

import java.io.FileReader;
import java.io.IOException;

//根据LineNumberReader的原理，自己定义一个相同的行读取流

class MyLineNumber extends MyBuffer{
	private int myLine;
	MyLineNumber(FileReader fr){
		super(fr);
	}
	public String myReadLine() throws IOException{
		myLine++;
		return super.myReadLine();
	}
	public void setLine(int myLine){
		this.myLine=myLine;
	}
	public int getLine(){
		return myLine;
	}
}
public class MyLineNumberDemo {

	public static void main(String[] args) throws IOException {
		MyLineNumber ml = new MyLineNumber(new FileReader("buf.txt"));
		
		String line = null;
		ml.setLine(10);
		while((line=ml.myReadLine())!=null){
			System.out.println(ml.getLine()+":"+line);
		}
		ml.myClose();
	}

}
