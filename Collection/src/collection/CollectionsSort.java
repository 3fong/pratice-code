package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//用工具类排序
class MySort implements Comparator<String>{
	public int compare(String s1,String s2){
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		else
			return s1.compareTo(s2);
	}
}
public class CollectionsSort {

	public static void main(String[] args) {
		binarySearchDemo();
	}
	public static void binarySearchDemo(){
		List<String> li = new ArrayList<String>();
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");
		Collections.sort(li,new MySort());
		sop(li);
//		int index = Collections.binarySearch(li,"z");
		int index = mySearch(li,"ergfg",new MySort());
		sop(index);		
	}
	public static int mySearch(List<String> li,String key,Comparator<String> com){
		int max,min,mid;
		max=li.size()-1;
		min=0;
		while(min<=max){
			mid=(max+min)>>1;
			
			String str = li.get(mid);
			int num = com.compare(str,key);
			if(num>0)
				max=mid-1;
			else if(num<0)
				min=mid+1;
			else
				return mid;
		}
		return -min-1;
	}
	public static void getMax(){
		List<String> li = new ArrayList<String>();
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");
		
//		Collections.sort(li);
		System.out.println(li);
		String max = Collections.max(li,new MySort());
		System.out.println(max);
	}
	public static void Demo(){
		List<String> li = new ArrayList<String>();
		
		li.add("z");
		li.add("gd");
		li.add("ergfg");
		li.add("hhh");
		li.add("ga");
		
		System.out.println(li);
		Collections.sort(li,new MySort());
		System.out.println(li);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
