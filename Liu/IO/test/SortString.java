package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 *已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
 * 请编写程序读取数据内容，把数据排序后写入ss.txt中。
 * 分析：
 * 		方法一： 字符串排序，用集合，要保证唯一性用set
 * 		    	 数据输出用字符流
 * 		方法二：用数组排序方法
 */
public class SortString {

	public static void main(String[] args) throws IOException {
//		Set<Character> sc = sortString();
//		outString(sc);
		
		sortOut();
	}
	//方法二
	public static void sortOut() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
		String line = br.readLine();
		br.close();
		
		//将读取来的字符串转成数组排序
		char[] chs = line.toCharArray();
		Arrays.sort(chs);
		
		//Writer类的write()可以直接写字符、字符串
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\c.txt"));
		bw.write(chs);
		bw.close();
	}
	//方法一
	public static Set<Character> sortString() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
		Set<Character> sc = new TreeSet<Character>();
		
		String line = null;
		while((line=br.readLine())!=null){
			char[] chs = line.toCharArray();
			for(int x=0;x<chs.length;x++){
				sc.add(chs[x]);
			}
		}
		br.close();
		return sc;
	}
	public static void outString(Set<Character> sc) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\ss.txt"));
		for(Character ch : sc){
			bw.write(ch);
		}
		bw.close();
		System.out.println("输出完成");
	}
}
