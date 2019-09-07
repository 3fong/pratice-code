package digui;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *需求：递归删除带内容的目录
 *分析：
 *	A 建立文件对象
 *	B 获取文件数组
 *	C 遍历数组，获取文件
 *	D 判断是否还有文件
 *		无  删除
 *		有  返回到C
 *
 *	2015-12-03 12:14:21 不小心把桌面文件几乎全部删除，
 *	特写此心情，哀悼我失去是文件，也希望以后开发中注意，java删除
 *	不走回收站。。。。！！！！！
 */
public class DeleteFile {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sd.format(d);
		System.out.println(s);
				
	}
	public static void show(File file){
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				show(f);
			}else{
				//删除文件
				System.out.println(f.getName()+"---"+f.delete());
			}
			//删除文件夹
			System.out.println(file.getName()+"---"+file.delete());
		}
	}
}
