package file;

import java.io.File;

/*
 *需求：把E:\评书\三国演义下面的视频名称修改为
 * 		00?_介绍.txt
 * 思路：
 * 		封装目录
 * 		遍历获取目录数组
 * 		遍历数组，获取file对象
 * 		拼接名称，返回
 */
public class FileTest {

	public static void main(String[] args) {
		File file = new File("F:\\sanguo");
		
		File[] files = file.listFiles();
		for(File f : files){
			//E评书三国演义三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义
			String name = f.getName();
			
			int index = name.indexOf('_');
			String start = name.substring(index+1,index+4);
			
			int endIndex = name.lastIndexOf('_');
			String end = name.substring(endIndex);
			
			String newName = start.concat(end);
			
//			System.out.println(newName);
			File newFile = new File(file,newName);
			
			f.renameTo(newFile);
		}
	}

}
