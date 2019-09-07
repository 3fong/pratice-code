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
1�� �����ѧ����ÿ��ѧ����3�ſΣ����ġ���ѧ��Ӣ��ĳɼ���дһ��������մӼ�������ѧ������Ϣ��
�����ʽΪ��name,30,30,30�����������ſγɼ�����Ȼ��������ѧ����Ϣ���ִܷӸߵ��͵�˳��д�뵽
һ������"stu.txt"�ļ��С�Ҫ��stu.txt�ļ��ĸ�ʽҪ�Ƚ�ֱ�ۣ�������ļ����Ϳ��Ժ�����Ŀ���ѧ������Ϣ��
���裺
1������ѧ������
2������һ���ɲ���ѧ������Ĺ�����
˼·��
1������¼��Ҫ�õ�IO�е�����������Ҫ��֤��дЧ�ʣ�����Ҫ���뻺������
2��ͨ����ȡ����¼��һ�����ݣ����������е���Ϣȡ����װ��ѧ������
3����Ϊѧ����Ϣ�ܶ࣬��ô����Ҫ�洢��ʹ�õ����ϡ�ͬʱ�漰��ѧ���ܷ����򣬿���ʹ��TreeSet��
4����Ϊʹ��TreeSet�漰�����򣬿���ʹ����Ȼ������Զ������򣬱�������Ȼ����Ϊ����
5����Ȼ������Ҫʵ��Comparable�ӿڣ�����compareTo������
6�������ϵ���Ϣд��һ���ļ���
*/
//ʵ��Comparable�ӿڣ�ǿ����Student�߱��Ƚ��ԡ�����TreeSet�����޷���������
class Student implements Comparable<Student>
{
	//�ڲ�����˽�л�
	private String name;
	private int cn,ma,en;
	private int sum;
	//���г�ʼ��
	Student(String name,int cn,int ma,int en)
	{
		this.name = name;
		this.cn = cn;
		this.ma = ma;
		this.en = en;
		sum = cn + ma + en;
	}
	//��Ȼ���򣺸��ݴ˶�����ڡ����ڻ���С��ָ�����󣬷��ظ������������������
	public int compareTo(Student s)
	{
		//�ȱȽ��ܷ�
		int num = new Integer(this.sum).compareTo(new Integer(s.sum));
		
		//�ܷ���ͬ���ٰ���������ע�⣺����ʱ������Ҫ������ͬʱ��һ���ж�һ�´�Ҫ������
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
		//��ֵ֤��Ψһ��
		return name.hashCode()+sum*78;
	}
	//�ж��Ƿ���ͬһ����
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ��");
		
		//����ת�ͣ�����ʹ��Student���Լ��ķ�����
		Student s = (Student)obj;
		
		return this.name.equals(s.name) && this.sum==s.sum;
	}
	//�Զ����ַ���������ʽ
	public String toString()
	{
		return "student["+name+","+cn+","+ma+","+en+"]";
	}
}
public class Test1
{
	public static void main(String[] args) throws IOException
	{
		//����Ƚ���������reverseOrder����������ǿ����ת
		Comparator<Student> cmp = Collections.reverseOrder();
		
		//��ѧ����Ϣд�뼯��
		Set<Student> stus = StudentInfoTool.getStudents(cmp);
		
		//���������������ָ���ļ�
		StudentInfoTool.writeFile(stus);
	}
}
class StudentInfoTool
{
	//������Ȼ����ʽ��ȡѧ����Ϣ
	public static Set<Student> getStudents() throws IOException
	{
		//���ò����Ƚ����ķ���
		return getStudents(null);
	}
	//����ѧ����ȡ�������������Զ���Ƚ���
	public static Set<Student> getStudents(Comparator<Student> cmp) throws IOException
	{
		//������¼���ֵת�����ַ����������뻺����
		BufferedReader bufr =
				new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		//���岻ͬ���򷽷��ļ���
		Set<Student> stus = null;
		if(cmp == null)
			stus = new TreeSet<Student>();
		else
			stus = new TreeSet<Student>(cmp);
		
		//���ж�ȡ���ݣ���","�и�����뼯��
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String[] info = line.split(",");
			
			//����һ���ַ�����������һ������
			Student stu = new Student(info[0],Integer.parseInt(info[1]),
							Integer.parseInt(info[2]),
							Integer.parseInt(info[3]));
			stus.add(stu);
		}
		bufr.close();
		
		return stus;
	}
	//�����������ݴ���ָ���ļ�
	public static void writeFile(Set<Student> stus) throws IOException
	{
		BufferedWriter bufw = new BufferedWriter(new FileWriter("stu.txt"));
		
		//�߼�forѭ����ֻ�ܻ�ȡ�������޸ļ���Ԫ�ء�
		for(Student stu : stus)
		{
			//�����Ʊ��
			bufw.write(stu.toString()+"\t");
			
			//������תΪ�ַ�������
			bufw.write(stu.getSum()+"");
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}
}