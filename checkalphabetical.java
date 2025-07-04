import java.util.*;
public class Checkalphabetical
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char first=sc.next().charAt(0);
	char second=sc.next().charAt(0);
	char alpha;
	
	if(first<second){
	    System.out.print(first+","+second);
	}
	
	 if(first>second){
	    alpha =first;
	    first=second;
	    second=alpha;
	    System.out.print(first+","+second);
	}
	
 }
	
}