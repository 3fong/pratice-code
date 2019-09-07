package set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 *������
 *		�м����ࣿ����
 *		ѧ����
 *			��Ա����������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ����ܷ�
 *			���캯�����޲Σ��в�
 *			��Ա������set get toString
 *		������
 *			����treeSet����
 *			����ѧ������ �ɲ���Scanner
 *			�ִܷӸߵ��������ַ�ʽ
 *				��Ȼ���� ���Ƚ�˳����
 *				�Ƚ������� ��ѡȡ��������������ڲ���ķ�ʽ
 *		����������ʽ������ʱ���ԱȽ���Ϊ����
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
			System.out.println("������ѧ������");
			String str = s.nextLine();
			System.out.println("���������ĳɼ�");
			String yu = s.nextLine();
			System.out.println("��������ѧ�ɼ�");
			String math = s.nextLine();
			System.out.println("������Ӣ��ɼ�");
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
