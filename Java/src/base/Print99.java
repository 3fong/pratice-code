package base;
/*
 *打印99乘法表和矩形
 */
public class Print99 {

	public static void main(String[] args) {
//		printTable(5);
//		draw(5,4);
//		printDafodil();
		printTable2();
	}
	//99乘法表
	public static void printTable(int num){
		for(int x=1;x<=num;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	//打印矩形
	public static void draw(int row,int col){
		for(int x=0;x<row;x++){
			for(int y=0;y<col;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//打印水仙花数
	public static void printDafodil(){
		int ge = 0;
		int shi = 0;
		int bai = 0;
		int count = 0;
		for(int x=100;x<1000;x++){
			ge = x%10;
			shi = x/10%10;
			bai = x/100%10;
			if(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==x){
				count++;
				System.out.println(x+":"+count);
			}			
		}		
	}
	/*
	 *  ----*
	 *	---* *
	 *	--* * *
	 *	-* * * *
	 *	* * * * *
	 */
	public static void printTable2(){
		for(int x=1;x<=5;x++){
			for(int y=x;y<5;y++){
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
