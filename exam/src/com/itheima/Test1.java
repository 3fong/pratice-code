package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
1、 有五个学生，每个学生有3门课（语文、数学、英语）的成绩，写一个程序接收从键盘输入学生的信息，
输入格式为：name,30,30,30（姓名，三门课成绩），然后把输入的学生信息按总分从高到低的顺序写入到
一个名称"stu.txt"文件中。要求：stu.txt文件的格式要比较直观，打开这个文件，就可以很清楚的看到学生的信息。
步骤：
1、描述学生对象；
2、定义一个可操作学生对象的工具类
思路：
1、键盘录入要用到IO中的输入流，并要保证读写效率，所以要加入缓冲区；
2、通过获取键盘录入一行数据，并将该行中的信息取出封装成学生对象；
3、因为学生信息很多，那么就需要存储，使用到集合。同时涉及到学生总分排序，可以使用TreeSet；
4、因为使用TreeSet涉及到排序，可以使用自然排序和自定义排序，本文以自然排序为例；
5、自然排序需要实现Comparable接口，覆盖compareTo方法；
6、将集合的信息写入一个文件。
*/
//实现Comparable接口，强制让Student具备比较性。否则TreeSet集合无法对其排序。
class Student implements Comparable<Student>
{
	//内部数据私有化
	private String name;
	private int cn,ma,en;
	private int sum;
	//进行初始化
	Student(String name,int cn,int ma,int en)
	{
		this.name = name;
		this.cn = cn;
		this.ma = ma;
		this.en = en;
		sum = cn + ma + en;
	}
	//自然排序：根据此对象大于、等于还是小于指定对象，返回负整数、零和正整数。
	public int compareTo(Student s)
	{
		//先比较总分
		int num = new Integer(this.sum).compareTo(new Integer(s.sum));
		
		//总分相同，再按姓名排序。注意：排序时，当主要条件相同时，一定判断一下次要条件。
		if(sum==0)
			return this.name.compareTo(s.name);
		return num;
	}
	public String getName()
	{
		return name;
	}
	public int getSum()
	{
		return sum;
	}
	public int hashCode()
	{
		//保证值的唯一性
		return name.hashCode()+sum*78;
	}
	//判断是否是同一个人
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("类型不匹配");
		
		//向下转型，可以使用Student的自己的方法。
		Student s = (Student)obj;
		
		return this.name.equals(s.name) && this.sum==s.sum;
	}
	//自定义字符串表现形式
	public String toString()
	{
		return "student["+name+","+cn+","+ma+","+en+"]";
	}
}
public class Test1
{
	public static void main(String[] args) throws IOException
	{
		//定义比较器，调用reverseOrder方法，进行强行逆转
		Comparator<Student> cmp = Collections.reverseOrder();
		
		//将学生信息写入集合
		Set<Student> stus = StudentInfoTool.getStudents(cmp);
		
		//将集合数据输出到指定文件
		StudentInfoTool.writeFile(stus);
	}
}
class StudentInfoTool
{
	//按照自然排序方式获取学生信息
	public static Set<Student> getStudents() throws IOException
	{
		//调用不含比较器的方法
		return getStudents(null);
	}
	//定义学生获取方法，并传入自定义比较器
	public static Set<Student> getStudents(Comparator<Student> cmp) throws IOException
	{
		//将键盘录入的值转换成字符流，并存入缓冲区
		BufferedReader bufr =
				new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		//定义不同排序方法的集合
		Set<Student> stus = null;
		if(cmp == null)
			stus = new TreeSet<Student>();
		else
			stus = new TreeSet<Student>(cmp);
		
		//整行读取数据，用","切割，并存入集合
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String[] info = line.split(",");
			
			//解析一个字符串，并返回一个整数
			Student stu = new Student(info[0],Integer.parseInt(info[1]),
							Integer.parseInt(info[2]),
							Integer.parseInt(info[3]));
			stus.add(stu);
		}
		bufr.close();
		
		return stus;
	}
	//将集合中数据存入指定文件
	public static void writeFile(Set<Student> stus) throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter("stu.txt"));
		
		//高级for循环：只能获取，不能修改集合元素。
		for(Student stu : stus)
		{
			//加入制表符
			bufw.write(stu.toString()+"\t");
			
			//将整数转为字符串类型
			bufw.write(stu.getSum()+"");
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}
}