package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *���û��ڿ���̨�������5�����ְ��մ�С˳����뵽D:\\xx.txt�в����෴�ĵ�˳�������ʾ�ڿ���̨��
 */
public class SortNumDemo {

	public static void main(String[] args) throws IOException{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Scanner s = new Scanner(System.in);
		for(int x=0;x<5;x++){
			int num = s.nextInt();
			ts.add(num);
		}
		s.close();
		
		outFile(ts);
		show(ts);
	}

	private static void show(TreeSet<Integer> ts) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Integer i : ts){
			al.add(i);
		}
		Collections.reverse(al);
		for(Integer i : al){
			System.out.print(i+" ");
		}
	}

	private static void outFile(TreeSet<Integer> ts) throws IOException{
		PrintWriter pw = new PrintWriter("F:\\pw.txt");
		for(Integer i : ts){
			pw.print(i+" ");
		}
		pw.close();
	}

}
