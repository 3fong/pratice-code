package base;

public class StoreXiaoHua {

	public static void main(String[] args) {		
//		xiaoHua();
		zheZhi();
	}
	//折纸到珠穆朗玛峰高度算次数。纸厚0.01m。
	private static void zheZhi() {
		int count =0;
		int hou=1;
		int tall=884800;
		while(hou<=tall){
			count++;
			hou*=2;
			System.out.println("第"+count+"次折叠，厚度为："+hou+"厘米");
		}
		System.out.println("达到喜马拉雅高度，需："+count+"次");
	}
	//小花存钱：每天存2.5元，每五天花6块，问多少天能存到100
	private static void xiaoHua() {
		double sum=0;
		int x=0;
		while(true){
			sum+=2.5;
			x++;
			if(x%5==0){
				sum-=6;
				System.out.println("第"+x+"天，花了6块，还剩"+sum+"元");
			}
			if(sum>=100){
				System.out.println("第"+x+"天，存到了100");
				break;
			}
		}
	}

}
