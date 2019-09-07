package ticketSynStatic;
/*
 *a 同步代码块。跟函数一样用来封装代码，它比函数多了一个同步性。
	synchronized(对象)
	{
		需要被同步的代码-->操作共享数据的语句
	}
 *b 同步函数。赋予函数同步性。
	public synchronized void add(){}
      
      同步代码块锁：任意对象
      同步函数：this
      静态同步函数：类字节码文件
 */
public class TikcetRunnableDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t,"贸");
		Thread t2 = new Thread(t,"直门");
		Thread t3 = new Thread(t,"奥林匹克");
		t1.start();
		t2.start();
		t3.start();
	}

}
