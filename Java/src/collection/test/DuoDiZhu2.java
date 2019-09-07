package collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 *我们可以将顺序定义为键，值为牌数，只要随机重置键，牌就会打乱，达到洗牌效果
 *因为要洗牌，所以需定义ArrayList，它存入的是键
 *存牌HashMap，TreeMap都行，
 *发牌用TreeSet来使牌有序
 */
public class DuoDiZhu2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		String[] colors = {"♠","♥","♣","♦"};
		String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		int count=1;
		//按牌数的大小排序，所以花色应放在内部
		for(String s : nums){
			for(String st : colors){
				hm.put(count, st.concat(s));
				al.add(count);
				count++;
			}
		}
		hm.put(count, "小王");
		al.add(count);
		count++;
		hm.put(count, "大王");
		al.add(count);
		
		//洗牌
		Collections.shuffle(al);
		//发牌
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		TreeSet<Integer> ts3 = new TreeSet<Integer>();
		TreeSet<Integer> ts4 = new TreeSet<Integer>();
		
		for(int x=0;x<al.size();x++){
			if(x>=al.size()-3){
				ts1.add(al.get(x));
			}else if(x%3==0){
				ts2.add(al.get(x));
			}else if(x%3==1){
				ts3.add(al.get(x));
			}else if(x%3==2){
				ts4.add(al.get(x));
			}
		}
		//从al获取集合键
		getMap("赵云",ts2,hm);	
		getMap("诸葛",ts3,hm);
		getMap("李元霸",ts4,hm);
		getMap("底牌",ts1,hm);
	}

	private static void getMap(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
		System.out.print("玩家："+name);
		for(Integer i : ts){
			String value = hm.get(i);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
