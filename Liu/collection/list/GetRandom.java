package list;

import java.util.ArrayList;
import java.util.Random;

/*
 *获取10个1-20之间的随机数，要求不能重复
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
