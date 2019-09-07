package sequence;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 *SequenceInputStream(Enumeration<? extends InputStream> e):多个参数合并
 */
public class SequenceStreamDemo2 {

	public static void main(String[] args) throws IOException {
		InputStream is1 = new FileInputStream("F:\\a.txt");
		InputStream is2 = new FileInputStream("F:\\b.txt");
		InputStream is3 = new FileInputStream("F:\\c.txt");
		Vector<InputStream> vi = new Vector<InputStream>();
		
		vi.add(is1);
		vi.add(is2);
		vi.add(is3);
		
		Enumeration<InputStream> ei = vi.elements();
		
		SequenceInputStream si = new SequenceInputStream(ei);
		BufferedOutputStream bos = 
				new BufferedOutputStream(new FileOutputStream("F:\\d.txt"));
		byte[] bt = new byte[1024];
		int len=0;
		while((len=si.read(bt))!=-1){
			bos.write(bt,0,len);
		}
		si.close();
		bos.close();
	}

}
