package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import base.User2;

/*
 *ʵ�ֹ��� IO��
 *	ע�᣺����name password ����Ϣ���뼯�ϣ�����������洢
 *	��¼����ȡ�ļ�����֤��Ϣ�Ƿ����
 */
public class UserDaoImplem implements UserDao2 {	
	public void regist(User2 user){
		PrintWriter pw = null;
		try{
			pw = new PrintWriter(new FileWriter("F:\\a.txt"));
			pw.println(user.getName()+"="+user.getPassword());
		}catch(IOException e){
			System.out.println("����ļ�ʧ��");
		}finally{
			if(pw!=null){
				try{
					pw.close();					
				}catch(Exception e){
					System.out.println("�ļ��ر�ʧ��");
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
			System.out.println("��ȡ�ļ�ʧ��");
		}finally{
			if(br!=null){
				try{
					br.close();					
				}catch(Exception e){
					System.out.println("�ļ��ر�ʧ��");
				}
			}
		}
		return flag;
	}
}
