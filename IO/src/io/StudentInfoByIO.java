package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ���󣺻�ȡѧ�������ܳɼ���������������ӡ���ļ�
 * ˼·��
 * 1 ����ѧ����Ϣ����ȡ��Ӧ����
 * 2 �ü��ϴ洢����
 * 3 ��IO����ļ�
 */
class Student implements Comparable<Student>{
	private String name;
	private int cn,math,en,sum;
	Student(String name,int cn,int math,int en){
		this.name=name;
		this.cn=cn;
		this.math=math;
		this.en=en;
		sum=cn+math+en;
	}
	public int compareTo(Student s){
		int num= new Integer(this.sum).compareTo(new Integer(s.sum));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}
	public String getName(){
		return name;
	}
	public int getSum(){
		return sum;
	}
	public int hashCode(){
		return name.hashCode()+sum*10;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Student))
			throw new RuntimeException("���Ͳ�ƥ��");
		
		Student s = (Student)obj;
		return this.name.equals(s.name)&&this.sum==s.sum;
	}
	public String toString(){
		return "student["+name+","+cn+","+math+","+en+"]";
	}
}

public class StudentInfoByIO {

	public static void main(String[] args) throws IOException {
		Comparator<Student> cmd = Collections.reverseOrder();
		Set<Student> set= StudentInfo.getInfo(cmd);
		StudentInfo.writeInfo(set);
	}
}
class StudentInfo{
	public static Set<Student> getInfo()throws IOException{
		return getInfo(null);
	}
	public static Set<Student> getInfo(Comparator<Student> cmd)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));	
		
		Set<Student> stus = null;
		if(cmd==null)
			stus=new TreeSet<Student>();
		else
			stus=new TreeSet<Student>(cmd);
		
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			String[] s = line.split(",");
			Student stu = new Student(s[0],Integer.parseInt(s[1]),
											Integer.parseInt(s[2]),
											Integer.parseInt(s[3]));
			stus.add(stu);
		}
		br.close();	
		
		return stus;
	}
	public static void writeInfo(Set<Student> set)throws IOException{		
		BufferedWriter bw =
				new BufferedWriter(new FileWriter("stu.txt"));
		for(Student s : set){
			bw.write(s.toString()+'\t');
			bw.write(s.getSum()+"");
			bw.newLine();
			bw.flush();
		}
		bw.close();	
	}
}
