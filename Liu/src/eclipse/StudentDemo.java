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
	 * �yԇ�
	 */
	public static void main(String[] args) {
		Person p = new Student();
				
		Student s = (Student)p;
		s.setName("����");
		s.setAge(20);
		System.out.println("������"+s.getName()+",���g��"+s.getAge());
		p.show();
		s.show1();	
	}

}
