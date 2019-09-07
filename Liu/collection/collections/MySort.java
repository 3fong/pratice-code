package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *Collections可以针对ArrayList存储基本包装类的元素排序，存储自定义对象可不可以排序呢?
 */
public class MySort {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("林青霞", 27));
		list.add(new Student("风清扬", 30));
		list.add(new Student("刘晓曲", 28));
		list.add(new Student("武鑫", 29));
		list.add(new Student("林青霞", 27));
		list.add(new Student("林青霞", 27));
		
		//类型 Collections 中的方法 sort（List<T>）对于参数（List<Student>）不适用
		//Collections.sort(list);
		
		//所以给自定义对象排序可以通过接收比较器的方式， 注意：给比较器加泛型，以及导包
		Collections.sort(list,new Comparator<Student>(){
			public int compare(Student s1,Student s2){
				int num = s1.getName().compareTo(s2.getName());
				if(num==0){
					return s1.getAge()-s2.getAge();
				}
				return num;
			}
		});
		
		//去除重复值方法一 
		ArrayList<Student> al = new ArrayList<Student>();
		for(Student s : list){
			if(!al.contains(s))
				al.add(s);
		}
		//去除重复值方法二
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
