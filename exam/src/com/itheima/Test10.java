package com.itheima;

/*
 * 10、 28人买可乐喝，3个可乐瓶盖可以换一瓶可乐，那么要买多少瓶可乐，够28人喝？假如是50人，
 * 又需要买多少瓶可乐？（需写出分析思路）
 * 
 * 思路：
 * 1、运算关系：1个可乐能获1个瓶盖；3个瓶盖能获1瓶可乐；兑换的1个可乐又获1个瓶盖；
 * 2、如果可乐数小于人数，就得买1瓶可乐，直到可乐数大于等于人数为止；
 * 3、直到购买数+兑换数大于等于人数时，获取需购买可乐数。
 */

public class Test10 {
	
	public static void main(String[] args) {
        System.out.println(buyCoke(28));  
        System.out.println(buyCoke(50));                            
    }
	
	//定义方法，获取需要购买的可乐数
    public static int buyCoke(int num){  
        int coke = 0;  
        int cap = 0;  
        int buy = 0; 
        
        //当可乐数小于人数时，运行买动作
        while (coke < num){  
            buy++;  
            coke++;  
            cap++;  
            
            //进行兑换
            if (cap == 3){  
                coke++;  
                cap = 1;  
            }  
        }  
        return buy;  
    }  
}
