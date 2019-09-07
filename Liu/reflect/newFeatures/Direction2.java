package newFeatures;
/*
 *抽象类中不能创建自身对象
 */
public abstract class Direction2 {
	public static final Direction2 FRONT = new Direction2("前"){
		@Override
		public void show() {
			System.out.println("前");
		}		
	};
	public static final Direction2 BEHIND = new Direction2("后"){
		@Override
		public void show() {
			System.out.println("后");
		}		
	};
	public static final Direction2 LEFT = new Direction2("左"){
		@Override
		public void show() {
			System.out.println("左");
		}		
	};
	public static final Direction2 RIGHT = new Direction2("右"){
		@Override
		public void show() {
			System.out.println("右");
		}		
	};
	private String name;
	private Direction2(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract void show();
}
