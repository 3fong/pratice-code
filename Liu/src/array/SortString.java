package array;
/*
 * ���ַ����е��ַ���������
 * 		������"dacgebf"
 * 		�����"abcdefg"
 * String -- char[]
		toCharArray()	
 * char[]ת�� String�����ַ�����
		valueOf(char[])��String(char[])���췽����
 */
public class SortString {

	public static void main(String[] args) {
		String s = "dacgebf";
		System.out.println("����ǰ"+s);
		String result = bubbleSort(s);
		System.out.println("�����"+result);
	}
	public static String bubbleSort(String s){
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length-1;x++){
			for(int y=0;y<chs.length-1-x;y++){
				if(chs[y]>chs[y+1]){
					char temp = chs[y];
					chs[y]=chs[y+1];
					chs[y+1]=temp;
				}
			}
		}
//		return String.valueOf(chs);
		return new String(chs);
		
		//����ת���ַ��������ǽ�����ַ�����ĵ�ֵַ[C@15db9742
		//return chs+"";
	}
}
