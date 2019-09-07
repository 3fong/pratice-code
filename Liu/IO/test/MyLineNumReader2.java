package test;

import java.io.IOException;
import java.io.Reader;

/*
 *代码优化
 *	因为BufferedReader是LineNumberReader的父类，所以换行功能可以继承获取
 *	因此我的MyLineNumReader也可以继承自己的父类功能
 */
public class MyLineNumReader2 extends MyBufferedReader {
	private Reader r;
	private int num;
	public MyLineNumReader2(Reader r) {
		super(r);
	}
	public String Myread() throws IOException{
		num++;
		return super.Myread();
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
}
