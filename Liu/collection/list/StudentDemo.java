package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。	
	学生：Student
		成员变量：name,age
		构造方法：无参,带参
		成员方法：getXxx()/setXxx()
 */
public class StudentDemo {

	public static void main(String[] args) {
//		objectArray();
		collectionArray();
	}
	public static void collectionArray(){
		Collection<Student> al = new ArrayList<Student>();
		al.add(new Student("zhao",12));
		al.add(new Student("qian",12));
		al.add(new Student("sun",12));
		al.add(new Student("li",12));
		al.add(new Student("han",12));
		
//		for(Iterator<Student> it = al.iterator();it.hasNext();){
//			Student s = it.next();
//			System.out.println(s);
//		}
		
		//遍历方法二
		Object[] obj = al.toArray();
		for(int x=0;x<obj.length;x++){
			Student s = (Student)obj[x];
			System.out.println(s.getName()+s.getAge());
		}
	}
	//对象数组
	public static void objectArray(){
		Student[] stu = new Student[5];
		
		Student s1 = new Student("赵",21);
		Student s2 = new Student("钱",21);
		Student s3 = new Student("孙",21);
		Student s4 = new Student("李",21);
		Student s5 = new Student("周",21);
		
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		stu[3]=s4;
		stu[4]=s5;
		
		//stu继承自Object，没有添加方法。
//		for(int x=0;x<stu.length;x++){
//			stu[x].
//		}
		
		for(int x=0;x<stu.length;x++){
			Student s = stu[x];
//			System.out.println(s.getName()+s.getAge());
			System.out.println(s);//直接输出，会自动调用toString()方法。要是没有复写就会返回地址值。
		}
	}
}
