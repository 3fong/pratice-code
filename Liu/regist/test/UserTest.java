package test;

import java.util.Scanner;

import base.User;
import dao.UserDao;
import dao.UserDaoImpl;
import game.GuessNum;

/*
 *测试User
 */
public class UserTest {

	public static void main(String[] args) {
		while(true){
			//欢迎界面
			System.out.println("--------------欢迎光临--------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			Scanner s = new Scanner(System.in);
			
			int choice = s.nextInt();
			
			//因为登录和注册都需要，所以定义在外面
			UserDao ud = new UserDaoImpl();
			
			//固定项数选择，用switch
			switch(choice){
			case 1:
				//登录界面
				System.out.println("--------------登录界面--------------");
				User user = print();
				
				//多次使用数据定义在范围外，方便调用
				//UserDao ud = new UserDaoImpl();
				boolean flag = ud.enter(user.getName(), user.getPassword());
				
				if(flag){
					System.out.println("登录成功，你可以玩游戏了");
					
					System.out.println("你玩吗？y/n");
					Scanner s1 = new Scanner(System.in);
					while(true){
						String result = s1.nextLine();
						
						if(result.equalsIgnoreCase("y")){
							GuessNum.start();
							System.out.println("你还玩吗？y/n");
						}else{
							break;
						}
					}
					System.out.println("谢谢使用");
					System.exit(0);					
				}else{
					System.out.println("用户名或密码有误，登录失败");
				}
				break;
			case 2:
				//注册界面
				System.out.println("--------------注册界面--------------");
				User user1 = print();
				ud.regist(user1);
				System.out.println("注册成功");
				break;
			case 3:				
			default:
					System.out.println("再见！");
					System.exit(0);
					//只能退出switch循环。
//					break;
			}
			
				
			
		}
	}
	public static User print(){
		Scanner s = new Scanner(System.in);
		
		User user = new User();
		System.out.println("请输入用户名：");
		String name = s.nextLine();
		System.out.println("请输入登录密码：");
		String password = s.nextLine();
		
		user.setName(name);
		user.setPassword(password);
		
		return user;
	}
}
