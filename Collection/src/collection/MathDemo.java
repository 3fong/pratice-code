package collection;

import java.text.DecimalFormat;
import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {

		Random r = new Random();
		for(int x=0;x<10;x++){
			double a = r.nextDouble()*10+1;
			System.out.print(a+" ");
		}
		System.out.println();
		for(int x=0;x<10;x++){
			int a = (int)(Math.random()*10+1);
			System.out.print(a+" ");
		}
		System.out.println();
		for(int x=0;x<10;x++){
			double d = Math.random()*5+1;
			DecimalFormat df = new DecimalFormat("#.00");
			String d1 = df.format(d);
			System.out.println(d1);
		}
	}
	

}
