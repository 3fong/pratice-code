package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *����һ���ı��ļ�(user.txt)����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 * ��дһ�������ж��Ƿ��С���־�š������ļ����ڣ�����о͸ı���ʵΪ��100��
 * ������	
 * 		��ֵ����ʽ����properties����
 * 		�ж�Ԫ���Ƿ���ڣ��ñ���
 * 		��ֵ��setProperties
 * 		��store������������
 */
public class ChangeFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		Reader r = new FileReader("F:\\s.txt");
		p.load(r);
		r.close();
		
		Set<String> spn = p.stringPropertyNames();
		for(String s : spn){
			if(s.equals("��־��")){
				p.setProperty(s,"100");
				break;
			}
		}
		Writer w = new FileWriter("F:\\s.txt");
		p.store(w,"�޸İ�");
		w.close();
	}

}
