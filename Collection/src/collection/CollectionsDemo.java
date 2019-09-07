package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		replaceAll();
	}
	public static void replaceAll(){
		List<String> li = new ArrayList<String>();
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");
		sop(li);
		Collections.replaceAll(li, "z","zz");
		sop(li);
		Collections.reverse(li);
		sop(li);
	}
	public static void fillDemo(){
		List<String> li = new ArrayList<String>();
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");
		
		sop(li);
		fillDemo2(li,1,3,"shuai");
		sop(li);		
	}
	//将list集合中部分元素替换
	public static void fillDemo2(List<String> li,int start,int end,String str){
		List<String> a = li.subList(start,end);
		Collections.fill(a,str);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

