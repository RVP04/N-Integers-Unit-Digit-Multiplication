import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	     int[] numbers = new int[n];
	     
	     for(int i=0;i<n;i++)
	        numbers[i] = sc.nextInt();
	     int answer = 0;
	     int unit = 0;
	     for(int i = 0;i<n;i++)
	     {
	         if(i==0)
	         {
	             unit = numbers[n-1]%10;
	         }
	         else
	         {
	             unit = numbers[i-1]%10;
	         }
	         
	         System.out.print(numbers[i]*unit+" ");
	     }

	}
}
