package test33;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 *6、 自定义字符输入流的包装类，通过这个包装类对底层字符输入流进行包装，
           让程序通过这个包装类读取某个文本文件（例如，一个java源文件）时，
           能够在读取的每行前面都加上有行号和冒号。
	分析：
		功能读取数据，并在其前加上行号、冒号，这就是LineNumberReader的功能
		同时，行前加要具备整行读取功能
 */
class MyLineNum{
	private Reader r;
	private int line;
	public MyLineNum(Reader r) {
		super();
		this.r = r;
	}
	//定义读取整行功能
	public String myLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		line++;
		
		int len=0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else{
				sb.append((char)len);
			}
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
public class T6MyLineNum {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\stu.txt");
		String s = method(file);
		System.out.println(s);
	}

	private static String method(File file) throws IOException{
		MyLineNum mln = new MyLineNum(new FileReader("F:\\stu.txt"));
		StringBuilder sb = new StringBuilder();
		
		String line = null;
		mln.setLine(15);
		while((line=mln.myLine())!=null){
			
			//缓冲区没有存储换行，所以要自己加上，以还原数据原状。
			sb.append(mln.getLine()+":"+line+"\r\n");
		}
		//定义缓冲区，存储数据。定义返回值，让用户具备打印权利
		return sb.toString();
	}
}
