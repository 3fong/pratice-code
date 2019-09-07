package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *����ļ��ϱ�����Properties���ϣ�
 * public void load(Reader reader):���ļ��е����ݶ�ȡ��������
 * public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
 */
public class LoadStore {

	public static void main(String[] args) throws IOException {
//		myLoad();
		myStore();
	}

	private static void myStore() throws IOException {
		Properties p = new Properties();
		p.setProperty("����ϼ","27");
		p.setProperty("��־ӱ","45");
		p.setProperty("��־��","45");
		
		Writer w = new FileWriter("F:\\s.txt");
		p.store(w,"lover");
		w.close();
	}

	private static void myLoad() throws IOException {
		Properties p = new Properties();
		//��ȡ�ı����ַ����������޷�ʶ��
//		InputStream is = new FileInputStream("F:\\s.txt");
		
		Reader r = new FileReader("F:\\s.txt");
		p.load(r);
		
		r.close();
		Set<String> spn = p.stringPropertyNames();
		for(String s : spn){
			String value = p.getProperty(s);
			System.out.println(s+":"+value);
		}
	}
	
}
