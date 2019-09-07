package test33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/*
 * 4�� �����ѧ����ÿ��ѧ����3�ſΣ����ġ���ѧ��Ӣ��ĳɼ���
 * дһ��������մӼ�������ѧ������Ϣ�� �����ʽΪ��name,30,30,30
 * �����������ſγɼ�����  Ȼ��������ѧ����Ϣ���ִܷӸߵ��͵�˳��д��
 * ��һ������"stu.txt"�ļ��С�Ҫ��stu.txt�ļ��ĸ�ʽҪ�Ƚ�ֱ�ۣ�
 * ������ļ����Ϳ��Ժ�����Ŀ���ѧ������Ϣ��
	������
	�ࣺStudent  StudentInfo
	��Ա�������������⡢��ȡ�������ܷ�
	StudentInfo����IO����������Ψһ��Ҫ����TreeSet
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
		//Ϊ�Զ����������Ԫ�ر���߱��Ƚ���
		TreeSet<Student> ts = getInfo();
		outInfo(ts);
		printInfo(ts);
	}
	//��ѧ����Ϣ�����ڿ���̨��ӡ
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
		//����¼��
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		TreeSet<Student> ts = new TreeSet<Student>();
		
		//����Ϣ���뼯��
		String line = null;
		while((line=br.readLine())!=null){
			//��Ϊ�Ǽ���¼�룬�����жϽ�������
			if(line.equals("over"))
				break;
			String[] sts = line.split(" ");
			Student s = new Student(sts[0],Integer.parseInt(sts[1]),
					Integer.parseInt(sts[2]),Integer.parseInt(sts[3]));
			ts.add(s);
		}
		return ts;
	}
	//�ô�ӡ�������Ϣ
	private static void outInfo(TreeSet<Student> ts) throws IOException{
		PrintWriter pw = new PrintWriter("F:stu.txt");
		
		//�������ϣ������Ϣ
		for(Student s : ts){
			pw.print(s.toString()+'\t');
			pw.println(s.getSum());
			pw.flush();
		}
		pw.close();
	}
}
