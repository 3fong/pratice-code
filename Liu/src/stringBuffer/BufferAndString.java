package stringBuffer;
/*
 * StringBuffer��String��ת��
 * Buffer-->String
 * 		toString()��String�Ĺ��췽��;
 * String-->Buffer
 * 		StringBuffer�Ĺ��췽����append();
 */
public class BufferAndString {

	public static void main(String[] args) {
		//Buffer-->String
		//����һ��
		StringBuffer sb = new StringBuffer();
		String s = sb.toString();
		sop("s:"+s);
		//��������
		String s2 = new String(sb);
		sop("s2:"+s2);
		
		//String-->Buffer
		//����һ��
		String str = new String();
		StringBuffer sbu = new StringBuffer(str);
		sop("sbu:"+sbu);
		
		//��������
		sbu.append(str);
		sop("sbu"+sbu);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
