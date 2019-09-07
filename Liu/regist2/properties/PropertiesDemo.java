package properties;

import java.util.Properties;
import java.util.Set;

/*
 *Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
 * Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串
 * 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		// 下面这种用法是错误的，一定要看API，如果没有<>，就说明该类不是一个泛型类,在使用的时候就不能加泛型
//		Properties<String,String> p = new Properties<String,String>();
		
		Properties p = new Properties();
		
		p.put("006","中国");
		p.put("007","日本");
		p.put("008","美国");
		p.setProperty("009","新西兰");
		p.setProperty("010","澳大利亚");
		
//		String s = p.getProperty("008");
//		System.out.println(s);
		//遍历，获取所有的键
		Set<String> spn = p.stringPropertyNames();
		for(String s : spn){
			//根据键获取值
			String value = p.getProperty(s);
			System.out.println(s+":"+value);
		}
	}

}
