package chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *���󣺴��ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)�������У�����������
 *������
 *		���ı��ļ��ж�ȡ�����ַ���ȡ�����ɼ��뻺����
 *		���뼯�ϣ����漰��ֵ�ԣ�������Collection��Ҫ�Ǳ�֤����Ψһ�Կ�ѡ��set
 */
public class OutputToList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\c.txt"));
		ArrayList<String> al = new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null){
			al.add(line);
		}
		br.close();
		
		for(String s : al){
			System.out.println(s);
		}
	}

}
