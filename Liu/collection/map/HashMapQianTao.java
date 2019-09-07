package map;

import java.util.HashMap;
import java.util.Set;

/*
 *HashMapǶ��HashMap
 * ���ǲ���
 * 		jc	������
 * 				����¥		20
 * 				��Ծ		22
 * 		jy	��ҵ��
 * 				���		21
 * 				��ʯ��		23
 * 
 * �ȴ洢Ԫ�أ�Ȼ�����Ԫ��
 */
public class HashMapQianTao {
	public static void main(String[] args) {
		HashMap<String,HashMap<String,Student>> school = 
				new HashMap<String,HashMap<String,Student>>();
		
		HashMap<String,Student> jc = new HashMap<String,Student>();
		jc.put("01",new Student("����¥",20));
		jc.put("02",new Student("��Ծ",22));
		
		HashMap<String,Student> jy = new HashMap<String,Student>();
		jy.put("01",new Student("���",21));
		jy.put("02",new Student("��ʯ��",23));
		
		school.put("������", jc);
		school.put("��ҵ��", jy);
		
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
