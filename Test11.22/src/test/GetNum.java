package test;

import java.util.TreeMap;

public class GetNum {

	public static void main(String[] args) {
		String str = "ldkafskgha";
		System.out.println(getNum(str));
	}
	public static String getNum(String str){
		char[] chs = str.toCharArray();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		int count=0;
		for(int x=0;x<chs.length;x++){
			if(!(chs[x]>='a'&&chs[x]<='z'||chs[x]>='A'&&chs[x]<='Z'))
				continue;

			Integer value = tm.get(chs[x]);
			if(value!=null)				
				count=value;
			count++;
			tm.put(chs[x],count);
			count=0;
		}
		StringBuilder sb = new StringBuilder();
		
		for(Character c : tm.keySet()){
			sb.append(c+"("+tm.get(c)+")");
		}
		return sb.toString();
	}
}
