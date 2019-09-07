package collection.test;

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
 *缺点：排无序，不便于观看
 */
public class DouDiZhu {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		String[] colors = {"♠","♥","♣","♦"};
		String[] counts = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		//装牌
		for(String s : colors){
			for(String st : counts){
				String str = s.concat(st);
				al.add(str);
			}
		}
		al.add("小王");
		al.add("大王");
		//洗牌
		Collections.shuffle(al);
		
		//发牌
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();
		ArrayList<String> al4 = new ArrayList<String>();
		for(int x=0;x<al.size();x++){
			if(x>=al.size()-3){
				al4.add(al.get(x));
			}else if(x%3==0){
				al1.add(al.get(x));
			}else if(x%3==1){
				al2.add(al.get(x));
			}else if(x%3==2){
				al3.add(al.get(x));
			}
		}
		
		//看牌
		show("赵云",al1);
		show("张飞",al2);
		show("诸葛亮",al3);
		show("底牌",al4);
	}

	private static void show(String string, ArrayList<String> al) {
		System.out.print("玩家: "+string);
		for(String s :al){
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
