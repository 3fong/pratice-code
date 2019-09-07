package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 *����һ��������С��Ϸ�ĳ�����дһ������ʵ���ڲ�������ֻ����5�Σ�����5����ʾ����Ϸ�����ѽ������븶�ѡ�
 *������
 *		�޶�����������Ҫһ����������������ͨ���������������ͻ����á�
 *		�������������ļ��У�ÿ�ζ����ؿ��Խ���������⣬������properties
 *		Ҫ���жϴ���������Ҫ��ȡ�ļ���ֵgetProperty
 *		ÿ��ʹ�ú�Ҫ���´�������setProperty��store
 */
public class LimitCount {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		//���������ļ�
		Reader r = new FileReader("F:\\count.txt");
		p.load(r);
		//������
		String value = p.getProperty("count");
		//���ַ���ת����int
		int count = Integer.parseInt(value);
		if(count<=0){
			System.out.println("��Ϸ�����ѽ������븶�ѡ�");
			System.exit(0);
		}else{
			count--;
			System.out.println("�㻹����ʹ�ã�"+count+"��");
			
			p.setProperty("count",String.valueOf(count));
			Writer w = new FileWriter("F:\\count.txt");
			p.store(w,"������");
			w.close();
//			GuessNum.start();
		}

	}
}
