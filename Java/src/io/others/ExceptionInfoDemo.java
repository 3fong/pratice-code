package io.others;

import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *���󣺽��쳣����־��Ϣ���Ϊ�ļ���
 *System.setOut(new FileOutputStream("2.txt"))����Ŀ�ĸĳ��ļ�2.txt��
 *System.outĬ������ǿ���̨��setOut���������޸������ַ��
 */
public class ExceptionInfoDemo {
	public static void main(String[] args) {
		try{
			int[] arr = new int[3];
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			try{
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String str = sdf.format(d);
				PrintStream ps = new PrintStream("F:\\exception.log");
				ps.println(str);
				System.setOut(ps);
			}catch(IOException ie){
				throw new RuntimeException("��־�ļ�����ʧ��"+ie.toString());
			}
			e.printStackTrace(System.out);
		}
	}

}
