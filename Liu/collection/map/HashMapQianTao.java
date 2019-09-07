package map;

import java.util.HashMap;
import java.util.Set;

/*
 *HashMap嵌套HashMap
 * 传智播客
 * 		jc	基础班
 * 				陈玉楼		20
 * 				高跃		22
 * 		jy	就业班
 * 				李杰		21
 * 				曹石磊		23
 * 
 * 先存储元素，然后遍历元素
 */
public class HashMapQianTao {
	public static void main(String[] args) {
		HashMap<String,HashMap<String,Student>> school = 
				new HashMap<String,HashMap<String,Student>>();
		
		HashMap<String,Student> jc = new HashMap<String,Student>();
		jc.put("01",new Student("陈玉楼",20));
		jc.put("02",new Student("高跃",22));
		
		HashMap<String,Student> jy = new HashMap<String,Student>();
		jy.put("01",new Student("李杰",21));
		jy.put("02",new Student("曹石磊",23));
		
		school.put("基础班", jc);
		school.put("就业班", jy);
		
		Set<String> keySet = school.keySet();
		for(String s : keySet){
			HashMap<String,Student> value = school.get(s);
			
			Set<String> ban = value.keySet();
			for(String key : ban){
				Student stu = value.get(key);
				System.out.println(stu.getName()+":"+stu.getAge());
			}
		}
	}

}
