package set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 *分析：
 *		有几个类？两个
 *		学生类
 *			成员变量：姓名,语文成绩,数学成绩,英语成绩，总分
 *			构造函数：无参，有参
 *			成员方法：set get toString
 *		测试类
 *			建立treeSet集合
 *			加入学生对象 可采用Scanner
 *			总分从高到底有两种方式
 *				自然排序 将比较顺序倒置
 *				比较器排序 可选取定义类或者匿名内部类的方式
 *		当两种排序方式都存在时，以比较器为主。
 */
public class TreeSetScore {

	public static void main(String[] args) {
		TreeSet<Student1> ts = new TreeSet<Student1>();
		
//		show(ts);
		TreeSet<Student1> ts1 = new TreeSet<Student1>(new Comparator<Student1>(){
			@Override
			public int compare(Student1 o1, Student1 o2) {
				int num = o2.getSum()-o1.getSum();
				if(num==0){
					return o1.getYing()-o2.getYing();
				}
				return num;
			}			
		});
		show(ts1);
	}
	public static void show(TreeSet<Student1> ts){
		Scanner s = new Scanner(System.in);		
				
		for(int x=0;x<5;x++){
			System.out.println("请输入学生姓名");
			String str = s.nextLine();
			System.out.println("请输入语文成绩");
			String yu = s.nextLine();
			System.out.println("请输入数学成绩");
			String math = s.nextLine();
			System.out.println("请输入英语成绩");
			String ying = s.nextLine();
			
			int wen = Integer.parseInt(yu);
			int shu = Integer.parseInt(math);
			int eng = Integer.parseInt(ying);
			ts.add(new Student1(str,wen,shu,eng));
		}
		
		for(Student1 stu : ts){
			System.out.println(stu.toString());
		}
	}
}
