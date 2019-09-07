package test33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
 *��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 *������
 *		ֵΨһ����HashSet����
 */
public class T19GetRandomDemo {

	public static void main(String[] args) {
//		method1();
		method2();
	}

	private static void method1() {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//size()����10ʱ��������ж�
		while(hs.size()<10){
			int num = (int)(Math.random()*20+1);
			hs.add(num);
		}
		
		for(Integer i : hs){
			System.out.print(i+" ");
		}
	}

	private static void method2() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random r = new Random();
		
		int count=0;
		while(count<10){			
			int num = r.nextInt(20)+1;
			if(!al.contains(num)){
				al.add(num);
				count++;
			}
		}
		for(Integer i : al){
			System.out.print(i+" ");
		}
	}
}
