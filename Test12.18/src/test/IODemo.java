package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *1.���û��ڿ���̨�������5�����ְ��մ�С˳����뵽D:\\xx.txt�в���
 *�෴�ĵ�˳�������ʾ�ڿ���̨��
 *	������
 *		����̨��������洢��ָ���ļ����õ�IO
 *		���ݴ洢����֤����û�ж�Ӧ��ϵ����TreeSet����
 *		�����ӡ�ڿ���̨����Collections�������reverse������
 *		�����轫����ת�浽List������
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
	//��TreeSet�����е�����ת�ɵ�list�����У����з�ת���
	private static void show(TreeSet<Integer> ts) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(Integer i : ts){
			al.add(i);
		}
		Collections.reverse(al);
		printList(al);
	}
	//��ӡ����
	private static void printList(ArrayList<Integer> al) {
		for(Integer i : al){
			System.out.print(i+" ");
		}
	}
	//��TreeSet�����е��������
	private static void outFile(TreeSet<Integer> ts) throws IOException{
		PrintWriter pw = new PrintWriter("D:\\file.txt");
		
		for(Integer i : ts){
			pw.print(i+" ");
		}
		pw.close();
	}

}
