package test33;
/*
 *10、 28人买可乐喝，3个可乐瓶盖可以换一瓶可乐，那么要买多少瓶可乐，
 * 够28人喝？假如是50人，又需要买多少瓶可乐？
 	（需写出分析思路）
 	分析：
 		有三个值，人数、可乐数、瓶盖，它们的关系：1人=1可乐；3盖=1可乐；
 		问最少买多少够喝？
 		转换：有三个变量 person、cole、cat
		如果可乐少就买，同时，3cat=1cole;可以通过while循环，结束条件cole>=person
 */
public class T9BuyColeDemo {

	public static void main(String[] args) {
		int cole = 0;
		int cap = 0;
		int person = 28;
		int buy=0;
		while(cole<person){			
			buy++;
			cap++;
			cole++;			
			if(cap==3){
				cole++;
				cap=1;
			}
		}
		System.out.println(buy);
	}
}
