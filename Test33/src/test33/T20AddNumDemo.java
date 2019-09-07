package test33;
/*
 *����һ���������飬�������̣߳������̷ֱ߳��һ��ʱ��(����дһ�������)����������������ݣ�
	ÿһ���߳�Ϊ�������3�����ݼ��ɡ�
 */
class AddNum implements Runnable{
	int[] arr=new int[3];
	public void run(){
		try {
			synchronized(arr){
				for(int x=0;x<3;x++){
					Thread.sleep(300);
					int num = (int)(Math.random()*10+1);		
					arr[x]=num;
					System.out.print(Thread.currentThread().getName()+":"+arr[x]+" ");
					System.out.println();
				}
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
public class T20AddNumDemo {

	public static void main(String[] args) {
		AddNum an = new AddNum();
		
		Thread t1 = new Thread(an);
		Thread t2 = new Thread(an);
		t1.start();
		t2.start();
				
	}
}
