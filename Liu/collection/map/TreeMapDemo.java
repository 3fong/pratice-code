package map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *TreeMap<String,String>
 *TreeMap<Student,String>
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		show1();
	}
	//TreeMap<String,String>
	public static void show(){
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		tm.put("hello", "���");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("world", "����2");
		tm.put("javaee", "צ��EE");
		
		Set<String> keySet = tm.keySet();
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			String s = it.next();
			String value = tm.get(s);
			System.out.println(s+":"+value);
		}
	}
	//TreeMap<Student,String>
	public static void show1(){
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.getName().compareTo(o2.getName());
				if(num==0){
					return o1.getAge()-o2.getAge();
				}
				return num;
			}			
		});
		
		Student s1 = new Student("�˰�", 30);
		Student s2 = new Student("���»�", 35);
		Student s3 = new Student("�Ʋ���", 33);
		Student s4 = new Student("����", 32);
		Student s5 = new Student("�Ʋ���", 33);

		// �洢Ԫ��
		tm.put(s1, "�γ�");
		tm.put(s2, "Ԫ��");
		tm.put(s3, "����");
		tm.put(s4, "�峯");
		tm.put(s5, "����");
		
		//Student cannot be cast to java.lang.Comparable ��ѧ������߱��Ƚ��ԣ�֮ǰ��string����
		//�Ƚ�����Ϊstring��д��hashCode��equals����
		Set<Map.Entry<Student,String>> entrySet = tm.entrySet();
		for(Iterator<Map.Entry<Student,String>> it = entrySet.iterator();it.hasNext();){
			Map.Entry<Student,String> me = it.next();
			
			Student stu = me.getKey();
			String str = me.getValue();
			System.out.println(stu.getName()+":"+stu.getAge()+":"+str);
		}
	}
}
