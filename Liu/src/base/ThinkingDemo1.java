package base;
/*
 * Java�еĲ����������⣺
		�������ͣ���ʽ�����ĸı��ʵ�ʲ���û��Ӱ�졣
		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ�����
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
		sop("�ı����ֵ a:"+a+",b:"+b);
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
