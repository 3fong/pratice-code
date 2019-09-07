package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * *需求：
 *假设HashMap集合的元素是ArrayList。有3个。
 *每一个ArrayList集合的值是字符串。
 *元素我已经完成，请遍历。
 *结果：
 *		 三国演义
 *		 	吕布
 *		 	周瑜
 *		 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *		 神雕侠侣
 *		 	郭靖
 *		 	杨过 
 */
public class HashMapQianTao2 {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> ha = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("吕布");
		al1.add("周瑜");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("令狐冲");
		al2.add("林平之");
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("郭靖");
		al3.add("杨过 ");
		
		ha.put("三国演义",al1);
		ha.put("笑傲江湖",al2);
		ha.put("神雕侠侣",al3);
		
		Set<String> keySet = ha.keySet();
		for(String key : keySet){
			ArrayList<String> array = ha.get(key);
			System.out.println(key);
			for(String s : array){
				System.out.println("\t"+s);
			}
		}
	}

}
