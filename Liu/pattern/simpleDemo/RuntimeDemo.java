package simpleDemo;

import java.io.IOException;

/*
 *Runtime:ÿ�� JavaӦ�ó�����һ�� Runtime ��ʵ����ʹӦ�ó����ܹ��������еĻ��������ӡ�
 * exec(String command)
 */
public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("C:\\Users\\David\\AppData\\Local\\Youdao\\Dict\\Application\\YodaoDict.exe");
	}
}
//Runtime�Ĵ���ʵ��
//class Runtime{
//	private Runtime(){}
//	private static Runtime currentRuntime = new Runtime();
//	public static Runtime getRuntime(){
//		return currentRuntime;
//	}
//}