package base;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();
		
//		ifDemo(x);
//		switchDemo(x);
//		getChoice(x);
		
//		String str = s.nextLine();
//		getString(str);
		
		addCode();
		s.close();
	}
	public static void addCode(){
		for(int x=1; x<=10; x++) {
			if(x%3 == 0) {
				//�������
			}
			System.out.println("Java������");
		}
//		����ÿ���̨���2�Σ�Java������//break;
//		����ÿ���̨���7�Σ�Java������//continue;
//		����ÿ���̨���13�Σ�Java������//System.out.println("Java������");
	}
	public static void getString(String str){
		switch(str){
		case "hello":
			sop("great");
			break;
		case "world":
			sop("nice");
			break;
		case "java":
			sop("yaxi");
			break;
		case "girl":
			sop("heihei");
			break;
		default:
			sop("gun");
		}
	}
	public static void getChoice(int x){
		sop("��ѡ������ϲ�����ˣ�");
		sop("A ������");
		sop("B ������");
		sop("C ������");
		sop("D ����");
		
		char c = (char)x;
		switch(c){ 
		case 'A':
			System.out.println("��ȷ");
			break;
		case 'B':
			System.out.println("��");
			break;
		case 'C':
			System.out.println("No");
			break;
		case 'D':
			System.out.println("����");
			break;
		default:
			sop("û�����ѡ��");
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void ifDemo(int x){
			if(x==1){
			System.out.println("1");
		}
		else if(x==2){
			System.out.println("2");
		}
		else if(x==3){
			System.out.println("3");
		}
		else if(x==4){
			System.out.println("4");
		}
		else if(x==5){
			System.out.println("5");
		}
		else if(x==6){
			System.out.println("6");
		}
		else if(x==7){
			System.out.println("7");
		}
		else{
			System.out.println("gun");
		}
	}
	public static void switchDemo(int x){
		switch(x){
		case 1 :
			System.out.println("1");
			break;
		case 2 :
			System.out.println("2");
			break;
		case 3 :
			System.out.println("3");
			break;
		case 4 :
			System.out.println("4");
			break;
		case 5 :
			System.out.println("5");
			break;
		case 6 :
			System.out.println("6");
			break;
		case 7 :
			System.out.println("7");
			break;
		default:
			System.out.println("gun");
		}
	}
}
