package string;

public class LoopDemo {

	public static void main(String[] args) {
		accuntNum();
	}
	public static void loop(){
		String s = "HelloWorld";
		for(int x=0;x<s.length();x++){
			System.out.println(s.charAt(x));
		}
	}
	/*
	 	����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 	 	������
			"Hello123World"
		������
			1 ���࣬����ȡ�ַ���Ԫ�أ������轫�ַ���ת���ַ����顣
			2 ����
			3 ����ֵ
		��ȷ��
			�����б�void
			����ֵ���ͣ�void
	 */
	public static void accuntNum(){
		String s = "Hello123World";
		
		int upper = 0;
		int lower = 0;
		int num = 0;
		
		char[] chs = s.toCharArray();
		for(int x=0;x<s.length();x++){
			//char ch = s.charAr(x);
			if(chs[x]>='a'&&chs[x]<='z'){
				lower++;
			}
			else if(chs[x]>='A'&&chs[x]<='Z'){
				upper++;
			}
			else if(chs[x]>='0'&&chs[x]<='9'){
				num++;
			}
		}
		System.out.println("��д��ĸ�У�"+upper+"����Сд��ĸ�У�"+lower+"���������У�"+num+"��");
	}
}
