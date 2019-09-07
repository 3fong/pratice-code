package string;
/*
 *1 ģ��һ��trim������ȥ���ַ������˵Ŀո�
 *������
 *	ȥ���ո�ʵ���ǻ�ȡ�µ��ַ������õ�substring
 *	�жϿո��õ�charAt()
 *2 ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��
 */
public class MyTrimDemo {

	public static void main(String[] args) {
		String s = "   ahak af    ";
		sop("-"+s+"-");
		String str = myTrim(s);
		sop("-"+str+"-");
		
		String str1 = myReverse(s,3,7);
		sop("-"+str1+"-");
	}
	//��ת�ַ���
	private static String myReverse(String s,int start,int end) {
		//����һ��ֻ��ȫ��ת���޷�ֻ��ת����
//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
//		return sb.toString();
		
		//��������
		char[] chs = s.toCharArray();
		for(int x=start,y=end-1;x<=y;x++,y--){
			char temp = chs[x];
			chs[x]=chs[y];
			chs[y]=temp;
		}
		return new String(chs);//String.valueOf(chs);
	}
	//ģ��һ��trim������ȥ���ַ������˵Ŀո�
	private static String myTrim(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start<=end){
			while(s.charAt(start)==' '){
				start++;
			}
			while(s.charAt(end)==' '){
				end--;
			}
			//��ͷ����β
			return s.substring(start,end+1);
		}
		return null;
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
