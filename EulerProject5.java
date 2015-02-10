
public class EulerProject5 {
	public static void main(String args[]){
		long num = 21;
		while (1==1)
		{
		    boolean all = true;
		    for (int i = 1; i < 21; i++)
		    {
		        all = true;
		        if ( num % i != 0 )
		        {
		            all = false;
		            break;
		        }
		    }
		    if ( all )
		    {
		        System.out.println( num );
		        System.exit(0);
		    }

		    num++;
		}
	}

}
