package collection.map;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/*
 *�洢Ƕ�׼�ֵ��
	map���ϱ�ʹ������Ϊ�߱�ӳ���ϵ��
	���󣺴洢���ж����ϵ
	"yureban" "01" "zhangsan";
	"yureban" "02" "lisi";
	
	"jiuyeban" "01" "wangwi"
	"jiuyeban" "02" "zhaoliu"
	������
		ѧУ�а༶���༶��ѧ��������Ƕ�ף�
 */
public class DoubleMapDemo {

	public static void main(String[] args) {
		//����ѧУ����
		TreeMap<String,ArrayList<Student>> school = 
				new TreeMap<String,ArrayList<Student>>();
		//�����༶���ϣ������Ԫ��
		ArrayList<Student> yureban = new ArrayList<Student>();
		yureban.add(new Student("01","zhangsan"));
		yureban.add(new Student("02","lisi"));
		ArrayList<Student> jiuyeban = new ArrayList<Student>();
		jiuyeban.add(new Student("01","wangwi"));
		jiuyeban.add(new Student("02","zhaoliu"));
		
		//���༶����ѧУ����
		school.put("01",yureban);
		school.put("02",jiuyeban);
		
		//����ȡ��ѧ�����
		Set<String> set = school.keySet();
		for(String s : set){
			ArrayList<Student> as = school.get(s);
			circleBan(as);
		}	
	}
	private static void circleBan(ArrayList<Student> as) {
		for(Student s : as){
			System.out.println(s.getId()+":"+s.getName());
		}
	}

}
