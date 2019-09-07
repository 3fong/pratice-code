package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//用TreeMap两种方法获取元素

class Student3 implements Comparable<Student3>{
	private String name;
	private int age;
	Student3(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student3 s){
		int num = new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}
	public int hashCode(){
		return name.hashCode()+age*10;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Student3))
			throw new ClassCastException("类型不匹配");
		Student3 s = (Student3)obj;
		return this.name.equals(s.name)&&this.age==s.age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String toString(){
		return name+":"+age;
	}
}
public class MyTreeMap {

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
			System.out.println(s+"..."+value);
		}
		
		Set<Map.Entry<Student3,String>> entrySet = tm.entrySet();
		for(Iterator<Map.Entry<Student3,String>> it = entrySet.iterator();it.hasNext();){
			Map.Entry<Student3,String> me= it.next();
			Student3 key = me.getKey();
			String value = me.getValue();
			System.out.println(key+".............."+value);
		}
	}

}
