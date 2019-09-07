package string.regex;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 *
 */
public class SortIPDemo {

	public static void main(String[] args) {
		sortAddress();
	}
	//��IP��ַ���е�ַ��˳�������
	private static void sortAddress() {
		String ip = "192.68.1.254  8.109.23.13 8.10.10.10 2.2.2.2  8.109.90.30";
		ip=ip.replaceAll("(\\d+)","00$1");
		System.out.println("-"+ip+"-");
		
		ip=ip.replaceAll("0*(\\d{3})","$1");
		System.out.println("-"+ip+"-");
		
		String[] sts = ip.split(" +");
		//����һ��
		Arrays.sort(sts);
		for(String s : sts){
			System.out.println("-"+s+"-");
		}
		//��������
		Set<String> set = new TreeSet<String>();
		for(String s : sts){
			set.add(s);			
		}
		for(String s : set){
			System.out.println("-"+s+"-");
		}
	}
}
