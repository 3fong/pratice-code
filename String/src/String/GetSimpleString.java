package String;

//获取两个字符串中最大相同字符串
public class GetSimpleString {

	public static void main(String[] args) {
		String s1 = "  hfalfagirljflsj ";
		String s2 = "  agirlsd ";
		String g = getString(s1,s2);
		System.out.println(g);
	}
	public static String getString(String s1,String s2){
		String max,min;
		max=(s1.length()>s2.length())?s1:s2;
		min=(max==s1)?s2:s1;
		
		for(int x=0;x<min.length();x++){
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++){
				String temp=min.substring(y, z);
				if(max.contains(temp))
					return temp;
			}
		}
		return "";
	}
}
