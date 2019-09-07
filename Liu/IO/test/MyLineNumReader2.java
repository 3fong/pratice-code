package test;

import java.io.IOException;
import java.io.Reader;

/*
 *�����Ż�
 *	��ΪBufferedReader��LineNumberReader�ĸ��࣬���Ի��й��ܿ��Լ̳л�ȡ
 *	����ҵ�MyLineNumReaderҲ���Լ̳��Լ��ĸ��๦��
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
