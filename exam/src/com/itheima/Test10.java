package com.itheima;

/*
 * 10�� 28������ֺȣ�3������ƿ�ǿ��Ի�һƿ���֣���ôҪ�����ƿ���֣���28�˺ȣ�������50�ˣ�
 * ����Ҫ�����ƿ���֣�����д������˼·��
 * 
 * ˼·��
 * 1�������ϵ��1�������ܻ�1��ƿ�ǣ�3��ƿ���ܻ�1ƿ���֣��һ���1�������ֻ�1��ƿ�ǣ�
 * 2�����������С���������͵���1ƿ���֣�ֱ�����������ڵ�������Ϊֹ��
 * 3��ֱ��������+�һ������ڵ�������ʱ����ȡ�蹺���������
 */

public class Test10 {
	
	public static void main(String[] args) {
        System.out.println(buyCoke(28));  
        System.out.println(buyCoke(50));                            
    }
	
	//���巽������ȡ��Ҫ����Ŀ�����
    public static int buyCoke(int num){  
        int coke = 0;  
        int cap = 0;  
        int buy = 0; 
        
        //��������С������ʱ����������
        while (coke < num){  
            buy++;  
            coke++;  
            cap++;  
            
            //���жһ�
            if (cap == 3){  
                coke++;  
                cap = 1;  
            }  
        }  
        return buy;  
    }  
}
