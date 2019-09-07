package collection;

import java.util.Arrays;
import static java.util.Arrays.*;
import static java.lang.System.*;
public class VariableArray {

	public static void main(String[] args) {

		show(1,2,3,4);
		show(1);
		show(5,2);
		
		int[] arr ={3,1,5};
		sort(arr);
		out.println(Arrays.toString(arr));
	}
	public static void show(int... arr){
		
		System.out.println(Arrays.toString(arr));
	}
}
