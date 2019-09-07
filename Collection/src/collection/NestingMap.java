package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

//嵌套集合。打印学校里的学生

class Student4{
	private String id;
	private String name;
	Student4(String id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return id+":"+name;
	}
} 
public class NestingMap {

	public static void main(String[] args) {
		TreeMap<String,List<Student4>> xue = new TreeMap<String,List<Student4>>();
		
		List<Student4> yure = new ArrayList<Student4>();
		List<Student4> jichu = new ArrayList<Student4>();
		
		xue.put("yure", yure);
		xue.put("jichu",jichu);
		
		yure.add(new Student4("01","lisi"));
		yure.add(new Student4("02","lisi"));
		jichu.add(new Student4("01","liwu"));
		jichu.add(new Student4("04","liqi"));
		
		Set<String> keySet = xue.keySet();
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			String s = it.next();
			List<Student4> value = xue.get(s);
			System.out.println(s);
			getInfo(value);
		}
		
	}
	public static void getInfo(List<Student4> room){
		for(Iterator<Student4> it = room.iterator();it.hasNext();){
			Student4 s = it.next();
			System.out.println(s);
		}
	}
}
