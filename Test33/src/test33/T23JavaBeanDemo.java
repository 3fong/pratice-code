package test33;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/*
 *����һ��javabean,����string��Boolean��double��integer
 * ��Ĭ�ϳ�ֵΪwww.itheima.com��true��0.01D��100
	1.javaBean��һ��Э����,Ҳ���Ǹ���ӵ��һЩ����,��Ҫ���ڶ�Ŀ��������ֶεĲ���
		,����,����Ҫ����javaBean�Լ��ṩ��һ����׼,���ſ���ʶ��;
 * 	2.javaBean�ͷ�����ʲô������?
 * javaBean�ǰ������ȷ�װ���Լ���,Ȼ����ͨ���Լ��ķ���,����Щ��Ϣ�ṩ����.�����
 * 	��,�����кܺõ��ձ���.��������Ի�ȡ���κ���Ϣ,Ҳ�����������.
 */
class Bean{
	private String str;
	private boolean b;
	private double d;
	private Integer i;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
}
public class T23JavaBeanDemo {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("test33.Bean");
		Object bean = clazz.newInstance();
		//��ȡ���󣬷�װ��Ϣ
		BeanInfo bi = Introspector.getBeanInfo(clazz);
		//����Ϣ��������
		PropertyDescriptor[] ppd = bi.getPropertyDescriptors();
		//������ȡ��Ϣ
		for(PropertyDescriptor pd : ppd){
			Object name = pd.getName();
			Object type = pd.getPropertyType();
			Method set = pd.getWriteMethod();
			Method get = pd.getReadMethod();
			
			if(!name.equals(".class")){
				if(set!=null){
					if(type==String.class)
						set.invoke(bean,"www.itheima.com");
					if(type == boolean.class || type==Boolean.class)
						set.invoke(bean,true);
					if(type==double.class || type==Double.class)
						set.invoke(bean,0.01D);
					if(type==int.class || type==Integer.class)
						set.invoke(bean,100);
				}
				if(get!=null){
					System.out.println(type+" "+name+"="+get.invoke(bean,null));
				}
			}
		}
	}

}
