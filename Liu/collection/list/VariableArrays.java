package list;
/*
 *可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){}
 */
public class VariableArrays {

	public static void main(String[] args) {
		int a = 1;
		int b=34;
		int c=29;
		int result = sum(a+b+c);
		System.out.println(result);
		
		int result1 = sum(a+b);
		System.out.println(result1);
	}
	public static int sum(int...arr){
		int s = 0;
		for(int x : arr){
			s+=x;
		}
		return s;
	}
}
