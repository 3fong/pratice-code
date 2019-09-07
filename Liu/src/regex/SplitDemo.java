package regex;
/*
 *split()
 */
public class SplitDemo {

	public static void main(String[] args) {
		String s = "aa,bb,cc";
		
		String regex = ",";
		String[] st = s.split(regex);
		
		for(int x=0;x<st.length;x++){
			System.out.println(st[x]);
		}
		
		String s1 = "aa.bb.cc";
		
		String regex1 = "\\.";
		String[] st1 = s1.split(regex1);
		
		for(int x=0;x<st1.length;x++){
			System.out.println(st1[x]);
		}
		
		String s2 = "aa  bb       cc";
		
		String regex2 = " +";
		String[] st2 = s2.split(regex2);
		
		for(int x=0;x<st2.length;x++){
			System.out.println(st2[x]);
		}
		
		String s3 = "aa\\bb\\cc";
		
		String regex3 = "\\\\";
		String[] st3 = s3.split(regex3);
		
		for(int x=0;x<st3.length;x++){
			System.out.println(st3[x]);
		}
	}

}
