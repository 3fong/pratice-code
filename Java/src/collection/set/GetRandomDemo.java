package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
 *��ȡ10��1-20֮��������Ҫ�����ظ�
 *	������
 *		��ȡ����������ַ�����Random Math.random
 *		��contain�ж�
 */
public class GetRandomDemo {

	public static void main(String[] args) {
		printSet();
//		printList();
	}

	private static void printSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(hs.size()<10){
			Random r = new Random();
			int num = r.nextInt(20)+1;
			hs.add(num);						
		}	
		for(Integer i : hs){
			System.out.println(i);
		}
	}

	private static void printList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int count = 0;
		while(count<10){
			int num = (int)(Math.random()*20)+1;
			if(!al.contains(num)){
				al.add(num);
				count++;
			}
		}
		for(Integer i : al){
			System.out.println(i);
		}
	}	
}
