package stringBuffer;
/*
 * A:StringBuffer():�޲ι��췽��
	B:StringBuffer(int size)��ָ���������ַ�������������
	C:StringBuffer(String str)��ָ���ַ���Ϊ���ݵ��ַ�������������
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sop("sb:"+sb);
		sop("sb.capacity():"+sb.capacity());
		sop("sb.length:"+sb.length());
		sop("------------------------");
		
		StringBuffer sb1 = new StringBuffer(10);
		sop("sb1:"+sb1);
		sop("sb1.capacity():"+sb1.capacity());
		sop("sb1.length:"+sb1.length());
		sop("------------------------");
		
		StringBuffer sb2 = new StringBuffer("hello");
		sop("sb2:"+sb);
		sop("sb2.capacity():"+sb2.capacity());
		sop("sb2.length:"+sb2.length());
		sop("------------------------");
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
