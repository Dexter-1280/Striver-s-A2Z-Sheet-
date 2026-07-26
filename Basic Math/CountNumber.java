import java.util.*;
public class CountNumber {
   static void countNumber(int num){
      int count=0; 
   while(num>0){
      num=num/10;
    count++;
   }
 System.out.println(count);
   }
 public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your input values:");
int num = sc.nextInt();
countNumber(num);

sc.close();
 }    
}
