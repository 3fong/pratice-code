package digui;
/*
 *递归：方法定义中调用方法本身的现象
 * 
 * 方法的嵌套调用，这不是递归。
 * Math.max(Math.max(a,b),c);
 * 
 * public void show(int n) {
 * 		if(n <= 0) {
 * 			System.exit(0);
 * 		}
 * 		System.out.println(n);
 * 		show(--n);
 * }
 * 注意事项：
 * 		A:递归一定要有出口，否则就是死递归
 * 		B:递归的次数不能太多，否则就内存溢出
 * 		C:构造方法不能递归使用
 * 
 * 需求：实现5的阶乘
 * 		5！=1*2*3*4*5
 * 		5！=5*4！
 * 实现有两种方法：	
 * 		循环实现
 * 		递归
 * 			写一个方法
 * 			出口条件
 * 			规律
 */
public class DiGuiDemo {

	public static void main(String[] args) {		
//		show();
		
		int num = show2(5);
		System.out.println(num);
	}
	//循环
	public static void show(){
		int a=1;
		for(int x=1;x<=5;x++){
			a*=x;
		}
		System.out.println(a);		
	}
	/*
	 * 递归
	 * 	返回值类型：int
	 * 	参数列表：int num
	 * 	出口条件：if(num==1) return num=1;
	 * 	规律： 	if(num!=1) return num*方法名(num-1);
	 */
	public static int show2(int num){
		if(num==1)
			return num=1;
		else
			return num*show2(num-1);
	}
}
