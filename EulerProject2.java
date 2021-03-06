
public class EulerProject2 {
	/*
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
	 * By starting with 1 and 2, the first 10 terms will be: 1,2,3,5,8,13,21,34,55,89,...
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 */
	public static void main(String args[]){
        int num1=0;
        int num2=1;
        int sum=0;
        int evens=0;
            while (sum<4000000){
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;     
                
                if (sum%2==0){
                System.out.println(sum);
                evens+=sum;
                }
            }
        System.out.println("Sum of the evens under 4 million: " + evens);
		}

}
