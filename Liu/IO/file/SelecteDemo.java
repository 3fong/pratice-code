package file;

import java.io.File;
import java.io.FilenameFilter;

/*
 *判断E盘目录下是否有后缀名为.mp3的文件，如果有，就输出此文件名称
 *思路：
 *	A:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出。
 *		遍历文件，获取名称，获取后缀名
 * 	B:获取的时候就已经是满足条件的了，然后输出即可。
 * * 要想实现这个效果，就必须学习一个接口：文件名称过滤器
 * 	public String[] list(FilenameFilter filter)
 * 	public File[] listFiles(FilenameFilter filter)
 *	
 * accept(File dir,String name):是FilenameFilter接口的方法，用于判断是否相数组中添加元素。
 */
public class SelecteDemo {

	public static void main(String[] args) {
		show1();
	}
	public static void show(){
		File file = new File("F:\\");
		
		File[] files = file.listFiles();
		for(File f : files){
			//判断是否为文件，因为文件有可能也以这个结尾
			if(f.isFile()){
				if(f.getName().endsWith(".mp3")){
					System.out.println(f.getName());
				}
			}
		}
	}
	public static void show1(){
		File file = new File("F:\\");
		
		String[] files = file.list(new FilenameFilter(){
			//加入判断条件
			@Override
			public boolean accept(File dir, String name) {
//				File file = new File(dir,name);
//				boolean flag = file.isFile();
//				boolean flag2 = name.endsWith(".mp3");
//				return flag&&flag2;
				
				return new File(dir,name).isFile()&&name.endsWith(".mp3");
			}			
		});
		for(String s : files){
			System.out.println(s);
		}
	}
}
