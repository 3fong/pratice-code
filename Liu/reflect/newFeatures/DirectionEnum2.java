package newFeatures;
/*
 *ö����Ҳ�����г��󷽷�������ö���������д�÷���
 */
public enum DirectionEnum2 {
	FRONT("ǰ") {
		@Override
		public void show() {
			System.out.println("ǰ");
		}
	},BEHIND("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	},LEFT("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	},RIGHT("��") {
		@Override
		public void show() {
			System.out.println("��");
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

