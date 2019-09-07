package io.charStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 *�̳и��࣬ʹ�ø��෽��
 */
class MyLineNumberReader2 extends MyBufferedReader{
	private Reader r;
	private int line;
	public MyLineNumberReader2(Reader r) {
		super(r);
		this.r = r;
	}
	public String myLine() throws IOException{
		line++;
		return super.myRead();
	}
	/**
	 * @return the line
	 */
	public int getLine() {
		return line;
	}
	/**
	 * @param line the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}
	public void myClose() throws IOException{
		r.close();
	}
}
public class MyLineNumberReaderDemo {

	public static void main(String[] args) throws IOException{
		MyLineNumberReader2 mr = new MyLineNumberReader2(new FileReader("F:\\z.txt"));
		String line=null;
		mr.setLine(15);
		while((line=mr.myLine())!=null){
			System.out.println(mr.getLine()+":"+line);
		}
		mr.myClose();
	}

}
