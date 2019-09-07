package collection;
//自定义比较器

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class MyCom implements Comparator<Student3>{
	public int compare(Student3 s1,Student3 s2){
		int num = s1.getName().compareTo(s2.getName());
		if(num==0)
			return new Integer(s1.getAge()).compareTo(s2.getAge());
		return num;
	}
}
public class MyTreeMap2 {

	public static void main(String[] args) {
		TreeMap<Student3,String> tm = new TreeMap<Student3,String>();
		
		tm.put(new Student3("lisi",21), "shanghai");
		tm.put(new Student3("lisi",22), "shanghai");
		tm.put(new Student3("liwu",21), "tianjin");
		tm.put(new Student3("zhaoliu",22), "beijing");
		
		Set<Student3> keySet = tm.keySet();
		for(Iterator<Student3> it = keySet.iterator();it.hasNext();){
			Student3 s = it.next();
			String value = tm.get(s);
			System.out.println(s+":"+value);
		}
	}

}
