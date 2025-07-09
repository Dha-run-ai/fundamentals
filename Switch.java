import java.util.*;
public class Switch{
    public static void main(String[]argus){
    
    Scanner sc=new Scanner(System.in);
    int name=Character.toLowerCase(sc.next().charAt(0));
    
    switch(name){
        case'g':
        System.out.print("Green");
        break;
        
        case'o':
        System.out.print("Orange");
        break;
        
        default:
            System.out.print("Invaild code");
            break;
        
    }
  }
}