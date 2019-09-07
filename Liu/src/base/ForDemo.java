package base;
//for和while循环语句事例
public class ForDemo {

	public static void main(String[] args) {
//		getSum();
//		getEven();
//		getOdd();
//		getDaffodilNum();
//		getMultiTable();
		getCount();
		getSum();
	}
	//求和
	public static void getSum(){
		int sum=0;
		for(int x=0;x<=10;x++){
			sum+=x;
		}
		sop("1~10的和为："+sum);
	}
	//求1~10偶数和
	public static void getEven(){
		int sum=0;
		for(int x=0;x<=10;x++){
			if(x%2==0){
				sum+=x;
			}
		}
		sop("1~10偶数和为："+sum);
	}
	//求1~10奇数和
	public static void getOdd(){
		int sum=0;
		for(int x=1;x<=10;x+=2){
			sum+=x;
		}
		sop("1~10奇数和为："+sum);
	}
	//打印水仙花数。水仙花数：个位、十位和百位数的三次方和为原数的数。
	public static void getDaffodilNum(){
		int count=0;
		for(int x=100;x<1000;x++){
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/100%10;
			while(ge*ge*ge+shi*shi*shi+bai*bai*bai==x){
				count++;
				sop("水仙花数有："+x);
				break;
			}
		}
		sop("打印水仙花数有"+count+"个");
	}
	//九九乘法表
	public static void getMultiTable(){
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++ ){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}		
	}
	//折纸到珠穆朗玛峰高度算次数。纸厚0.01m。
	public static void getCount(){
		int count=0;
		int hou=1;
		int high=884800;
		while(hou<=high){
			count++;
			hou*=2;
			sop("第"+count+"折叠，厚度为"+hou+"厘米");
		}
		sop("达到珠穆朗玛峰高度需折"+count+"次");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
