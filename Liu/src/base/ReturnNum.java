package base;
//���󣺻�ȡ����ǰ��ֵ  ʧ��
public class ReturnNum {

	public static void main(String[] args) {
		String str = "609871";
		
		char[] chs = str.toCharArray();
		
		char temp = chs[0];
		chs[0]=chs[chs.length-1];
		chs[chs.length-1]=temp;
		for(int x=0;x<chs.length;x++){
			System.out.print(chs[x]);
		}
	}
	
}
