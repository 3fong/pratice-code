package base;
/*
 *��100���������͡���100���߼��䱶�����ĸ���
 */
public class ForDemo {

	public static void main(String[] args) {
		getSum();
		getNum();
	}
	public static void getSum(){
		int sum = 0;
		for(int x=0;x<=100;x++){
			sum+=x;
		}
		System.out.println(sum);
	}
	public static void getNum(){
		int num = 0;
		for(int x=0;x<=100;x++){
			if(x%7==0)
				num++;
		}
		System.out.println(num);
	}
}
