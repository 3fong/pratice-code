package io.charStream;

import java.io.IOException;
import java.io.Reader;

/*
 *�Զ��廻����
 */
public class MyLineNumberReader {
	private Reader r;
	private int line;
	public MyLineNumberReader(Reader r) {
		super();
		this.r = r;
	}
	public String myLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		line++;
		int len = 0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else
				sb.append((char)len);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	
}
