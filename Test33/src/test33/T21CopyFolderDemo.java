package test33;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 *����һ���ļ��е���һ��Ŀ¼�¡�
 *������
 *		�����ļ��У��õ��ݹ飬
 *		����Դ��Ŀ���ļ��У�һ��Դ�϶����ڣ��ж�Ŀ���ļ��Ƿ���ڣ������ھʹ���
 *		�����ݹ鷽���������ж��Ƿ����ļ��У��Ǿ�Ҫ�����ļ��д����ļ�ͬ���ļ���
 *		�����ļ��������ٴεݹ�
 *		��Ϊ���ڵ�Ŀ���Ѿ������仯����Ҫ�ؽ�Ŀ�ģ�������IO���и���
 */
public class T21CopyFolderDemo {

	public static void main(String[] args) throws IOException{
		File src = new File("F:\\��ϰ�ļ�");
		File aim = new File("F:\\a");
		if(!aim.exists())
			aim.mkdir();
		
		show(src,aim);
	}

	private static void show(File src, File aim) throws IOException{
		if(src.isDirectory()){
			File folder = new File(aim,src.getName());
			folder.mkdir();
			
			File[] files = src.listFiles();
			for(File f : files){
				//ע������ݹ��Դ��Ŀ�Ķ�������µ�ַ
				show(f,folder);
			}
		}else{
			File newFile = new File(aim,src.getName());
			
			InOut(src,newFile);
		}
	}

	private static void InOut(File src, File newFile) throws IOException{
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(src));
		PrintStream ps = new PrintStream(newFile);
		
		byte[] bys = new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			ps.write(bys,0,len);
		}
		bis.close();
		ps.close();
	}
}
