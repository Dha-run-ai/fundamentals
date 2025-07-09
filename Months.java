import java.util.*;
public class Months{
    public static void main(String[]argus){
    
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    
    switch(num){
        case 1:
        System.out.print("January");
        break;
    
        case 2:
        System.out.print("February");
        break;
        
        default:
        System.out.print("Invailed Month");
        break;
    }
  }
}