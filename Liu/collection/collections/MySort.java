package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *Collections�������ArrayList�洢������װ���Ԫ�����򣬴洢�Զ������ɲ�����������?
 */
public class MySort {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("����ϼ", 27));
		list.add(new Student("������", 30));
		list.add(new Student("������", 28));
		list.add(new Student("����", 29));
		list.add(new Student("����ϼ", 27));
		list.add(new Student("����ϼ", 27));
		
		//���� Collections �еķ��� sort��List<T>�����ڲ�����List<Student>��������
		//Collections.sort(list);
		
		//���Ը��Զ�������������ͨ�����ձȽ����ķ�ʽ�� ע�⣺���Ƚ����ӷ��ͣ��Լ�����
		Collections.sort(list,new Comparator<Student>(){
			public int compare(Student s1,Student s2){
				int num = s1.getName().compareTo(s2.getName());
				if(num==0){
					return s1.getAge()-s2.getAge();
				}
				return num;
			}
		});
		
		//ȥ���ظ�ֵ����һ 
		ArrayList<Student> al = new ArrayList<Student>();
		for(Student s : list){
			if(!al.contains(s))
				al.add(s);
		}
		//ȥ���ظ�ֵ������
//		for(int x=0;x<list.size()-1;x++){
//			for(int y=x+1;y<list.size();y++){
//				if(list.get(x).equals(list.get(y))){
//					list.remove(y);
//					y--;
//				}				
//			}
//		}
		for(Student s : al){
			System.out.println(s.getName()+":"+s.getAge());
		}
 	}

}
