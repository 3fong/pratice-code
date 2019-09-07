package newFeatures;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *	���������������ö���������ʾ������byte,short,int��long��
	�ŵ㣺������������ ��ʽ��0b��0B��ͷ

	�������������Գ����»��� int x = 100_1000;
	ע�����
		���ܳ����ڽ��Ʊ�ʶ����ֵ֮��
		���ܳ�������ֵ��ͷ�ͽ�β
		���ܳ�����С�����Ա�

	switch ���������ַ���
	���ͼ�
	�쳣�Ķ��catch�ϲ�
	try-with-resources ���
		��ʽ��try(������java.lang.AutoCloseable���������){��}
		�ô���
		��Դ�Զ��ͷţ�����Ҫclose()��
		����Ҫ�ر���Դ�Ĳ��ֶ������������ok��
		��Ҫ������ϵ�Ķ���������ӿڵ�����(��JDK7��API)
 */
public class newFeature {

	public static void main(String[] args) {
		//������������
		int x = 0b10010;
		System.out.println(x);
		
		//�������������Գ����»���
		int y = 1_112_110;
		System.out.println(y);
		
		//���ͼ�
		ArrayList<String> al = new ArrayList<>();
	}

	public static void show(){
		try{
			FileReader fr = new FileReader("F:\\");
			FileWriter fw = new FileWriter("F:\\");
			
			char[] bys = new char[1024];
			int len=0;
			while((len=fr.read(bys))!=-1){
				fw.write(new String(bys,0,len));
			}
			fr.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	//try-with-resources ���
	public static void show1(){
		try(FileReader fr = new FileReader("F:\\");
			FileWriter fw = new FileWriter("F:\\");){
			
			char[] bys = new char[1024];
			int len=0;
			while((len=fr.read(bys))!=-1){
				fw.write(new String(bys,0,len));
			}
			fr.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
