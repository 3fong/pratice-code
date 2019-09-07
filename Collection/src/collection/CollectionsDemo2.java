package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		shuffleDemo();
	}
	public static void Demo(){
		TreeSet<String> li = new TreeSet<String>(Collections.reverseOrder());
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");
	
		for(Iterator<String> it = li.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
	public static void shuffleDemo(){
		List<String> li = new ArrayList<String>();
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");	
		
		System.out.println(li);
		Collections.shuffle(li);//随机充值元素位置
		System.out.println(li);
	}
}
