package chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 *��������һ���ı��ļ��д洢�˼������ƣ�����дһ������ʵ�������ȡһ���˵����֡�
 *������
 *		��ȡ�ı����ַ���ȡ��
 *		��ȡ��Ҫ�����ȡ����Ҫ���������洢�����������
 *		�����ȡ������ͨ������ĽǱ����ݣ�����ѡ��ArrayList
����ϼ
������
����
�־���
��ʦʦ

 */
public class GetName {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\c.txt"));
		
		ArrayList<String> al = new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null){
			al.add(line);
		}
		//������������ȡ����Ǳ�
		Random r = new Random();
		int index = r.nextInt(al.size());
		
		String name = al.get(index);
		System.out.println("���˵�ѧ���ǣ�"+name);
	}

}
