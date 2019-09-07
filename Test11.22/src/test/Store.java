package test;

public class Store {

	public static void main(String[] args) {
		double sum=0;
		int x=0;				
		while(true){
			sum+=2.5;
			x++;
			if(x%5==0)
				sum=sum-6;	
			if(sum>=100){
				System.out.println(x);
				break;
			}
		}		
	}	
}
