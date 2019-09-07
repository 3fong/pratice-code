package test33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
 *编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 *分析：
 *		值唯一，用HashSet方法
 */
public class T19GetRandomDemo {

	public static void main(String[] args) {
//		method1();
		method2();
	}

	private static void method1() {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//size()等于10时，会回来判断
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
