package list;

import java.util.ArrayList;

/*
 *集合的嵌套遍历
 *用集合遍历输出班级及其学生对象
 *分析：
 *		班级是对象，用集合存
 *		学生也是对象，他应该在班级中，所以是嵌套遍历
 */
public class DoubleCollection {

	public static void main(String[] args) {
		//存储班级对象的集合 学校
		ArrayList<ArrayList<Student>> arrAl = new ArrayList<ArrayList<Student>>();
		
		//存储学生对象的集合 班级一
		ArrayList<Student> stuAl = new ArrayList<Student>();
		
		stuAl.add(new Student("翠花",18));
		stuAl.add(new Student("翠小花",19));
		stuAl.add(new Student("翠春花",17));
		
		//存储学生对象的集合 班级二
		ArrayList<Student> stuAl1 = new ArrayList<Student>();
		
		stuAl1.add(new Student("大宝",18));
		stuAl1.add(new Student("小宝",19));
		
		//存储学生对象的集合 班级三
		ArrayList<Student> stuAl2 = new ArrayList<Student>();
		
		stuAl2.add(new Student("丽丽",18));
		stuAl2.add(new Student("花花",19));
		stuAl2.add(new Student("甜甜",17));
		stuAl2.add(new Student("苏苏",17));
		
		//往学校中加入班级
		arrAl.add(stuAl);
		arrAl.add(stuAl1);
		arrAl.add(stuAl2);
		
		for(ArrayList<Student> al : arrAl){
			for(Student s : al){
				System.out.println(s.getName()+":"+s.getAge());
			}
		}
	}

}
