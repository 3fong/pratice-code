package string.regex;
/*
 *��QQ�������У��
	Ҫ��5~15 0���ܿ�ͷ��ֻ��������
 */
public class RegexDemo {

	public static void main(String[] args) {
		String qq = "111111111123451";
		boolean b = checkQQ1(qq);
		System.out.println(b);
		
		boolean b1 = regexQQ(qq);
		System.out.println(b1);
	}
	private static boolean regexQQ(String qq) {
//		String regex="[1-9][0-9]{4,14}";
		String regex="[1-9]\\d{4,14}";
		boolean flag = qq.matches(regex);
		
		return flag;
	}
	private static boolean checkQQ(String qq) {
		if(qq.length()>=5 &&qq.length()<=15){
			if(!qq.startsWith("0")){
				try{
				Long lon = Long.parseLong(qq);
				System.out.println("qq��û������:"+lon);
				return true;
				}catch(NumberFormatException e){
					System.out.println("����������");
				}
			}else{
				System.out.println("����0��ͷ");
			}
		}else{
			System.out.println("����Ҫ��5-15֮��");
		}
		return false;
	}
	private static boolean checkQQ1(String qq){
		if(qq.length()>=5&&qq.length()<=15){
			if(!qq.startsWith("0")){
				char[] chs = qq.toCharArray();
				for(int x=0;x<chs.length;x++){
					if(chs[x]>='0'&&chs[x]<='9'){
						System.out.println("qq��û������:"+qq);
						return true;
					}else{
						System.out.println("����������");
						break;
					}
				}
			}else{
				System.out.println("����0��ͷ");
			}
		}else{
			System.out.println("����Ҫ��5-15֮��");
		}
		return false;
	}
}
