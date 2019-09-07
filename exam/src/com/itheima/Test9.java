package com.itheima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 9�� ʹ��TCPЭ��дһ�������ϴ��ļ��ķ������Ϳͻ��ˡ�
 */

public class Test9
{
    public static void main(String[] args) 
	{

	}
}
//�ͻ���
class Client
{
	public static void main(String[] args) throws Exception
	{
		//����Socket����
		Socket s = new Socket("127.0.0.1",10006);

		//��ȡ����ļ��������뻺����
		BufferedReader bufr = 
			new BufferedReader(new FileReader("server1.txt"));

		//��ȡ�ͻ��������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		String line = null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}
		//�رտͻ��˵���������൱�ڸ����м���һ���������-1��
		s.shutdownOutput();

		//��ȡ�ӷ���˷�������Ϣ
		BufferedReader bufIn =
			new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = bufIn.readLine();
		System.out.println(str);

		//�ر���Դ
		bufr.close();
		s.close();
	}
}

//�����
class Server 
{
	public static void main(String[] args) throws Exception 
	{
		//���������Socket
		ServerSocket ss = new ServerSocket(10006);
		//���տͻ���Socket
		Socket s = ss.accept();

        //��ӡ������Ϣ 
        String ip = s.getInetAddress().getHostAddress();  
        System.out.println(ip + "...conncected"); 
		
		//��ȡ����������
		BufferedReader bufIn = 
			new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//ʵ����Ӧ�ȴ����ļ������Է��㽨���ļ��ͷ���ռ䡣ͬʱ�����ж��ļ��Ƿ���ڣ���Ҫ��֤Ψһ�ԡ�
		PrintWriter out = new PrintWriter(new FileWriter("server2.txt"),true);

		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			out.println(line);		
		}

		//���ͻ��˷�����Ϣ
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("�ϴ��ɹ���");

		out.close();
		s.close();
		ss.close();
	}
}