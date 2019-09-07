package newFeatures;
/*
 *枚举类也可以有抽象方法，但是枚举项必须重写该方法
 */
public enum DirectionEnum2 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("前");
		}
	},BEHIND("后") {
		@Override
		public void show() {
			System.out.println("后");
		}
	},LEFT("左") {
		@Override
		public void show() {
			System.out.println("左");
		}
	},RIGHT("右") {
		@Override
		public void show() {
			System.out.println("右");
		}
	};
	private String name;

	private DirectionEnum2(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract void show();
}

