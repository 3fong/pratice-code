package dao;

import java.util.ArrayList;
import base.User;

/**
 * ��д��¼ע�᷽��
 * @author David
 *@version V1.1
 */
public class UserDaoImpl implements UserDao {
	//�����϶���Ϊ��Ա�������������з����������뾲̬�������Ա����
	private static ArrayList<User> al = new ArrayList<User>();
	//��дע�᷽��
	public void regist(User user){			
		//��userװ������
		if(user!=null)
			al.add(user);
	}
	public boolean enter(String name,String password){
		//�������ϣ���ȡÿһ���û������ж��û��Ƿ�ע��
		boolean flag = false;
		for(User u : al){
			if(u.getName().equals(name)&&u.getPassword().equals(password)){
				flag=true;
				break;
			}
		}		
		return flag;
	}
}
