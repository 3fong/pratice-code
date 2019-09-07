package collection.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 *TreeMap������ʽ��TreeSetһ��
a ��Ȼ������Ԫ������߱��Ƚ��ԡ�Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo������
b �Ƚ��������ü�������߱��Ƚ��ԣ�����һ���࣬ʵ��Comparator�ӿڣ�����compare������
	Map��Set������ΪSet�ײ�ʹ����Map���ϡ�
	Map���ϵ�ȡ��ԭ�?��Map����ת��Set���ϣ���ͨ������ȡ����
 */
public class TreeMapSortDemo {

	public static void main(String[] args) {
//		TreeMap<Student,String> tm = new TreeMap<Student,String>();
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new MyComparator());
		tm.put(new Student("01","si1"),"beijing");
		tm.put(new Student("01","alisi1"),"shanghai");
		tm.put(new Student("02","blisi1"),"nanjing");
		tm.put(new Student("03","alisi1"),"tianjin");
		tm.put(new Student("02","i1"),"handan");
		tm.put(new Student("01","lisi1"),"haerbin");
		
		Set<Student> set = tm.keySet();
		for(Student s :set){
			String value = tm.get(s);
			System.out.println(s.getId()+":"+s.getName()+":"+value);
		}
	}
}
//�Ƚ������� �Ȱ������ţ��ٰ�ID��
class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int num = o1.getName().length()-o2.getName().length();
		if(num==0)
			return o1.getId().compareTo(o2.getId());
		return num;
	}
	
}