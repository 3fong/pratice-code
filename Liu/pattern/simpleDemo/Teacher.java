package simpleDemo;
/*
 *����ʽ
 */
public class Teacher {
	private Teacher(){}
	private static Teacher t = new Teacher();
	public static Teacher getTeacher(){
		return t;
	}
}
