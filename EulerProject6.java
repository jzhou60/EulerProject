
public class EulerProject6 {
	public static void main(String args[]){
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= 100; i++){
			sum1 += i;
			sum2 += i * i;
			
		}
		System.out.println(sum1 * sum1 - sum2);
	}
}
