package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/*
 *之前发牌程序虽然可以用，但是牌无序，体验较差，现在进行发完牌后排序的设计
 *分析：
 *		1 LinkedArrayList虽然有序，但它是存入顺序，无法满足要求
 *		2 我们可以将顺序定义为键，值为牌数，只要随机重置键，牌就会打乱，达到洗牌效果	
 *		3 因为是键值对我们可以使用TreeSet集合进行输出，结果就是自然排序
 *		4 装牌的选择有两个：HashMap和TreeMap
 *实现：
 *		A:创建一个HashMap集合
 * 		B:创建一个ArrayList集合
 * 		C:创建花色数组和点数数组
 * 		D:从0开始往HashMap里面存储编号，并存储对应的牌
 *        同时往ArrayList里面存储编号即可。
 *      E:洗牌(洗的是编号)
 *      F:发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
 *      G:看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
 */
public class PokerDemo2 {

	public static void main(String[] args) {
		//创建键值对牌盒
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//常见键集，方便洗牌
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		String[] colors = {"♠","♥","♣","♦"};
		String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		//从0开始往HashMap里面存储编号，并存储对应的牌,同时往ArrayList里面存储编号即可
		int index = 0;
		//注意num和color有顺序
		for(String num : nums){
			for(String color : colors){
				hm.put(index,color.concat(num));
				al.add(index);
				index++;
			}
		}
		hm.put(index,"小王");
		al.add(index);
		index++;
		hm.put(index,"大王");
		al.add(index);
		
		//洗牌
		Collections.shuffle(al);
		
		//发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
		TreeSet<Integer> zhaoyun = new TreeSet<Integer>();
		TreeSet<Integer> zhangfei = new TreeSet<Integer>();
		TreeSet<Integer> kongming = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
		
		//通过ArrayList分发编号
		for(int x=0;x<al.size();x++){
			if(x>=al.size()-3){
				dipai.add(al.get(x));
			}else if(x%3==0){
				zhaoyun.add(al.get(x));
			}else if(x%3==1){
				zhangfei.add(al.get(x));
			}else if(x%3==2){
				kongming.add(al.get(x));
			}
		}
		
		//看牌
		show("赵云",zhaoyun,hm);
		show("张飞",zhangfei,hm);
		show("孔明",kongming,hm);
		show("底牌",dipai,hm);
	}
	public static void show(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
		System.out.print(name+"的牌是：");
		
		//遍历TreeSet集合获取键，通过键去HashMap集合中找值
		for(Integer i : ts){
			String value = hm.get(i);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
