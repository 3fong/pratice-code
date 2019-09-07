package digui;

/*
 *有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？
 *分析：
 *	规律： 1	1	2	3	5	8
 *		从第三月开始，数为前两个月的和
 *实现：
 *	数组
 *	变量的变化实现
 *	递归
 *
 * 假如相邻的两个月的兔子对数是a,b
 * 第一个相邻的数据：a=1,b=1
 * 第二个相邻的数据：a=1,b=2
 * 第三个相邻的数据：a=2,b=3
 * 第四个相邻的数据：a=3,b=5
 * 看到了：下一次的a是以前的b，下一次是以前的a+b		
 */
public class RabbitDemo {

	public static void main(String[] args) {
		int num = show();
		System.out.println(num);		
		
		int num2 = show1();
		System.out.println(num2);
		
		int num3 = show2(20);
		System.out.println(num3);
	}
	// 数组
	public static int show() {
		int[] arr = new int[20];
		for (int x = 0; x < 20; x++) {
			if (x < 2) {
				arr[x] = 1;
			} else {
				arr[x] = arr[x - 1] + arr[x - 2];
			}
		}
		return arr[arr.length - 1];
	}
	// 变量
	public static int show1() {
		int a = 1;
		int b = 1;	
		for(int x=0;x<18;x++){
			int temp = a;
			a=b;
			b=temp+b;	
		}
		return b;
	}
	/*
	 * 递归
	 * 	返回值：int
	 * 	参数列表：int n
	 * 	出口条件：if(n<3) return n=1;
	 * 	规律：if(n>=3) return (n-1)+(n-2)
	 */
	public static int show2(int n){
		if(n<3){
			return n=1;
		}else{
			return show2(n-1)+show2(n-2);
		}
	}
}
