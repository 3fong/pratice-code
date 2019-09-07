package file;

import java.io.File;

/*
 *G:\\java\\黑马基础\\黑马程序员_毕向东_Java基础视频教程第01天
 *G:\\java\\黑马基础
 *
 *张孝祥java高新技术
 *
 *对应代码
 */
public class FileTest2 {

	public static void main(String[] args) {
		File file = new File("F:\\sanguo");
		
		File[] files = file.listFiles();
		for(File f : files){
			String name = f.getName();
			
			int index = name.indexOf("毕");
//			String start = name.substring(index+1, index+11);
//			
//			int index2 = name.indexOf("第");
//			String end = name.substring(index2+1);
			
			String newName = name.substring(index);
						
			File newFile = new File(file,newName);
			f.renameTo(newFile);
		}
	}

}
