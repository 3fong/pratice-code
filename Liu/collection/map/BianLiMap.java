package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *�����������ַ��Ͷ���
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
		hm.put("it001", "����");
		hm.put("it003", "����");
		hm.put("it004", "�ǲ�˹");
		hm.put("it005", "�ų���");
		hm.put("it002", "�ò���"); // wps
		hm.put("it001", "�ȶ��Ǵ�");
		
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
		
		//�����д���ǰ˽��ƣ����ǲ��ܳ���8���ϵĵ�������	
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
		hm.put("9527", new Student("���ǳ�", 58));
		hm.put("9522",new Student("���»�", 55));
		hm.put("9524",new Student("����ΰ", 54));
		hm.put("9529",new Student("������", 50));
		
		Set<Map.Entry<String,Student>> entrySet = hm.entrySet();
		for(Map.Entry<String,Student> me : entrySet){
			String key = me.getKey();
			Student value = me.getValue();
			System.out.println(key+":"+value.getName()+":"+value.getAge());
		}
	}
	//HashMap<Student,String>��Ҫ��֤���ݵ�Ψһ�Ա��븴дhashCode()��equals()����
	public static void get4(){
		HashMap<Student,String> hm = new HashMap<Student,String>();
		
		hm.put(new Student("����", 27), "8888");
		hm.put(new Student("���Ѿ�", 30), "6666");
		hm.put(new Student("��ʩ", 33), "5555");
		hm.put(new Student("����", 35), "7777");
		hm.put(new Student("����", 27), "9999");//��������ݸ���ǰ�������
		
		Set<Student> keySet = hm.keySet();
		for(Student s : keySet){
			String value = hm.get(s);
			System.out.println(s.getName()+":"+s.getAge()+":"+value);
		}
	}
}
