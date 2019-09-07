package base;
/*
 *获取加密前的值	123456---609871
 */
public class ReturnJiaMi {

	public static void main(String[] args) {
		String s = "609871";
		Integer i = Integer.parseInt(s);
		int num = i.intValue();
		
		int[] arr = new int[8];
		int index=0;
		while(num>0){
			arr[index]=num%10;
			index++;
			num/=10;
		}
		
		int temp = arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=temp;
					
		for(int x=0;x<index;x++){
			if(arr[x]<5)
				arr[x]+=10;
			arr[x]-=5;
			System.out.print(arr[x]);
		}
	}

}
