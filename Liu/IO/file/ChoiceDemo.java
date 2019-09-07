package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *
 */
public class ChoiceDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("G:\\java\\刘意");
		show(file);

	}
	public static void show(File file) throws IOException{
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				show(f);
			}else{
				if(f.getName().endsWith("作业.txt")){
					BufferedInputStream bis = 
							new BufferedInputStream(new FileInputStream(f));//f本身就是第一个绝对路径
					
					BufferedOutputStream bos = 
							new BufferedOutputStream(new FileOutputStream("C:\\Users\\David\\Desktop\\新建文件夹\\"+f.getName()));
					
					byte[] bytes = new byte[1024];
					int len=0;
					while((len=bis.read(bytes))!=-1){
						bos.write(bytes,0,len);
					}
					bis.close();
					bos.close();
				}
			}
		}
	}
}
