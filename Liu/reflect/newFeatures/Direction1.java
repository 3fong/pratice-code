package newFeatures;
/*
 *
 */
public class Direction1 {
	public static final Direction1 FRONT = new Direction1("ǰ");
	public static final Direction1 BEHIND = new Direction1("��");
	public static final Direction1 LEFT = new Direction1("��");
	public static final Direction1 RIGHT =new Direction1("��");
	private String name;
	private Direction1(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
