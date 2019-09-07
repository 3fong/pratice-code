package timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 需求：在指定的时间删除我们的指定目录(你可以指定c盘，但是我不建议，我使用项目路径下的demo)
 * F:\Demo
 *	分析：
 *		定时删除，要新建任务类实现TimerTask
 *		在任务类中复写run方法，run方法中调用删除方法
 *		删除方法，用递归判断，是文件夹继续调用本身，不是删除
 *		main方法中建立Timer对象，建立运行计划表，定义运行时间
 */
public class TimerTest {

	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		String s = "2015-12-7 10:47:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		t.schedule(new TimerDel(),d);
	}
}
class TimerDel extends TimerTask{
	@Override
	public void run() {
		File file = new File("F:\\demo");
		delFold(file);
	}
	private void delFold(File file) {		
		File[] files = file.listFiles();
		//判断文件是否有内容
		if(files!=null){
			for(File f : files){
				if(f.isDirectory()){
					delFold(f);
				}else{
					System.out.println(f.getName()+":"+f.delete());
				}
				System.out.println(file.getName()+"----"+file.delete());
			}
		}
	}	
}