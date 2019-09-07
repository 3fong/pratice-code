package newFeatures;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *	二进制字面量：用二进制来表示整数（byte,short,int和long）
	优点：代码更容易理解 格式：0b、0B开头

	数字字面量可以出现下划线 int x = 100_1000;
	注意事项：
		不能出现在进制标识和数值之间
		不能出现在数值开头和结尾
		不能出现在小数点旁边

	switch 语句可以用字符串
	泛型简化
	异常的多个catch合并
	try-with-resources 语句
		格式：try(必须是java.lang.AutoCloseable的子类对象){…}
		好处：
		资源自动释放，不需要close()了
		把需要关闭资源的部分都定义在这里就ok了
		主要是流体系的对象是这个接口的子类(看JDK7的API)
 */
public class newFeature {

	public static void main(String[] args) {
		//二进制字面量
		int x = 0b10010;
		System.out.println(x);
		
		//数字字面量可以出现下划线
		int y = 1_112_110;
		System.out.println(y);
		
		//泛型简化
		ArrayList<String> al = new ArrayList<>();
	}

	public static void show(){
		try{
			FileReader fr = new FileReader("F:\\");
			FileWriter fw = new FileWriter("F:\\");
			
			char[] bys = new char[1024];
			int len=0;
			while((len=fr.read(bys))!=-1){
				fw.write(new String(bys,0,len));
			}
			fr.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	//try-with-resources 语句
	public static void show1(){
		try(FileReader fr = new FileReader("F:\\");
			FileWriter fw = new FileWriter("F:\\");){
			
			char[] bys = new char[1024];
			int len=0;
			while((len=fr.read(bys))!=-1){
				fw.write(new String(bys,0,len));
			}
			fr.close();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
