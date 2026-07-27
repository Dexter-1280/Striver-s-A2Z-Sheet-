import java.util.*;

 class Palidrome {
      static boolean isPalidrome(int x){
        int rev=0;
          int originalNum=x;
        if(x<0) return false;
        while(x!=0){
      
       int num=x%10;
        x=x/10;
        rev=rev*10+num;
        }
        return rev==originalNum ;
        }
        
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter your value:");
      isPalidrome(x);
      sc.close();
    }
}
