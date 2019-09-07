package com.itheima;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
5��������IP����һ��txt�ļ�����д�������ЩIP����ֵ��С����С�������򲢴�ӡ������
61.54.231.245
61.54.231.9
61.54.231.246
61.54.231.48
61.53.231.249
˼·��
1����ȡ�ı��ļ�����FileReader�������뻺�������Ч�ʣ�
2����Ϊ�漰���򣬿���ʹ��Set���ϣ��Զ���Ƚ�����
3��ʵ��Comparator�ӿڣ�����compare������
*/
//�Զ���Ƚ���
class MyComparator implements Comparator<String> {
    
	@Override
    public int compare(String o1, String o2) {
		String[] strAr1 = o1.split("\\.");
		String[] strAr2 = o2.split("\\.");

		//��ѡ������ʽ�Ƚ��ĸ�������Ip��С
		for (int i = 0; i < strAr1.length; i++) {
        	//�������,����һ������;
            if (strAr1[i].equals(strAr2[i])) {
            	continue;
            }
            //�����,�����ȷ��˳��
            Integer i1 = new Integer(strAr1[i]);
            Integer i2 = new Integer(strAr2[i]);
            return i1.compareTo(i2);
		}
		//IP��ȫ��ͬ,�򲻼���;���Ըı�0,�Ϳ��Լ���;
		return 0;
    }
}
public class Test5 {
    public static void main(String[] args) throws Exception {
    	BufferedReader bufReader = 
    			new BufferedReader(new FileReader(new File("IP.txt")));
        //����Set����, �����ض�Comparator
    	Set<String> set = new TreeSet<String>(new MyComparator());

    	//��ȡIP.txt�ļ�;
    	String ipStr = null;
    	while ((ipStr = bufReader.readLine()) != null) {
        	set.add(ipStr.trim());
    	}
    	bufReader.close();

    	//ֱ�Ӵ�ӡ;
    	for (String str : set) {
    		System.out.println(str);
    	}
    }
}