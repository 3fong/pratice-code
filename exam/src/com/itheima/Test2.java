package com.itheima;

/**
2���������н����˵��ԭ��(û�з���������÷�)

        import java.util.ArrayList;
 
        class Data {
            int val;
        }
 
        public class Test {
                  public static void main(String args[]) {
                           Data data = new Data();
                           ArrayList list = new ArrayList();
 
                   for (int i = 100; i < 103; i++) {
                           data.val = i;
                           list.add(data);
                   }
 
                    for (Data d : list) {
                          System.out.println(d.val);
                   }
             }
      }
*/

import java.util.ArrayList;

class Data {
    int val;
}

public class Test2 {
	public static void main(String args[]) {
		Data data = new Data();
		ArrayList<Data> list = new ArrayList<Data>();

		for (int i = 100; i < 103; i++) {
			data.val = i;
			list.add(data);
		}

		for (Data d : list) {
			System.out.println(d.val);
		}
     }
}
/*
 * ���������
 * 1��ֱ�����н����
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from element type Object to Data

	at com.itheima.Test2.main(Test2.java:45)
	���Ͳ�ƥ�䣺Object�޷�ת��ΪData���������ڼ���δ����Data�������ͣ����ڼ����϶��巺�ͺ���������
	2���ٴ����н���ǣ�
	102
	102
	102
	������Ϊ��forѭ�����洴����һ������������list����ʼ��ֻ�����һ������forѭ���ı��valֵ
	ʼ�ն���ͬһ������ģ���������Ķ��������һ�θı��valֵΪ׼�������ɶ�����forѭ�����洴����
	���ͻ�õ�3�������3����ͬ��valֵ
 */