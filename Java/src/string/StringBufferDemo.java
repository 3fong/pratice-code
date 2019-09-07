package string;
/*
 *StringBuffer：是字符串缓冲区，用于存储数据的容器。 
二、特点
1、长度可变化； 
2、可以存储不同类型数据； 
3、最终要转成字符串才能使用。
三、优点
StringBuffer可对字符串修改；string类一旦建立无法修改。
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer的获取方法和字符串一样
		StringBuffer sb = new StringBuffer();
		meAdd(sb);
		meDel(sb);
		meUpdate(sb);
		sop("--"+sb);
	}
	//StringBuffer append(data):将指定数据作为参数添加到已有数据结尾处。
	//StringBuffer insert(index,data)：可以将数据插入到指定index位置。
	public static void meAdd(StringBuffer sb){
		StringBuffer sb1 = sb.append(123);	
		sb.append("abc").append(12).append(true);
		sop("sb1:"+sb1+",sb:"+sb);
		
		sb.insert(5,"qq");
		sop(sb);
	}
	public static void meDel(StringBuffer sb){
		//StringBuffer delete(int start,int end):删除缓冲区中的数据，含头不含尾。
		sb.delete(1,3);
		//StringBuffer deleteCharAt(int index):删除指定位置的字符。
		sb.deleteCharAt(5);
	}
	public static void meUpdate(StringBuffer sb){
		//StringBuffer replace(int start,int end,String str);
		sb.replace(2,5,"$");
		//void setCharAt(int index,char ch);
		sb.setCharAt(4,'*');
		//StringBuffer reverse();
		sb.reverse();
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
