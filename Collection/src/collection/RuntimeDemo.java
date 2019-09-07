package collection;

public class RuntimeDemo {

	public static void main(String[] args)throws Exception {

		Runtime r = Runtime.getRuntime();
		Process p = r.exec("D:\\Bin\\QQScLauncher.exe");
		
		Thread.sleep(4000);
		p.destroy();
	}

}
