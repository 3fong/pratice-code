package io.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *�������飬���ֵ��ͷ�Ǳ꣬��Сֵ��β�Ǳ꣬�������
 */
public class InOutArray {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line=br.readLine())!=null){			
			if(line.equals("over"))
				break;
			String[] sts = line.split(",");
			int[] arr = {Integer.parseInt(sts[0]),Integer.parseInt(sts[1]),Integer.parseInt(sts[2]),
					Integer.parseInt(sts[3]),Integer.parseInt(sts[4])};
			swapMax(arr);
			swapMin(arr);
			printArray(arr);
			
		}
		br.close();
	}
	//ע��Ҫʹ��ѡ�������ð�����򣬷���ֻ�ܱȽ�ǰ�����Ǳ�ֵ
	private static void swapMax(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[0]<arr[y]){
					int temp = arr[0];
					arr[0]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}
	private static void swapMin(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length-1;y++){
				if(arr[arr.length-1]>arr[y]){
					int temp = arr[arr.length-1];
					arr[arr.length-1]=arr[y];
					arr[y]=temp;
				}
			}
		}	
	}
	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1){
				System.out.print(arr[x]+",");
			}else{
				System.out.println(arr[x]+"]");
			}
		}
	}
}
