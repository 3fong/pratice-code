package com.itheima;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
8�� �Զ����ַ��������İ�װ�࣬ͨ�������װ��Եײ��ַ����������а�װ���ó���ͨ�������װ��
��ȡĳ���ı��ļ������磬һ��javaԴ�ļ���ʱ���ܹ��ڶ�ȡ��ÿ��ǰ�涼�������кź�ð�š�
*/
//�Զ����ַ��������İ�װ��  
class MyLineNumberReader  
{  
	private Reader r;  
	private int count;    
	MyLineNumberReader(Reader r)  
	{  
		this.r = r;  
	}  
	//��ȡһ��      
	public String myReadLine() throws IOException  
	{  
		StringBuffer sb = new StringBuffer();  
	        
		int num = 0;  
		count++;  
      
	//���ļ���Ϊ��ʱ�����ж�ȡ
	while ((num = r.read()) != -1)  
	{  
		if (num == '\r')  
			continue;  
		if (num == '\n')  
			return sb.toString();  
		else  
			sb.append((char)num);  
	}
	//��ֹ�����ݣ�����û�л��б�ǵ�����δ��¼��
	if (sb.length() != 0)  
		return sb.toString();  
	return null;  
	}             
	public int getCount() {  
		return count;  
	}   
	public void setCount(int count) {  
		this.count = count;  
	}
	public void myclose() throws IOException  
	{  
		r.close();  
	}	
}
public class Test8   
{  
    public static void main(String[] args)  
    {  
        MyLineNumberReader mlnr = null;        
        try  
        {  
			//ͨ����װ���ȡ����ļ�
            mlnr = new MyLineNumberReader(new FileReader("C:\\Users\\David\\Desktop\\Test6.java"));  
              
            String len = null;  
            
			//����ȡ��ÿ�м����кź�ð��
            while ((len = mlnr.myReadLine()) != null)  
            {  
                System.out.println(mlnr.getCount()+":\t"+len);  
            }  
        }  
        catch (IOException e)  
        {  
            System.out.println("��ȡ����");  
        } 
		//�ر���Դ
        finally  
        {  
            try  
            {  
                if(mlnr != null)  
                    mlnr.myclose();  
            }  
            catch (IOException e)  
            {  
                System.out.println("�رճ���");  
            }  
        }  
    }  
}  