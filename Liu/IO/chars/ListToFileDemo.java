package chars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 *������
 *		�������ַ������洢���ı��ļ���ֻ�õ��ַ������
 */
public class ListToFileDemo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\c.txt"));
		
		al.add("����ϼ");
		al.add("������");
		al.add("����");
		al.add("�־���");
		al.add("��ʦʦ");
		
		for(String s : al){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
