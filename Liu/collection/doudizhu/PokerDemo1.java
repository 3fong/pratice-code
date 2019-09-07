package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/*
 *模拟斗地主洗牌和发牌
 *分析：	
 *	创建牌盒
 *	装牌
 *	洗牌
 *	发牌
 *	看牌
 */
public class PokerDemo1 {

	public static void main(String[] args) {
		//创建牌盒
		ArrayList<String> al = new ArrayList<String>();
		
		String[] colors = {"♠","♥","♣","♦"};
		String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		for(String color : colors){
			for(String num : nums){
				al.add(color.concat(num));
			}
		}
		al.add("大王");
		al.add("小王");
		
		//洗牌
		Collections.shuffle(al);
		
		//发牌
		ArrayList<String> zhaoyun = new ArrayList<String>();
		ArrayList<String> zhangfei = new ArrayList<String>();
		ArrayList<String> kongming = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
				
		for(int x=0;x<al.size();x++){
			if(x>=al.size()-3){
				dipai.add(al.get(x));
			}
			if(x%3==0)
				zhaoyun.add(al.get(x));
			if(x%3==1)
				zhangfei.add(al.get(x));
			if(x%3==2)
				kongming.add(al.get(x));
		}
		
		//看牌
		show("赵云",zhaoyun);
		show("张飞", zhangfei);
		show("孔明",kongming);
		show("底牌",dipai);
	} 
	public static void show(String name,ArrayList<String> al){
		System.out.print(name+"牌是：");
		for(String s : al){
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
