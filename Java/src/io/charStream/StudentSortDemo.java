package io.charStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*
 *�����ѧ��ÿ��ѧ����3�ſεĳɼ���
	�Ӽ�������������ݣ������������ſγɼ�����
	����ĸ�ʽ���磺zhangsan,30,40,60������ܳɼ���
	����ѧ�����Ϣ���ܷ���Ӹߵ��ʹ���ڴ����ļ�"stud.txt"�С�
 */
public class StudentSortDemo {

	public static void main(String[] args) throws IOException{
		Comparator<Student> com = Collections.reverseOrder();
		TreeSet<Student> ts = sortStudent(com);
		for(Student s : ts){
			String info = s.toString();
			int sum = s.getSum();
			System.out.println(info+":"+sum);
		}
		TreeSet<Student> ts1 = sortStudent();
		outInfo(ts1);
	}
	
	private static void outInfo(TreeSet<Student> ts) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\stu.txt"),true);
		for(Student s : ts){
			pw.print(s.toString()+'\t');
			pw.println(s.getSum());
		}
		pw.close();
	}
	public static TreeSet<Student> sortStudent() throws IOException{
		
		return sortStudent(null);
	}
	private static TreeSet<Student> sortStudent(Comparator<Student> com) throws IOException{
		
		TreeSet<Student> ts = null;
		if(com==null)
			ts = new TreeSet<Student>();
		else
			ts = new TreeSet<Student>(com);
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));		
		while(true){
			String line=br.readLine();
			if(line.equals("over"))
				break;
			String[] sts = line.split(",");
			Student s = new Student(sts[0],Integer.parseInt(sts[1]),
					Integer.parseInt(sts[2]),Integer.parseInt(sts[3]));
			ts.add(s);
		}
		return ts;
	}
}
