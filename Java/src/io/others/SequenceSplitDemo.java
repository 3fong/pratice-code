package io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/*
 *�ļ����и�ͺϲ�
 *	�и�ԭ�?��ȡ���飬�������С��Χ�ڴ��������
 *  �ϲ�����Ϊ��ϲ�����������֪��������Ҫ��дö�ٵ��жϷ���
 */
public class SequenceSplitDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\av.rmvb");
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(file));
		long start = System.currentTimeMillis();
//		splitM(bis);
		addMore();
		long end = System.currentTimeMillis();
		
		System.out.println("����ʱ��"+(end-start));
	}

	private static void splitM(BufferedInputStream bis) throws IOException{
		byte[] bys = new byte[1024*1024*100];
		BufferedOutputStream bos =null;
		int count=1;
		int len=0;
		while((len=bis.read(bys))!=-1){
			bos = new BufferedOutputStream(new FileOutputStream("F:\\a\\"+(count++)+".rmvb"));
			bos.write(bys,0,len);
			bos.flush();
			bos.close();
		}
		bis.close();
	}

	private static void addMore() throws IOException{
		ArrayList<BufferedInputStream> al = new ArrayList<BufferedInputStream>();
		
		for(int x=1;x<=7;x++){
			al.add(new BufferedInputStream(new FileInputStream("F:\\a\\"+x+".rmvb")));
		}
		
		//��дö�ٷ���
		final Iterator<BufferedInputStream> it = al.iterator();
		Enumeration<BufferedInputStream> en = new Enumeration<BufferedInputStream>(){
			@Override
			public boolean hasMoreElements() {				
				return it.hasNext();
			}
			@Override
			public BufferedInputStream nextElement() {				
				return it.next();
			}			
		};
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("F:\\a\\sequ.rmvb"));
		byte[] bys = new byte[1024*1024];
		int len=0;
		while((len=sis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		sis.close();
		bos.close();
	}
}
