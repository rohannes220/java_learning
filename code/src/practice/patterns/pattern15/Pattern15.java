package practice.patterns.pattern15;

public class Pattern15 {
    public static void main(String[] args) {
        int n =5; 
        int product = 1;
        
        for(int i =1; i<=n-1; i++){
            System.out.print(' ');
        }
        System.out.println(1);
        for(int i =1; i<=4;i++){
            product = product * 11;
            System.out.println(product);
        }

        

    }
    
}
