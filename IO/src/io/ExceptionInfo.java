package io;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionInfo {

	public static void main(String[] args) {
		try{
			int[] arr = new int[2];
			System.out.println(arr[3]);			
		}
		catch(Exception e){
			try{
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s = sdf.format(d);
				PrintStream ps = new PrintStream("F:\\exception.log");
				ps.println(s);
				System.setOut(ps);
			}
			catch(Exception ex){
				throw new RuntimeException("¿‡–Õ≤ª∆•≈‰");
			}
			e.printStackTrace(System.out);
		}
	}
}
