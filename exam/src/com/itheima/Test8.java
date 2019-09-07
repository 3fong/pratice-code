package com.itheima;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
8、 自定义字符输入流的包装类，通过这个包装类对底层字符输入流进行包装，让程序通过这个包装类
读取某个文本文件（例如，一个java源文件）时，能够在读取的每行前面都加上有行号和冒号。
*/
//自定义字符输入流的包装类  
class MyLineNumberReader  
{  
	private Reader r;  
	private int count;    
	MyLineNumberReader(Reader r)  
	{  
		this.r = r;  
	}  
	//读取一行      
	public String myReadLine() throws IOException  
	{  
		StringBuffer sb = new StringBuffer();  
	        
		int num = 0;  
		count++;  
      
	//当文件不为空时，整行读取
	while ((num = r.read()) != -1)  
	{  
		if (num == '\r')  
			continue;  
		if (num == '\n')  
			return sb.toString();  
		else  
			sb.append((char)num);  
	}
	//防止有数据，但是没有换行标记的数据未被录入
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
			//通过包装类读取标的文件
            mlnr = new MyLineNumberReader(new FileReader("C:\\Users\\David\\Desktop\\Test6.java"));  
              
            String len = null;  
            
			//给读取的每行加上行号和冒号
            while ((len = mlnr.myReadLine()) != null)  
            {  
                System.out.println(mlnr.getCount()+":\t"+len);  
            }  
        }  
        catch (IOException e)  
        {  
            System.out.println("读取出错！");  
        } 
		//关闭资源
        finally  
        {  
            try  
            {  
                if(mlnr != null)  
                    mlnr.myclose();  
            }  
            catch (IOException e)  
            {  
                System.out.println("关闭出错");  
            }  
        }  
    }  
}  