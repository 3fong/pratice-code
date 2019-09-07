package com.liu.mytest;

import java.util.ArrayList;
import java.util.Random;

/*
 *��ȡ10��1-20֮��������Ҫ�����ظ�
 */
public class GetRandom {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
					
		int count=0;
		while(count<10){			
			int num = (int)(Math.random()*20)+1;
			if(!al.contains(num)){
				al.add(num);
				count++;
			}
		}
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		Random r = new Random();
//		
//		int count=0;
//		while(count<10){
//			int num = r.nextInt(20)+1;
//			if(!al.contains(num)){
//				al.add(num);
//				count++;
//			}
//		}
		for(Integer i : al){
			System.out.println(i);
		}
	}

}
