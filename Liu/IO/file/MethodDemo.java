package file;

import java.io.File;

/*
 *public boolean renameTo(File dest)重命名
 *	如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
	判断
	public boolean isDirectory():是否是目录
	public boolean isFile():是否是文件
	public boolean exists():是否存在
	public boolean canRead():是否可读
	public boolean canWrite():是否可写
	public boolean isHidden():是否隐藏
 */
public class MethodDemo {

	public static void main(String[] args) {
		File file = new File("F:\\io.txt");
		File newFile = new File("F:\\JAVA.txt");
		System.out.println("renameTo:"+file.renameTo(newFile));
		
		File file2 = new File("G:\\io.txt");
		System.out.println("renameTo:"+newFile.renameTo(file2));
		
		judge();
	}
	public static void judge(){
		File file = new File("F:\\io.txt");
		
		sop("isDirectory():"+file.isDirectory());
		sop("isFile():"+file.isFile());
		sop("exists():"+file.exists());
		sop("canRead():"+file.canRead());
		sop("canWrite():"+file.canWrite());
		sop("isHidden():"+file.isHidden());
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
