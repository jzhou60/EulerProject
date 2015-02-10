
public class EulerProject1 {
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9.
	 * The sum of these multiple is 23. Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public static void main(String args[]){
		int sum = 0;
		int num = 0;
		while ( num < 999 ){
			num = num + 1;
			if ( num % 3 == 0 || num % 5 == 0)
				sum = sum + num;
		}
		System.out.println( "The sum is: " +sum );
	}

}
