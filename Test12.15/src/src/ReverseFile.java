package src;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
 *��֪�ļ�a.txt�ļ��е�����Ϊ��abcd�������д�����ȡ���ļ����ݣ����������ݷ�ת����
 *����b.txt�ļ��С���b.txt�е��ļ�����ӦΪ��dcba��������˳��
 */
public class ReverseFile {

	public static void main(String[] args) throws IOException {
		File src = new File("F:\\a.txt");
		File aim = new File("F:\\b.txt");
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(aim));
		
		//��������
		ArrayList<Character> al = new ArrayList<Character>();
		String line = null;
		while ((line = br.readLine()) != null) {
			char[] chs = line.toCharArray();
//			swap(chs);
			String str = swap2(chs,al);
			bw.write(str);
		}
		br.close();
		bw.close();
	}

	private static void swap(char[] chs) {
		for (int x = 0, y = chs.length - 1; x <= y; x++, y--) {
			char temp = chs[x];
			chs[x] = chs[y];
			chs[y] = temp;
		}
	}
	private static String swap2(char[] chs,ArrayList<Character> al) {
		for(char c : chs){
			al.add(c);
		}
		Collections.reverse(al);
		String s ="";
		for(Character c : al){
			s+=c+"";
		}
		return s;
	}
}
