package com.itheima;

import java.lang.reflect.Method;

/*
6�� ��дһ���࣬����һ��ʵ���������ڴ�ӡһ���ַ�������ʹ�÷����ֶδ�������Ķ��� �����øö����еķ�����
*/
class PrintString{
	public void sop(String str){
			System.out.println(str);
	}
}
public class Test6
{
	public static void main(String[] args){
		
		try{
			//������
			Class<?> clazz = Class.forName("com.itheima.PrintString");
			
			//��ȡ��������
			Method me = clazz.getMethod("sop",String.class);
			//���ø÷���
			me.invoke(clazz.newInstance(),"bless u");
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
}