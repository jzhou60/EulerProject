
public class EulerProject3 {
	public static void main(String args[]){
		long x = 600851475143l;
		int i;
        for (i = 2; i <= x; i++){
        	if(x % i == 0) {
        		x /= i;
                }
            }
        i = i - 1;
        System.out.println("The largest prime factor of 600851475143 is: " +i);
        }
}

