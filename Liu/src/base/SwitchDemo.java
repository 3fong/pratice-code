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
				//补齐代码
			}
			System.out.println("Java基础班");
		}
//		如何让控制台输出2次：Java基础班//break;
//		如何让控制台输出7次：Java基础班//continue;
//		如何让控制台输出13次：Java基础班//System.out.println("Java基础班");
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
		sop("请选择你最喜欢的人：");
		sop("A 林心如");
		sop("B 安以轩");
		sop("C 蔡依林");
		sop("D 刘涛");
		
		char c = (char)x;
		switch(c){ 
		case 'A':
			System.out.println("正确");
			break;
		case 'B':
			System.out.println("不");
			break;
		case 'C':
			System.out.println("No");
			break;
		case 'D':
			System.out.println("算了");
			break;
		default:
			sop("没有这个选项");
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
