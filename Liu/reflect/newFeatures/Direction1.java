package newFeatures;
/*
 *
 */
public class Direction1 {
	public static final Direction1 FRONT = new Direction1("Ç°");
	public static final Direction1 BEHIND = new Direction1("ºó");
	public static final Direction1 LEFT = new Direction1("×ó");
	public static final Direction1 RIGHT =new Direction1("ÓÒ");
	private String name;
	private Direction1(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
