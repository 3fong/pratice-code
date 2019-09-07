package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 按字符串长度排序
 * 思路：
 * 字符串具备比较性，但不是所需求的比较性，所以要自定义比较器
 */
class MyCompare implements Comparator<String>{
	public int compare(String s1,String s2){
		int num = (new Integer(s1.length())).compareTo(new Integer(s2.length()));
		if(num==0)
			return s1.compareTo(s2);//比较字符串的自然顺序
		return num;
	}
}
public class SortBySize {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyCompare());
		
		ts.add("afafafa");
		ts.add("afaffaa");
		ts.add("afa");
		ts.add("afaggggfafa");
		ts.add("ada");
		
		for(Iterator<String> it = ts.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		
	}

}
