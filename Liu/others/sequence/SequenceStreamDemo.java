package sequence;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
SequenceInputStream:���������ϲ���������Դ��Ӧһ��Ŀ��ʱ��ʡȥ���ֹ�������д���裬�򻯴��롣
SequenceInputStream(InputStream s1, InputStreamS2 ): ��˳���ȡs1,s2
SequenceInputStream(Enumeration<? extends InputStream> e):��������ϲ�
 */
public class SequenceStreamDemo {

	public static void main(String[] args) throws IOException {
		InputStream s1 = new FileInputStream("F:\\a.txt");
		InputStream s2 = new FileInputStream("F:\\b.txt");
		
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\c.txt"));
		
		int len = 0;
		while((len=sis.read())!=-1){
			bos.write(len);
		}
		
		sis.close();
		bos.close();
	}

}
