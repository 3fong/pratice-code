package string;
/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		��int�������ַ��������Ӧ������ת���ַ���
 */
public class OutputString {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		//����һ��
		System.out.print("[");
		for(int x=0;x<arr.length;x++){			
			if(x<arr.length-1){
				System.out.print(arr[x]+",");
			}
			else
				System.out.println(arr[x]+"]");
		}
		//��������
		String s = "";
		s+="[";
		for(int x=0;x<arr.length;x++){			
			if(x<arr.length-1){
				s+=arr[x]+",";
			}
			else
				s+=arr[x]+"]";
		}
		System.out.println(s);
	}

}
