package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *遍历以下四种泛型对象
 *HashMap<String,String>
 *HashMap<Integer,String>
 *HashMap<String,Student>
 *HashMap<Student,String>
 */
public class BianLiMap {

	public static void main(String[] args) {
		get4();
	}
	//HashMap<String,String>
	public static void get1(){
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("it001", "马云");
		hm.put("it003", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君"); // wps
		hm.put("it001", "比尔盖茨");
		
		Set<String> keySet = hm.keySet();
		for(String s : keySet){
			String value = hm.get(s);
			System.out.println(s+":"+value);
		}
	}
	//HashMap<Integer,String>
	public static void get2(){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(12,"monday");
		hm.put(34,"tuesday");
		hm.put(12,"wednesday");
		hm.put(78,"firday");
		
		//下面的写法是八进制，但是不能出现8以上的单个数据	
//		hm.put(007,"one");
//		hm.put(008,"two");
	
		Set<Integer> keySet = hm.keySet();
		for(Integer s : keySet){
			String value = hm.get(s);
			System.out.println(s+":"+value);
		}
	}
	//HashMap<String,Student>
	public static void get3(){
		HashMap<String,Student> hm = new HashMap<String,Student>();
		hm.put("9527", new Student("周星驰", 58));
		hm.put("9522",new Student("刘德华", 55));
		hm.put("9524",new Student("梁朝伟", 54));
		hm.put("9529",new Student("刘嘉玲", 50));
		
		Set<Map.Entry<String,Student>> entrySet = hm.entrySet();
		for(Map.Entry<String,Student> me : entrySet){
			String key = me.getKey();
			Student value = me.getValue();
			System.out.println(key+":"+value.getName()+":"+value.getAge());
		}
	}
	//HashMap<Student,String>，要保证数据的唯一性必须复写hashCode()、equals()方法
	public static void get4(){
		HashMap<Student,String> hm = new HashMap<Student,String>();
		
		hm.put(new Student("貂蝉", 27), "8888");
		hm.put(new Student("王昭君", 30), "6666");
		hm.put(new Student("西施", 33), "5555");
		hm.put(new Student("杨玉环", 35), "7777");
		hm.put(new Student("貂蝉", 27), "9999");//后面的数据覆盖前面的数据
		
		Set<Student> keySet = hm.keySet();
		for(Student s : keySet){
			String value = hm.get(s);
			System.out.println(s.getName()+":"+s.getAge()+":"+value);
		}
	}
}
