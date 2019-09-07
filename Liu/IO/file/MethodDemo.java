package file;

import java.io.File;

/*
 *public boolean renameTo(File dest)������
 *	���·������ͬ�����Ǹ�����
 * 		���·������ͬ�����Ǹ��������С�
	�ж�
	public boolean isDirectory():�Ƿ���Ŀ¼
	public boolean isFile():�Ƿ����ļ�
	public boolean exists():�Ƿ����
	public boolean canRead():�Ƿ�ɶ�
	public boolean canWrite():�Ƿ��д
	public boolean isHidden():�Ƿ�����
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
