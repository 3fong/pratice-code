package com.liu.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class MyNum implements Comparable<MyNum>{
	private String num;
	MyNum(String num){
		this.num=num;
	}
	public int compareTo(MyNum n){
		return (this.num).compareTo(n.num);		
	}
	public String getNum(){
		return num;
	}
}
class IOTest 
{
	public static void main(String[] args)throws IOException 
	{
		TreeSet<MyNum> ts = readIn();
		writeOut(ts);
		
		List<MyNum> li = new ArrayList<MyNum>();
		for(MyNum m : ts){
			li.add(m);
		}
		Collections.reverse(li);
		
		BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
		for(MyNum m : li){
			bo.write(m.getNum());
			bo.newLine();
			bo.flush();
		}
		bo.close();
	}
	public static TreeSet<MyNum> readIn()throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));	
		
		TreeSet<MyNum> ts = new TreeSet<MyNum>();
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
		String[] str = line.split("\n");
		MyNum m = new MyNum(str[0]);
		ts.add(m);		
		}
		return ts;
	}
	public static void writeOut(TreeSet<MyNum> ts) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("io5.txt"));
		
		for(MyNum m : ts){
			bw.write(m.getNum());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
