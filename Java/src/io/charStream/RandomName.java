package io.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 *��������һ���ı��ļ��д洢�˼�����ƣ�����дһ������ʵ������ȡһ���˵����֡�
 *������
 *		����һ�����Ϻ�IO��ϵ����⣬��ȡ�ı������ַ��������ı����뼯��
 *		�����ж�ȡ���õ����������з���
 *		����ȡ�������Math Random��ȡ�Ǳ꣬ȡ�������ж�Ӧֵ��
 */
public class RandomName {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\a.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> al = new ArrayList<String>();
		
		String line = null;
		while((line=br.readLine())!=null){
			al.add(line);
		}
		br.close();
		
		getRandom(al);
	}

	private static void getRandom(ArrayList<String> al) {
//		Random r = new Random();
//		int index = r.nextInt(al.size());
		int index = (int)(Math.random()*al.size());
		String name = al.get(index);
		System.out.println(name);
	}
}
