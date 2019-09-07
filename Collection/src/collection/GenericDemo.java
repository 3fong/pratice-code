package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//给TreeSet集合加上泛型，提高代码安全性

class MyCompare1 implements Comparator<String>{
	public int compare(String s1,String s2){
		int num=new Integer(s2.length()).compareTo(new Integer(s1.length()));
		if(num==0)
			return s2.compareTo(s1);
		return num;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyCompare1());
		
		ts.add("afafafa");
		ts.add("afaffaa");
		ts.add("afa");
		ts.add("afaggggfafa");
		ts.add("ada");
		
		for(Iterator<String> it = ts.iterator();it.hasNext();){
			String s = it.next();
			System.out.println(s);
		}
//		for(String s : ts){
//			System.out.println(s);
//		}
	}

}
