package base;
/*
 * Java中的参数传递问题：
		基本类型：形式参数的改变对实际参数没有影响。
		引用类型：形式参数的改变直接影响实际参数。
 */
public class ThinkingDemo1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		sop("a:"+a+",b:"+b);
		changeNum(a,b);
		sop("a:"+a+",b:"+b);
		
		int[] arr = {10,20};
		sop("arr[0]:"+arr[0]);
		changeIndex(arr);
		sop("gai arr[0]:"+arr[0]);
	}
	public static int changeNum(int a,int b){
		a=b;
		b=a+b;
		sop("改变后数值 a:"+a+",b:"+b);
		return a&b;
	}
	public static void changeIndex(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(arr[x]%2==0){
				arr[x]*=2;
			}
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
