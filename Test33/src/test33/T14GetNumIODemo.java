package test33;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *把当前文本中的所有文本拷贝,存入一个txt文件,统计每个字符出现的次数
 * 并输出,例如   a : 21次   b: 12次.....
	分析：
		这道题有两个需求：1 复制文件； 2 统计字符出现次数
		这是获取字符出现次数的IO版，不同的是字符串不是自己给定，而是从文件中获取
 */
public class T14GetNumIODemo {

	public static void main(String[] args) throws IOException{
		File src = new File("F:\\stu.txt");
		File aim = new File("F:\\s.txt");
		getFile(src,aim);
	}

	private static void getFile(File src,File aim) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(src));
		PrintWriter pw = new PrintWriter(aim);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
			getNum(line);			
		}
		br.close();
		pw.close();
	}

	private static void getNum(String line) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		char[] chs = line.toCharArray();
		
		int count = 0;
		for(char c : chs){
			//因为只要字符出现次数，所以要筛选数据
			if(Character.isLowerCase(c)||Character.isUpperCase(c)){
				Integer value = tm.get(c);
				if(value!=null)
					count=value;
				count++;
				tm.put(c,count);
				count=0;
			}
		}
		//遍历集合获取字符出现次数
		Set<Map.Entry<Character,Integer>> set = tm.entrySet();
		for(Map.Entry<Character,Integer> me :set){
			Character c = me.getKey();
			Integer i = me.getValue();
			System.out.print(c+"("+i+")");
		}
	}
}
