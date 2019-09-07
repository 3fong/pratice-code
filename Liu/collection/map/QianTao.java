package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ** 为了更符合要求：
 * 		这次的数据就看成是学生对象。
 * 
 * 学校
 * 		bj	北京校区
 * 			jc	基础班
 * 					林青霞		27
 * 					风清扬		30
 * 			jy	就业班	
 * 					赵雅芝		28
 * 					武鑫		29
 * 		sh	上海校区
 * 			jc	基础班
 * 					郭美美		20
 * 					犀利哥		22
 * 			jy	就业班	
 * 					罗玉凤		21
 * 					马征		23
 * 分析：
 * 		涉及三层数据，所以要使用三个集合，前两个是对应关系应用HashMap，学生对象可以使用任意集合，这里用ArrayList
 * 		同时注意基础班每个校区只有一个，这样才能保证键的唯一，多个学生全部放入arrayList集合中
 */
public class QianTao {

	public static void main(String[] args) {
		//添加学校
		HashMap<String,HashMap<String,ArrayList<Student>>> school = 
				new HashMap<String,HashMap<String,ArrayList<Student>>>();
		
		//-----------------------北京校区---------------------------------
		//添加班级
		ArrayList<Student> jc = new ArrayList<Student>();
		//添加学生
		jc.add(new Student("林青霞",27));
		jc.add(new Student("风清扬",30));
		
		ArrayList<Student> jy = new ArrayList<Student>();
		jy.add(new Student("赵雅芝",28));
		jy.add(new Student("武鑫",29));
		//添加校区
		HashMap<String,ArrayList<Student>> beij = 
				new HashMap<String,ArrayList<Student>>();
		beij.put("基础班",jc);
		beij.put("就业班",jy);
		
		//-----------------------上海校区---------------------------------
		//添加班级
		ArrayList<Student> jc2 = new ArrayList<Student>();
		//添加学生
		jc2.add(new Student("郭美美",20));
		jc2.add(new Student("犀利哥",22));
				
		ArrayList<Student> jy2 = new ArrayList<Student>();
		jy2.add(new Student("罗玉凤",21));
		jy2.add(new Student("马征",23));
		//添加校区
		HashMap<String,ArrayList<Student>> sh = 
				new HashMap<String,ArrayList<Student>>();
		sh.put("基础班",jc2);
		sh.put("就业班",jy2);
		
		//将校区添加到学校
		school.put("北京校区",beij);
		school.put("上海校区",sh);
		
		//遍历集合，注意每次获取值是整个集合的值，不是键集合的值
		Set<String> sch = school.keySet();
		for(String sc : sch){
			HashMap<String,ArrayList<Student>> xiaoQu = school.get(sc);
			System.out.println(sc);
			
			Set<String> xiao = xiaoQu.keySet();
			for(String xi : xiao){
				ArrayList<Student> banJi = xiaoQu.get(xi);
				System.out.println("\t"+xi);
				
				for(Student ban : banJi){
					System.out.println("\t\t"+ban.getName()+":"+ban.getAge());
				}
			}
		}
	}

}
