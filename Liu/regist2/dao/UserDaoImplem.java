package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import base.User2;

/*
 *实现功能 IO版
 *	注册：输入name password 将信息存入集合，并用输出流存储
 *	登录：读取文件，验证信息是否存在
 */
public class UserDaoImplem implements UserDao2 {	
	public void regist(User2 user){
		PrintWriter pw = null;
		try{
			pw = new PrintWriter(new FileWriter("F:\\a.txt"));
			pw.println(user.getName()+"="+user.getPassword());
		}catch(IOException e){
			System.out.println("输出文件失败");
		}finally{
			if(pw!=null){
				try{
					pw.close();					
				}catch(Exception e){
					System.out.println("文件关闭失败");
				}
			}
		}		
	}
	public boolean entry(String name,String password){
		boolean flag = false;
		BufferedReader br = null;
		try{
			br=new BufferedReader(new FileReader("F:\\a.txt"));
			
			String line = null;
			while((line=br.readLine())!=null){
				String[] str = line.split("=");
				if(name.equals(str[0])&&password.equals(str[1])){
					return true;
				}
			}
		}catch(IOException e){
			System.out.println("读取文件失败");
		}finally{
			if(br!=null){
				try{
					br.close();					
				}catch(Exception e){
					System.out.println("文件关闭失败");
				}
			}
		}
		return flag;
	}
}
