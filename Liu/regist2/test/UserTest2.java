package test;

import java.util.Scanner;

import base.User2;
import dao.UserDaoImplem;

/*
 *���Ե�¼����
 *	�������֣�
 *		��¼
 *		ע��
 *		�˳�
 */
public class UserTest2 {

	public static void main(String[] args) {
		//Ϊ���ܻ���
		while(true){
			sop("-------------------��ӭ����-------------------");
			sop("1 ��¼");
			sop("2 ע��");
			sop("3 �˳�");
			sop("��ѡ��");
			Scanner s = new Scanner(System.in);
			//�������int��ǰ�����String�������ͻ���ʶ�����ַ�����ʽ������case��ѡ��ҲҪ�ĳ��ַ���
			String num = s.nextLine();
			
			UserDaoImplem ud = new UserDaoImplem();
			switch(num){
			case "1":
				sop("-------------------��ӭ��¼-------------------");
				sop("������������");
				String name = s.nextLine();
				sop("���������룺");
				String password = s.nextLine();
				
				boolean flag = ud.entry(name, password);
				sop(flag);
				break;
			case "2":
				sop("-------------------��ӭע��-------------------");
				sop("������������");
				String name2 = s.nextLine();
				sop("���������룺");
				String password2 = s.nextLine();
				
				User2 user = new User2();
				user.setName(name2);
				user.setPassword(password2);
				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":				
			default:
				sop("��ӭ�´�ʹ��");
				System.exit(0);
				break;
			}
		}		
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
