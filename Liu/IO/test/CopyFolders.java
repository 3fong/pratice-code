package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 *需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * 分析：
 * 	难点在于换名，这个可以用String的replace(old,new)方法
 */
public class CopyFolders {

	public static void main(String[] args) throws IOException {
		File origin = new File("F:\\java");
		//源肯定存在，目的不一定，所以需要判断是否需要建立文件夹
		File aim = new File("F:\\test");
		if(!aim.exists()){
			aim.mkdir();
		}
		//获取文件数组有两种方法，方法一：获取全部目标文件夹的文件，再进行下一步筛选
//		File[] files = getFile(origin);
		
		//方法二：直接获取筛选后的文件
		File[] file2 = getFile2(origin);
		for(File f : file2){
			//新名字是.jap
			String newName = f.getName().replace(".java",".jap");
			//细化输出地址
			File newFile = new	File(aim,newName);
			//调用输出文本流，读取输出对象
			
			show(f,newFile);
		}
	}
	private static File[] getFile2(File origin) {
		File[] file2 = origin.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {				
				return new File(dir,name).isFile()&&name.endsWith(".java");
			}			
		});
		return file2;
	}
	private static File[] getFile(File origin){
		File[] files = origin.listFiles();
		return files;
	}
	private static void show(File origin, File newFile) throws IOException {
		//读取流的地址必须是绝对路径否则会拒绝访问
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
		
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
