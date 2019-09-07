package collection.tools;

import java.util.Properties;

/*
 *System��:ϵͳ��,�ṩ��һЩ���õ��ֶκͷ��� 
	out:��׼�����Ĭ���ǿ���̨��in:��׼���룬Ĭ���Ǽ��̡�
	������ 
	void exit(int status):��ֹ��ǰ�������е� Java ������������״̬�룻��ݹ���� 0 ��״̬���ʾ�쳣��ֹ��
	long currentTimeMillis():��ȡ��ǰʱ��ĺ���ֵ�����ã��������ִ��ʱ�䡣
	void arraycopy(Object src,int srcPos,Object dest,int destPos,
	int length)��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý���	
	Properties getProperties()����ȡϵͳ������Ϣ��Properties�����д洢�Ķ���String���͵ļ��ֵ��
	���ʹ�����Լ��Ĵ洢��ȡ���ķ��������Ԫ�صĲ�����
	Windowsϵͳ�л���Ϊ\r\n����ת���ַ�Linuxֻ��һ��\n��
 */
public class RuntimeDemo {
	public static void main(String[] args) {
		//Properties��Hashtable�����࣬��ȡ����洢ʱ��ֵ�ԡ�
		Properties p = System.getProperties();
		//��������
		System.setProperty("myKey","myValue");
		String value = System.getProperty("myKey");
		sop(value);
		sop("ת���ַ�"+"hello-\r\n world");
		final String LINE_SEPARATOR=System.getProperty("line.separator");
		sop("ת���ַ�"+"hello"+LINE_SEPARATOR+"world");
		
		//��ȡ��ǰʱ�����ֵ
		long l = System.currentTimeMillis();
		sop(l);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
