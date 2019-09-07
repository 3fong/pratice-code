package chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 *需求：我有一个文本文件中存储了几个名称，请大家写一个程序实现随机获取一个人的名字。
 *分析：
 *		读取文本，字符读取流
 *		读取后要随机获取，需要建立容器存储，集合最合适
 *		随机获取人名，通过数组的角标最便捷，所以选择ArrayList
林青霞
王祖贤
张敏
贾静雯
李师师

 */
public class GetName {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\c.txt"));
		
		ArrayList<String> al = new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null){
			al.add(line);
		}
		//建立随机对象获取数组角标
		Random r = new Random();
		int index = r.nextInt(al.size());
		
		String name = al.get(index);
		System.out.println("幸运的学生是："+name);
	}

}
