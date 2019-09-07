package regex;

import java.util.Scanner;

/*
 *校验邮箱
 *分析：
 * 		A:键盘录入邮箱
 * 		B:定义邮箱的规则
 * 			1517806580@qq.com
 * 			liuyi@163.com
 * 			linqingxia@126.com
 * 			fengqingyang@sina.com.cn
 * 			fqy@itcast.cn
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
public class TestMail {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String email = s.nextLine();
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		
//		String regex2="\\w+@\\w{2,6}(\\.\\w{2,3}+";
		
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}

}
