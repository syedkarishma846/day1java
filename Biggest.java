import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number");
        a=sc.nextInt();
        System.out.println("Enter a number");
        b=sc.nextInt();
        System.out.println("Enter a number");
        c=sc.nextInt();
        System.out.println("Enter a number");
        if(a>b && a>c) {
            System.out.println("A is big");
        }    
        if(a<b && a>c) {
            System.out.println("A is small");
        }    
        if(b>a  && b>c) {
            System.out.println("B is Big");
        }
        if(b<a  && b<c) {
            System.out.println("B is small");
        if(c>b && c>a) { 
            System.out.println("C is Big");
        }
        if(c<b && c<a) {
            System.out.println("C is small");
        }    

        }    


    }
    
}
