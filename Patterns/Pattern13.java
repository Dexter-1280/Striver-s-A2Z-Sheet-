

public class Pattern13 {
    public static void main(String agr[]){
        int n=6;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print(count);
                count++;
                 }
            System.out.println();
        }
    }
}
