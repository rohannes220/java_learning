package practice.patterns.pattern20;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n;i++){
            for(int j=n-i;j<=1;j=n-i-1){
                System.out.print(' ');
            }
            for(int j=1;j<i;j++){
                System.out.print(i);
            }
            for(int k=n-1;n<=1;k++){
                System.out.print(k);
            }
            System.out.println();
        }


    }
}
