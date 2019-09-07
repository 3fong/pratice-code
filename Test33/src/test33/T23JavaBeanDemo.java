package test33;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/*
 *存在一个javabean,设置string，Boolean，double，integer
 * 的默认初值为www.itheima.com，true，0.01D，100
	1.javaBean是一个协议类,也就是该类拥有一些功能,主要用于对目标类进行字段的操作
		,但是,必须要按照javaBean自己提供的一个标准,它才可以识别;
 * 	2.javaBean和反射有什么区别呢?
 * javaBean是把数据先封装到自己中,然后再通过自己的方法,将这些信息提供出来.针对字
 * 	段,并具有很好的普遍性.而反射可以获取到任何信息,也更具有针对性.
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
		//获取对象，封装信息
		BeanInfo bi = Introspector.getBeanInfo(clazz);
		//将信息存入数组
		PropertyDescriptor[] ppd = bi.getPropertyDescriptors();
		//遍历获取信息
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
