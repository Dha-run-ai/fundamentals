import java.util.*;
public class Checkoddoreven
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num=sc.nextInt();
	    
	    if(num%2!=0){
	        System.out.print("Odd number");
	    }
	    else{
	        System.out.print("Even number");
	    }
	    
	
}
}