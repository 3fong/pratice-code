package string;
/*
 *StringBuffer�����ַ��������������ڴ洢���ݵ������� 
�����ص�
1�����ȿɱ仯�� 
2�����Դ洢��ͬ�������ݣ� 
3������Ҫת���ַ�������ʹ�á�
�����ŵ�
StringBuffer�ɶ��ַ����޸ģ�string��һ�������޷��޸ġ�
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer�Ļ�ȡ�������ַ���һ��
		StringBuffer sb = new StringBuffer();
		meAdd(sb);
		meDel(sb);
		meUpdate(sb);
		sop("--"+sb);
	}
	//StringBuffer append(data):��ָ��������Ϊ������ӵ��������ݽ�β����
	//StringBuffer insert(index,data)�����Խ����ݲ��뵽ָ��indexλ�á�
	public static void meAdd(StringBuffer sb){
		StringBuffer sb1 = sb.append(123);	
		sb.append("abc").append(12).append(true);
		sop("sb1:"+sb1+",sb:"+sb);
		
		sb.insert(5,"qq");
		sop(sb);
	}
	public static void meDel(StringBuffer sb){
		//StringBuffer delete(int start,int end):ɾ���������е����ݣ���ͷ����β��
		sb.delete(1,3);
		//StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ���
		sb.deleteCharAt(5);
	}
	public static void meUpdate(StringBuffer sb){
		//StringBuffer replace(int start,int end,String str);
		sb.replace(2,5,"$");
		//void setCharAt(int index,char ch);
		sb.setCharAt(4,'*');
		//StringBuffer reverse();
		sb.reverse();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
