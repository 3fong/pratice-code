package newFeatures;
/*
 *
 */
public class EnumDemo {

	public static void main(String[] args) {
		DirectionEnum de = DirectionEnum.FRONT;
		System.out.println(de);//FRONT
		System.out.println("-------------");
		
		DirectionEnum1 de1 = DirectionEnum1.BEHIND;
		System.out.println(de1);
		System.out.println(de1.getName());
		System.out.println("-------------");
		
		DirectionEnum2 de2 = DirectionEnum2.LEFT;
		System.out.println(de2);
		System.out.println(de2.getName());
		de2.show();
		
		//枚举与switch的使用
		switch(de2){
		case FRONT:
			System.out.println("你选择了前");
			break;
		case BEHIND:
			System.out.println("你选择了后");
			break;
		case LEFT:
			System.out.println("你选择了左");
			break;
		case RIGHT:
			System.out.println("你选择了右");
			break;
		}
	}

}
