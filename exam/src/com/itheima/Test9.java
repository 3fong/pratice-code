package com.itheima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 9、 使用TCP协议写一个可以上传文件的服务器和客户端。
 */

public class Test9
{
    public static void main(String[] args) 
	{

	}
}
//客户端
class Client
{
	public static void main(String[] args) throws Exception
	{
		//建立Socket服务
		Socket s = new Socket("127.0.0.1",10006);

		//读取标的文件，并存入缓冲区
		BufferedReader bufr = 
			new BufferedReader(new FileReader("server1.txt"));

		//获取客户端输出流
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		String line = null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}
		//关闭客户端的输出流。相当于给流中加入一个结束标记-1。
		s.shutdownOutput();

		//获取从服务端反馈的信息
		BufferedReader bufIn =
			new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = bufIn.readLine();
		System.out.println(str);

		//关闭资源
		bufr.close();
		s.close();
	}
}

//服务端
class Server 
{
	public static void main(String[] args) throws Exception 
	{
		//建立服务端Socket
		ServerSocket ss = new ServerSocket(10006);
		//接收客户端Socket
		Socket s = ss.accept();

        //打印连接信息 
        String ip = s.getInetAddress().getHostAddress();  
        System.out.println(ip + "...conncected"); 
		
		//获取网络输入流
		BufferedReader bufIn = 
			new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//实操中应先传输文件名，以方便建立文件和分配空间。同时还有判断文件是否存在，并要保证唯一性。
		PrintWriter out = new PrintWriter(new FileWriter("server2.txt"),true);

		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			out.println(line);		
		}

		//给客户端反馈信息
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("上传成功！");

		out.close();
		s.close();
		ss.close();
	}
}