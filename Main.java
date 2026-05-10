import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the 1st  number");
        int a = sc.nextInt();
        
        System.out.println("Enter the 2nd  number");
        int b = sc.nextInt();
        
        System.out.println("Enter the 3rd  number");
        int c = sc.nextInt();
        
        int biggest;
        if(a>b && a>c){
            biggest = a;
        }
        else if(b>a && b>c){
            biggest = b;
        }
        else{
            biggest = c;
        }
        System.out.println("biggest number :"+ biggest);
        
    }
}