package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 *我有一个猜数字小游戏的程序，请写一个程序实现在测试类中只能用5次，超过5次提示：游戏试玩已结束，请付费。
 *分析：
 *		限定次数，就需要一个计数器，但是普通计数随程序结束，就会重置。
 *		将次数保存在文件中，每次都加载可以解决上面问题，所以用properties
 *		要有判断次数，所以要获取文件中值getProperty
 *		每次使用后要更新次数，用setProperty和store
 */
public class LimitCount {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		//必须先有文件
		Reader r = new FileReader("F:\\count.txt");
		p.load(r);
		//计数器
		String value = p.getProperty("count");
		//将字符串转换成int
		int count = Integer.parseInt(value);
		if(count<=0){
			System.out.println("游戏试玩已结束，请付费。");
			System.exit(0);
		}else{
			count--;
			System.out.println("你还可以使用："+count+"次");
			
			p.setProperty("count",String.valueOf(count));
			Writer w = new FileWriter("F:\\count.txt");
			p.store(w,"计数器");
			w.close();
//			GuessNum.start();
		}

	}
}
