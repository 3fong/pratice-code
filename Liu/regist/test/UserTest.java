package test;

import java.util.Scanner;

import base.User;
import dao.UserDao;
import dao.UserDaoImpl;
import game.GuessNum;

/*
 *����User
 */
public class UserTest {

	public static void main(String[] args) {
		while(true){
			//��ӭ����
			System.out.println("--------------��ӭ����--------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			Scanner s = new Scanner(System.in);
			
			int choice = s.nextInt();
			
			//��Ϊ��¼��ע�ᶼ��Ҫ�����Զ���������
			UserDao ud = new UserDaoImpl();
			
			//�̶�����ѡ����switch
			switch(choice){
			case 1:
				//��¼����
				System.out.println("--------------��¼����--------------");
				User user = print();
				
				//���ʹ�����ݶ����ڷ�Χ�⣬�������
				//UserDao ud = new UserDaoImpl();
				boolean flag = ud.enter(user.getName(), user.getPassword());
				
				if(flag){
					System.out.println("��¼�ɹ������������Ϸ��");
					
					System.out.println("������y/n");
					Scanner s1 = new Scanner(System.in);
					while(true){
						String result = s1.nextLine();
						
						if(result.equalsIgnoreCase("y")){
							GuessNum.start();
							System.out.println("�㻹����y/n");
						}else{
							break;
						}
					}
					System.out.println("ллʹ��");
					System.exit(0);					
				}else{
					System.out.println("�û������������󣬵�¼ʧ��");
				}
				break;
			case 2:
				//ע�����
				System.out.println("--------------ע�����--------------");
				User user1 = print();
				ud.regist(user1);
				System.out.println("ע��ɹ�");
				break;
			case 3:				
			default:
					System.out.println("�ټ���");
					System.exit(0);
					//ֻ���˳�switchѭ����
//					break;
			}
			
				
			
		}
	}
	public static User print(){
		Scanner s = new Scanner(System.in);
		
		User user = new User();
		System.out.println("�������û�����");
		String name = s.nextLine();
		System.out.println("�������¼���룺");
		String password = s.nextLine();
		
		user.setName(name);
		user.setPassword(password);
		
		return user;
	}
}
