package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 *���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺����
 * ָ�����ļ��ǣ�.java�ļ���
 * ָ���ĺ�׺���ǣ�.jad
 * ָ����Ŀ¼�ǣ�jad
 * ������
 * 	�ѵ����ڻ��������������String��replace(old,new)����
 */
public class CopyFolders {

	public static void main(String[] args) throws IOException {
		File origin = new File("F:\\java");
		//Դ�϶����ڣ�Ŀ�Ĳ�һ����������Ҫ�ж��Ƿ���Ҫ�����ļ���
		File aim = new File("F:\\test");
		if(!aim.exists()){
			aim.mkdir();
		}
		//��ȡ�ļ����������ַ���������һ����ȡȫ��Ŀ���ļ��е��ļ����ٽ�����һ��ɸѡ
//		File[] files = getFile(origin);
		
		//��������ֱ�ӻ�ȡɸѡ����ļ�
		File[] file2 = getFile2(origin);
		for(File f : file2){
			//��������.jap
			String newName = f.getName().replace(".java",".jap");
			//ϸ�������ַ
			File newFile = new	File(aim,newName);
			//��������ı�������ȡ�������
			
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
		//��ȡ���ĵ�ַ�����Ǿ���·�������ܾ�����
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
