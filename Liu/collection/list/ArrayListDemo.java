package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 *����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
 *������
 *		���ڳ��Ȳ��̶���ʹ�ü���
 *		��ȡ���ֵ�ɽ�����ת�����飬������ȡβ�Ǳ��ȡ
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		while(true){
			System.out.println("���������ݣ�");
			
			int num = s.nextInt();
			if(num!=0){
				al.add(num);
			}else{
				break;
			}			
		}
		Object[] obj = al.toArray();
		Arrays.sort(obj);
		System.out.println(obj[obj.length-1]);
		
		//<T> T[] toArray(T[] a) �ɽ�����תΪ�������͵�����
//		Integer[] i = al.toArray(new Integer[al.size()]);
		
	}

}
