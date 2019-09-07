package io.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 *����¼������ݣ���0����Ҫ���ڿ���̨�����������е����ֵ
 *������
 *		����¼�룬��Ϊ����̶�������ʹ�ü���
 *		��ȡ���ֵ��������ȡβ�Ǳ����
 */
public class GetMaxValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(true){
			int num = s.nextInt();
			if(num==0){
				break;
			}else{
				al.add(num);
			}
		}
		//���ϵ�����
//		Collections.sort(al);
		Integer[] arr = al.toArray(new Integer[al.size()]);
		//���������
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
