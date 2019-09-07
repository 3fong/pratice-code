package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class IO1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		ArrayList<Character> al = new ArrayList<Character>();
//		
//		StringBuilder sb = new StringBuilder();
		
				String line = null;
				while((line=br.readLine())!=null){
//					sb.append(line);
//					sb.reverse();
//					String a = sb.toString();
//					bw.write(a);
//					bw.newLine();
//					bw.flush();
					
					char[] chs = line.toCharArray();
					for(int x=0;x<chs.length;x++){						
						al.add(chs[x]);
					}
				}
			Collections.reverse(al);
			for(Character c : al){
				bw.write(c);
				bw.flush();
			}
		br.close();
		bw.close();
	}
}
