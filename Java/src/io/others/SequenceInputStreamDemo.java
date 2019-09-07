package io.others;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 *SequenceInputStream:�ϲ�������Դ��Ӧһ��Ŀ��ʱ��ʡȥ���ֹ�������д���裬�򻯴��롣
	SequenceInputStream(InputStream s1, InputStreamS2 ): ��˳���ȡs1,s2
	SequenceInputStream(Enumeration<? extends InputStream> e):�������ϲ�
	�ϲ������ӡ���෴��ֻ����������
 */
public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException{
		InputStream is1 = new FileInputStream("F:\\a.txt");
		InputStream is2 = new FileInputStream("F:\\c.txt");
		InputStream is3 = new FileInputStream("F:\\z.txt");
		addEr(is1,is2);
//		addMore(is1,is2,is3);
	}
	//SequenceInputStream(Enumeration<? extends InputStream> e):�������ϲ�
	private static void addMore(InputStream is1,InputStream is2,InputStream is3) throws IOException{
		Vector<InputStream> v = new Vector<InputStream>();
		v.add(is1);
		v.add(is2);
		v.add(is3);
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		PrintStream ps = new PrintStream(new FileOutputStream("F:\\sis2.txt"),true);
		byte[] bys = new byte[1024];
		int len=0;
		while((len=sis.read(bys))!=-1){
			ps.println(new String(bys,0,len));
		}
		sis.close();
		ps.close();
	}
	//SequenceInputStream(InputStream s1, InputStreamS2 )���������ϲ�
	private static void addEr(InputStream is1,InputStream is2) throws IOException{		
		SequenceInputStream sis = new SequenceInputStream(is1,is2);
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\sis.txt"),true);
		byte[] bys = new byte[1024];
		int len=0;
		while((len=sis.read(bys))!=-1){
			pw.println(new String(bys,0,len));
		}	
		is2.close();
		sis.close();
		pw.close();
	}
}
