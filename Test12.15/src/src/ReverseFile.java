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
 *已知文件a.txt文件中的内容为“abcd”，请编写程序读取该文件内容，并将该内容反转后输
 *出到b.txt文件中。即b.txt中的文件内容应为“dcba”这样的顺序
 */
public class ReverseFile {

	public static void main(String[] args) throws IOException {
		File src = new File("F:\\a.txt");
		File aim = new File("F:\\b.txt");
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(aim));
		
		//方法二：
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
