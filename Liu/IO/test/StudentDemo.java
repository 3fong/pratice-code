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
 *����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 *������
 *		����¼�룺System.in
 *		�����ı��ļ� �ַ������
 *		�ָܷߵ����� TreeSet
 *		���ݶ�ȡ���Ĳ�ͬ�����ַ���
 *ʵ�֣�
 *		����ȡ������������������ķ���
 */
public class StudentDemo {

	public static void main(String[] args) throws IOException {
		Comparator<Student> cs = Collections.reverseOrder();
		Set<Student> ss = readInfo(cs);
		outInfo(ss);
	}
	//��ȡѧ����Ϣ��д�뼯�ϣ���Ϊ�����Ҫ������Ϣ������Ҫ�Ѽ��Ϸ���
	public static Set<Student> readInfo(Comparator<Student> cs) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//����Ƚ����������ݴӸߵ������
		Set<Student> ss = new TreeSet<Student>(cs);
		
		String line=null;
		while((line=br.readLine())!=null){
			//��������ж���������������޷�ֹͣ
			if("over".equals(line))
				break;
			String[] s = line.split(",");
			//��String�����е��������ڽ���ѧ��������Ϊ��������int���ͣ��漰string-->int
			Student stu = new Student(s[0],Integer.parseInt(s[1]),
						Integer.parseInt(s[2]),Integer.parseInt(s[3]));
			//��ѧ��������뼯��
			ss.add(stu);
		}
		br.close();	
		return ss;			
	}
	//���ѧ����Ϣ
	public static void outInfo(Set<Student> ss) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\stu1.txt"));
		for(Student s : ss){
			bw.write(s.toString()+"\t");
			/*
			 * ��Ϊ�ַ���ֻ������ַ�������Ҫ�����ֽ���ת��
			 * 	A:String -- int
					Integer.parseInt("100");
				B:int -- String ���ַ���
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
