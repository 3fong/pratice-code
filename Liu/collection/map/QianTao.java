package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ** Ϊ�˸�����Ҫ��
 * 		��ε����ݾͿ�����ѧ������
 * 
 * ѧУ
 * 		bj	����У��
 * 			jc	������
 * 					����ϼ		27
 * 					������		30
 * 			jy	��ҵ��	
 * 					����֥		28
 * 					����		29
 * 		sh	�Ϻ�У��
 * 			jc	������
 * 					������		20
 * 					Ϭ����		22
 * 			jy	��ҵ��	
 * 					�����		21
 * 					����		23
 * ������
 * 		�漰�������ݣ�����Ҫʹ���������ϣ�ǰ�����Ƕ�Ӧ��ϵӦ��HashMap��ѧ���������ʹ�����⼯�ϣ�������ArrayList
 * 		ͬʱע�������ÿ��У��ֻ��һ�����������ܱ�֤����Ψһ�����ѧ��ȫ������arrayList������
 */
public class QianTao {

	public static void main(String[] args) {
		//���ѧУ
		HashMap<String,HashMap<String,ArrayList<Student>>> school = 
				new HashMap<String,HashMap<String,ArrayList<Student>>>();
		
		//-----------------------����У��---------------------------------
		//��Ӱ༶
		ArrayList<Student> jc = new ArrayList<Student>();
		//���ѧ��
		jc.add(new Student("����ϼ",27));
		jc.add(new Student("������",30));
		
		ArrayList<Student> jy = new ArrayList<Student>();
		jy.add(new Student("����֥",28));
		jy.add(new Student("����",29));
		//���У��
		HashMap<String,ArrayList<Student>> beij = 
				new HashMap<String,ArrayList<Student>>();
		beij.put("������",jc);
		beij.put("��ҵ��",jy);
		
		//-----------------------�Ϻ�У��---------------------------------
		//��Ӱ༶
		ArrayList<Student> jc2 = new ArrayList<Student>();
		//���ѧ��
		jc2.add(new Student("������",20));
		jc2.add(new Student("Ϭ����",22));
				
		ArrayList<Student> jy2 = new ArrayList<Student>();
		jy2.add(new Student("�����",21));
		jy2.add(new Student("����",23));
		//���У��
		HashMap<String,ArrayList<Student>> sh = 
				new HashMap<String,ArrayList<Student>>();
		sh.put("������",jc2);
		sh.put("��ҵ��",jy2);
		
		//��У����ӵ�ѧУ
		school.put("����У��",beij);
		school.put("�Ϻ�У��",sh);
		
		//�������ϣ�ע��ÿ�λ�ȡֵ���������ϵ�ֵ�����Ǽ����ϵ�ֵ
		Set<String> sch = school.keySet();
		for(String sc : sch){
			HashMap<String,ArrayList<Student>> xiaoQu = school.get(sc);
			System.out.println(sc);
			
			Set<String> xiao = xiaoQu.keySet();
			for(String xi : xiao){
				ArrayList<Student> banJi = xiaoQu.get(xi);
				System.out.println("\t"+xi);
				
				for(Student ban : banJi){
					System.out.println("\t\t"+ban.getName()+":"+ban.getAge());
				}
			}
		}
	}

}
