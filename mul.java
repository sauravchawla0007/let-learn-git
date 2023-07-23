import java.util.Scanner;

public class mul {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a");
        int a =  s.nextInt() ;
        System.out.println("enter b");
        int b =  s.nextInt() ;
        int c = a-b;
        System.out.println(c);    
        s.close();
    }
}
