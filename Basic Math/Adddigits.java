import java.util.*;
class AddDigits {
    

    static int addDigits(int num) {
      while(num>=10){
       int  sum=0;
         while(num>0){
           sum+=num%10;
           num/=10;
        }
        num=sum;
      }  
       
        return num;
    }
    public static void main(String arg[]){
 


    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.println(addDigits(num));
}
}