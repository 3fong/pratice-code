package test33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/*
 * 4、 有五个学生，每个学生有3门课（语文、数学、英语）的成绩，
 * 写一个程序接收从键盘输入学生的信息， 输入格式为：name,30,30,30
 * （姓名，三门课成绩），  然后把输入的学生信息按总分从高到低的顺序写入
 * 到一个名称"stu.txt"文件中。要求：stu.txt文件的格式要比较直观，
 * 打开这个文件，就可以很清楚的看到学生的信息。
	分析：
	类：Student  StudentInfo
	成员：姓名、语数外、获取方法、总分
	StudentInfo中有IO，集合数据唯一且要排序，TreeSet
 */
class Student implements Comparable<Student>{
	private String name;
	private int yu;
	private int math;
	private int eng;
	private int sum;
	public Student(String name, int yu, int math, int eng) {
		super();
		this.name = name;
		this.yu = yu;
		this.math = math;
		this.eng = eng;
		sum = yu+math+eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYu() {
		return yu;
	}
	public void setYu(int yu) {
		this.yu = yu;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", yu=" + yu + ", math=" + math + ", eng=" + eng + "]";
	}
	@Override
	public int compareTo(Student o) {
		int num = o.sum-this.sum;
		if(num==0)
			return o.name.compareTo(this.name);
		return num;
	}	
}

public class T4StudentInfo {
	public static void main(String[] args) throws IOException{	
		//为自定义对象排序，元素必须具备比较性
		TreeSet<Student> ts = getInfo();
		outInfo(ts);
		printInfo(ts);
	}
	//将学生信息反序在控制台打印
	private static void printInfo(TreeSet<Student> ts) {
		ArrayList<Student> al = new ArrayList<Student>();
		for(Student s : ts){
			al.add(s);
		}
		Collections.reverse(al);
		for(Student s : al){
			System.out.println(s+":"+s.getSum());
		}
	}

	private static TreeSet<Student> getInfo() throws IOException{
		//键盘录入
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		TreeSet<Student> ts = new TreeSet<Student>();
		
		//将信息存入集合
		String line = null;
		while((line=br.readLine())!=null){
			//因为是键盘录入，必须判断结束条件
			if(line.equals("over"))
				break;
			String[] sts = line.split(" ");
			Student s = new Student(sts[0],Integer.parseInt(sts[1]),
					Integer.parseInt(sts[2]),Integer.parseInt(sts[3]));
			ts.add(s);
		}
		return ts;
	}
	//用打印流输出信息
	private static void outInfo(TreeSet<Student> ts) throws IOException{
		PrintWriter pw = new PrintWriter("F:stu.txt");
		
		//变量集合，输出信息
		for(Student s : ts){
			pw.print(s.toString()+'\t');
			pw.println(s.getSum());
			pw.flush();
		}
		pw.close();
	}
}
