package test;

import java.io.IOException;
import java.io.Reader;

/*
 *自定义行号缓冲区LineNumberReader
 *分析：	
 *		因为它是BufferedReader的子类，所以要单独使用它要具备BufferedReader的功能
 *		行号的设置和获取都很简单，但是只要将行号自增和数据读取绑定才合理。
 */
public class MyLineNumReader {
	private Reader r;
	private int num;
	public MyLineNumReader(Reader r) {
		this.r = r;
	}
	public String MyRead() throws IOException{
		StringBuilder sb = new StringBuilder();
		
		//行数自增是因为读取数据，所以行数应定义在读取方法中
		num++;
		
		int len=0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n'){
				return sb.toString();
			}
			else{
				//因为是字符缓冲区，要将字节转换为字符
				sb.append((char)len);
			}
		}
		//判断无'\n'的情形
		if(sb.length()!=0){
			return sb.toString();
		}
		return null;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
//		num++;//只要调用就自增，当独立调用时，不符合常理
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}	
}
