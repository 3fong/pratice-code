package test;

import java.util.Scanner;

import base.User2;
import dao.UserDaoImplem;

/*
 *测试登录程序
 *	分三部分：
 *		登录
 *		注册
 *		退出
 */
public class UserTest2 {

	public static void main(String[] args) {
		//为了能回来
		while(true){
			sop("-------------------欢迎光临-------------------");
			sop("1 登录");
			sop("2 注册");
			sop("3 退出");
			sop("请选择：");
			Scanner s = new Scanner(System.in);
			//输入语句int在前面会与String的输入冲突，故定义成字符串形式，所以case的选项也要改成字符串
			String num = s.nextLine();
			
			UserDaoImplem ud = new UserDaoImplem();
			switch(num){
			case "1":
				sop("-------------------欢迎登录-------------------");
				sop("请输入姓名：");
				String name = s.nextLine();
				sop("请输入密码：");
				String password = s.nextLine();
				
				boolean flag = ud.entry(name, password);
				sop(flag);
				break;
			case "2":
				sop("-------------------欢迎注册-------------------");
				sop("请输入姓名：");
				String name2 = s.nextLine();
				sop("请输入密码：");
				String password2 = s.nextLine();
				
				User2 user = new User2();
				user.setName(name2);
				user.setPassword(password2);
				ud.regist(user);
				System.out.println("注册成功");
				break;
			case "3":				
			default:
				sop("欢迎下次使用");
				System.exit(0);
				break;
			}
		}		
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
