import java.util.*;

public class Palidrome {
      static boolean isPalidrome(int x){
        int rev=0;
        if(x<0) return false;
        int originalNum=x;
       int num=x%10;
        x=x/10;
        rev=rev*10+num;

        return originalNum==rev ;
        }
        
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter your value:");
      isPalidrome(x);
      sc.close();
    }
}
