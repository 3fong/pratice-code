/**
 * 
 */
package eclipse;

/**
 * @author David
 *
 */
public class StudentDemo {

	/**
	 * œyÔ‡î
	 */
	public static void main(String[] args) {
		Person p = new Student();
				
		Student s = (Student)p;
		s.setName("ˆÈı");
		s.setAge(20);
		System.out.println("ĞÕÃû£º"+s.getName()+",Äêıg£º"+s.getAge());
		p.show();
		s.show1();	
	}

}
