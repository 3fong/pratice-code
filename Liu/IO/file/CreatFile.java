package file;

import java.io.File;
import java.io.IOException;

/*
 *File:文件和目录(文件夹)路径名的抽象表示形式
 * 构造方法：
 * 		File(String pathname)：根据一个路径得到File对象
 * 		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * 		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 *创建功能：
 *public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 *注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了
 *删除功能:
 *public boolean delete()
 * 注意：
 * 		A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 * 		B:Java中的删除不走回收站。
 * 		C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */
public class CreatFile {

	public static void main(String[] args) throws IOException {
		// File(String pathname)：根据一个路径得到File对象
		// 把F:\\demo\\a.txt封装成一个File对象，并未创建文件
		File file1 = new File("F:\\Demo\\a.txt");
		
		File file2 = new File("F:\\Demo","a.txt");
		
		File file = new File("F:\\Demo");
		
		File file3 = new File(file,"a.txt");
		
		create();
		
	}
	public static void create() throws IOException{
		//创建单层文件夹
		File file1 = new File("F:\\test");
		sop("mkdir:"+file1.mkdir());
		
		//创建文件，注意必须保证文件存在
		File file = new File("F:\\test\\a.txt");
		boolean flag = file.createNewFile();
		System.out.println(flag);
		
		//创建多层文件夹
		File file2 = new File("F:\\A\\B\\C\\D\\E");
		
		sop("delete:"+file2.delete());
//		sop("mkdirs:"+file2.mkdirs());
		file2.deleteOnExit();
		//删除文件
		sop("delete:"+file.delete());
		//删除文件夹
		sop("delete:"+file1.delete());
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
