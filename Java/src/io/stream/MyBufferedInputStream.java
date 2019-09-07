package io.stream;
/*
 *�Զ����ֽ����Ļ�����
1����������
2������ָ��
3�������������
 */

import java.io.IOException;
import java.io.InputStream;

public class MyBufferedInputStream {
	private InputStream is;
	private byte[] bys = new byte[1024];
	private int index=0,count=0;
	public MyBufferedInputStream(InputStream is) {
		super();
		this.is = is;
	}
	public int myRead() throws IOException{	
		//ÿ�����»�ȡ����ʱ
		if(count==0){
			//read()������������Ԫ�ظ���
			count=is.read(bys);
			if(count<0)
				return -1;
			index=0;
			byte b = bys[index];
			count--;
			index++;
			return b&255;//��byte��������Ϊint����
			
			//���ǵ�һ�ζ�ȡ����ʱ������
		}else if(count>0){
			byte b =bys[index];
			count--;
			index++;
			return b&0xff;
		}
		return -1;
	}
	public void myClose() throws IOException{
		is.close();
	}
}
