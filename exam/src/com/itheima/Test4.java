package com.itheima;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 4�� ArrayList list = new ArrayList(); ���������ΪInteger��ArrayList�д��һ��String���͵Ķ���
 * ������
 * 1��������һ�����Ͱ�ȫ���ƣ�������Ʋο���������ص㣬Ҳ���Ƕ�������һ��ȷ�����������յĶ�������Ҳ�����̶���
 * ����List�ķ���Ϊ<Integer>�Ļ���List�����б����Integer���͵Ķ�������Java�Ϳ��Է��ĵİѶ���Integerʹ�á�
 * 2������Ҫ��Integer�д�String���͵Ķ��������Ȼ�Ƿ��Ͳ�����ģ���ͨ���������ֱ�ӻ��add�������ֽ��룬
 * ���������������ʱֱ����ӣ��൱����ƭ�˱���㡣
 */

public class Test4
{
	public static void main(String[] args)
	{
		//����һ������Integer�����ArrayList����
		ArrayList<Integer> list = new ArrayList<Integer>();
        String str = "heima";
        
        //��ȡlist�࣬���������й�����Ա����������
        Method[] method = list.getClass().getMethods();
        try {
        		//��String���Ͷ������ArrayList������
                method[0].invoke(list, str);
        } catch (Exception e) {
                e.printStackTrace();
        }
        //��ȡ�����ж���
        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }		
	}
}