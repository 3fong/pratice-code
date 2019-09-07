package file;

import java.io.File;

/*获取功能：
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次的修改时间，毫秒值
 * 
 *获取功能：
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组 
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class GetFile {

	public static void main(String[] args) {
		File file = new File("C:\\");
		
		String[] st = file.list();
		for(String s : st){
			System.out.println(s);
		}
		System.out.println("-----------------------------------");
		File[] files = file.listFiles();
		for(File f : files){
			System.out.println(f.getName()+":"+f.getPath());
		}
	}

}
