package newFeatures;
/*
 *�������в��ܴ����������
 */
public abstract class Direction2 {
	public static final Direction2 FRONT = new Direction2("ǰ"){
		@Override
		public void show() {
			System.out.println("ǰ");
		}		
	};
	public static final Direction2 BEHIND = new Direction2("��"){
		@Override
		public void show() {
			System.out.println("��");
		}		
	};
	public static final Direction2 LEFT = new Direction2("��"){
		@Override
		public void show() {
			System.out.println("��");
		}		
	};
	public static final Direction2 RIGHT = new Direction2("��"){
		@Override
		public void show() {
			System.out.println("��");
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
