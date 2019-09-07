package sequence;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
SequenceInputStream:序列流（合并流）。多源对应一个目的时，省去部分关联和续写步骤，简化代码。
SequenceInputStream(InputStream s1, InputStreamS2 ): 依顺序读取s1,s2
SequenceInputStream(Enumeration<? extends InputStream> e):多个参数合并
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
