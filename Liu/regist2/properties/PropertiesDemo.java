package properties;

import java.util.Properties;
import java.util.Set;

/*
 *Properties:���Լ����ࡣ��һ�����Ժ�IO������ʹ�õļ����ࡣ
 * Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ���
 * ���⹦�ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key):��ȡԪ��
 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		// ���������÷��Ǵ���ģ�һ��Ҫ��API�����û��<>����˵�����಻��һ��������,��ʹ�õ�ʱ��Ͳ��ܼӷ���
//		Properties<String,String> p = new Properties<String,String>();
		
		Properties p = new Properties();
		
		p.put("006","�й�");
		p.put("007","�ձ�");
		p.put("008","����");
		p.setProperty("009","������");
		p.setProperty("010","�Ĵ�����");
		
//		String s = p.getProperty("008");
//		System.out.println(s);
		//��������ȡ���еļ�
		Set<String> spn = p.stringPropertyNames();
		for(String s : spn){
			//���ݼ���ȡֵ
			String value = p.getProperty(s);
			System.out.println(s+":"+value);
		}
	}

}
