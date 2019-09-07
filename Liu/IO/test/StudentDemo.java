package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import test2.Man;

/*
 *键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 *分析：
 *		键盘录入：System.in
 *		存入文本文件 字符输出流
 *		总分高低排序 TreeSet
 *		根据读取流的不同有两种方法
 *实现：
 *		将读取和输出建立两个独立的方法
 */
public class StudentDemo {

	public static void main(String[] args) throws IOException {
		Comparator<Student> cs = Collections.reverseOrder();
		Set<Student> ss = readInfo(cs);
		outInfo(ss);
	}
	//读取学生信息并写入集合，因为输出需要接受信息，所以要把集合返回
	public static Set<Student> readInfo(Comparator<Student> cs) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//加入比较器，让数据从高到低输出
		Set<Student> ss = new TreeSet<Student>(cs);
		
		String line=null;
		while((line=br.readLine())!=null){
			//必须加入判断条件，否则程序无法停止
			if("over".equals(line))
				break;
			String[] s = line.split(",");
			//将String数组中的内容用于建立学生对象，因为语数外是int类型，涉及string-->int
			Student stu = new Student(s[0],Integer.parseInt(s[1]),
						Integer.parseInt(s[2]),Integer.parseInt(s[3]));
			//将学生对象加入集合
			ss.add(stu);
		}
		br.close();	
		return ss;			
	}
	//输出学生信息
	public static void outInfo(Set<Student> ss) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\stu1.txt"));
		for(Student s : ss){
			bw.write(s.toString()+"\t");
			/*
			 * 因为字符流只能输出字符，所以要将数字进行转换
			 * 	A:String -- int
					Integer.parseInt("100");
				B:int -- String 三种方法
					String.valueOf(100);Integer.toString(34);
			 */
//			bw.write(s.getSum()+"");
//			bw.write(Integer.toString(s.getSum()));
			bw.write(String.valueOf(s.getSum()));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
