package string;

import java.util.Scanner;

//����һ����¼��֤ϵͳ��������֤ʧ�ܺ󣬽��Ƴ�
public class RegisterDemo {

	public static void main(String[] args) {
		register();
	}
	public static void register(){
		
		
		String name = "admin";
		String passWord = "admin";
		

		for(int x=2;x>=0;x--){
			Scanner s = new Scanner(System.in);
			System.out.println("�������˺ţ�");
			String s1 = s.nextLine();
			System.out.println("���������룺");
			String s2 = s.nextLine();
			
			if(s1.equals(name)&&s2.equals(passWord)){
				GuessNumDemo.start();
				break;
			}
			else if(x>0){
				System.out.println("���������룬������"+x+"����");				
			}
			else if(x==0){
				System.out.println("С������������");
			}
		}
	}
}
