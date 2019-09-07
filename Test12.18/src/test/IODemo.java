package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *1.将用户在控制台上输出的5个数字按照大小顺序存入到D:\\xx.txt中并以
 *相反的的顺序读出显示在控制台上
 *	分析：
 *		控制台输出，并存储到指定文件，用到IO
 *		数据存储并保证有序，没有对应关系，用TreeSet集合
 *		反序打印在控制台，用Collections工具类的reverse方法，
 *		所以需将数据转存到List集合中
 */
public class IODemo {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int x=0;x<5;x++){
			int num = s.nextInt();
			ts.add(num);
			outFile(ts);
		}
		s.close();
		show(ts);
	}
	//将TreeSet集合中的内容转成到list集合中，进行反转输出
	private static void show(TreeSet<Integer> ts) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(Integer i : ts){
			al.add(i);
		}
		Collections.reverse(al);
		printList(al);
	}
	//打印集合
	private static void printList(ArrayList<Integer> al) {
		for(Integer i : al){
			System.out.print(i+" ");
		}
	}
	//将TreeSet集合中的内容输出
	private static void outFile(TreeSet<Integer> ts) throws IOException{
		PrintWriter pw = new PrintWriter("D:\\file.txt");
		
		for(Integer i : ts){
			pw.print(i+" ");
		}
		pw.close();
	}

}
