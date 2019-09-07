package com.itheima;

/**
2、分析运行结果，说明原理。(没有分析结果不得分)

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
 * 结果分析：
 * 1、直接运行结果：
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from element type Object to Data

	at com.itheima.Test2.main(Test2.java:45)
	类型不匹配：Object无法转换为Data。这是由于集合未接受Data数据类型，当在集合上定义泛型后，问题解决。
	2、再次运行结果是：
	102
	102
	102
	这是因为在for循环外面创建了一个对象，所以在list里面始终只添加了一个对象，for循环改变的val值
	始终都是同一个对象的，所以输出的都是以最后一次改变的val值为准，如果你吧对象在for循环里面创建出
	来就会得到3个对象和3个不同的val值
 */