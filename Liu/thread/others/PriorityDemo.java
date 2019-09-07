package others;
/*
 *优先级：线程执行频率
 *如何获取线程对象的优先级?
 * 		public final int getPriority():返回线程对象的优先级
 * 如何设置线程对象的优先级呢?
 * 		public final void setPriority(int newPriority)：更改线程的优先级。 
 * 
 * 注意：
 * 		线程默认优先级是5。
 * 		线程优先级的范围是：1-10。
 * 		线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
 */
public class PriorityDemo {

	public static void main(String[] args) {
		Dameon d1 = new Dameon("烨");
		Dameon d2 = new Dameon("黄渤");
		Dameon d3 = new Dameon("张靖宇");
		
//		System.out.println(d1.getPriority());//默认优先级是5
		d1.setPriority(10);
		d2.setPriority(1);//优先级范围是1-10
		d1.start();
		d2.start();
		d3.start();
	}
}
