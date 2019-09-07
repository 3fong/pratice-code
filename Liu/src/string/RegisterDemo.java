package string;

import java.util.Scanner;

//定义一个登录验证系统，三次验证失败后，将推出
public class RegisterDemo {

	public static void main(String[] args) {
		register();
	}
	public static void register(){
		
		
		String name = "admin";
		String passWord = "admin";
		

		for(int x=2;x>=0;x--){
			Scanner s = new Scanner(System.in);
			System.out.println("请输入账号：");
			String s1 = s.nextLine();
			System.out.println("请输入密码：");
			String s2 = s.nextLine();
			
			if(s1.equals(name)&&s2.equals(passWord)){
				GuessNumDemo.start();
				break;
			}
			else if(x>0){
				System.out.println("请重新输入，您还有"+x+"机会");				
			}
			else if(x==0){
				System.out.println("小样儿，别玩了");
			}
		}
	}
}
