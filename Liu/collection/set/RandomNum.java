package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
 *编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 *分析：
 *		1 不能重复，用Set集合，不用排序用HashSet
 */
public class RandomNum {

	public static void main(String[] args) {
		showList();
	}
	public static void showSet(){
		Random r = new Random();
				
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(hs.size()<10){
			int num =r.nextInt(20)+1;
			hs.add(num);
		}
		for(Integer i : hs){
			System.out.println(i);
		}
	}
	public static void showList(){
		Random r = new Random();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(al.size()<10){
			int num = r.nextInt(20)+1;
			if(!al.contains(num)){
				al.add(num);
			}
		}
		for(Integer i : al){
			System.out.println(i);
		}
	}
}
