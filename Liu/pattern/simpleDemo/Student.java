package simpleDemo;
/*
 *
 */
public class Student {	
	private Student(){}
	private static Student s=null;
	public static Student getStudent(){
		if(s==null){
			s = new Student();			
		}
		return s;
	}
}
