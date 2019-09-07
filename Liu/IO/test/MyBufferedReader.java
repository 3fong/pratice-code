package test;

import java.io.IOException;
import java.io.Reader;

/*
 *用Reader模拟BufferedReader的readLine()功能
 * readLine():一次读取一行，根据换行符判断是否结束，只返回内容，不返回换行符
 * 分析：
 * 		它只是一个缓冲区，所以必须有流的存在
 * 		Reader有两种读取方式：一次读一个、一次读一个数组
 * 		正常情形下，读数组更高效，但是这里用数组，数组的长度一定确立就无法更改，长度无法确认，所以数组不合适
 * 		一次读一个存在覆盖现象，由于你要储存字符，用字符缓冲区可以临时存储，也方便添加数据-->StringBuilder
 * 		判断标记的确认：由于输入一行数据以回城符为标记，当字符为'\n'时，返回字符，达到整行输出效果，否则就添加字符。
 * 		同时，文本末尾存在未输入'\n'的情形，我们可以根据字符缓冲区的长度判断是否有内容要输出。
 */
public class MyBufferedReader {
	private Reader r;
	public MyBufferedReader(Reader r) {
		this.r=r;		
	}
	public String Myread() throws IOException {
		StringBuilder sb = new StringBuilder();
		
		int len =0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else{
				//因为len是字节数，必须要进行强强转
				sb.append((char)len);
			}			
		}
		//因为前面以回车符'\n'为返回整行标记，有可能存在写到结尾未输入回城的情形
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void close() throws IOException {
		r.close();
	}	
}
