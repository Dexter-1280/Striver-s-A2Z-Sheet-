public class Pattern3 {
    public static void main(String args[]){
        for (int i=1;i<=6;i++){
            int count=1;
            for(int j=1;j<=i-1;j++){
               System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
