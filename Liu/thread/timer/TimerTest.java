package timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ������ָ����ʱ��ɾ�����ǵ�ָ��Ŀ¼(�����ָ��c�̣������Ҳ����飬��ʹ����Ŀ·���µ�demo)
 * F:\Demo
 *	������
 *		��ʱɾ����Ҫ�½�������ʵ��TimerTask
 *		���������и�дrun������run�����е���ɾ������
 *		ɾ���������õݹ��жϣ����ļ��м������ñ�������ɾ��
 *		main�����н���Timer���󣬽������мƻ�����������ʱ��
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
		//�ж��ļ��Ƿ�������
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