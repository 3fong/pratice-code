package com.itheima;

import java.lang.reflect.Field;

/**
3�� дһ���������˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue.   

public void setProperty(Object obj, String propertyName, Object value){   
}
˼·��
1��Ҫ�޸���������еĳ�Ա������ֵ���뵽�ֶεķ���
2������set�������и�ֵ
*/
class Demo{
	Object name;
}
public class Test3
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		Object o = new Object();
		//��ӡδ��ֵ�Ķ���ֵ
		System.out.println(d.name);
		setProperty(d,"name",o);
		
		//��ӡ��ֵ�����ֵ
		System.out.println(d.name);
		System.out.println(o);
	}
	public static void setProperty(Object obj, String propertyName, Object value) {
	    try {
	    	//ͨ�������ȡ����ĳ�Ա����
	        Field fd=obj.getClass().getDeclaredField(propertyName);
	        //���и�ֵ
	        fd.set(obj, value);
	        
	      //�����쳣����
	    } catch (SecurityException e) {
	    	throw new SecurityException("����ϵ����Ա");
	    } catch (NoSuchFieldException e) {
	    	System.out.println("�޴��ֶΣ�"+e.toString());
	    } catch (IllegalArgumentException e) {
	    	throw new IllegalArgumentException("�Ƿ�����");
	    } catch (IllegalAccessException e) {
	    	System.out.println("��Ȩ���ʣ�"+e.toString());
	    } catch(Exception e){
	    	System.out.println("��ֵʧ��");
	    }
	}
}
