import java.util.Scanner;
   public class Firstandlastdigit {
       public static void main(String[] args)
       { int a;
         int b;
         int c = 0;
         int d;
         int l;
         int e;

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Number :");
         b = sc.nextInt();
           l = b % 10;
         while (b > 0)  // has to be positive number
         {a = b % 10;
          c = c * 10 + a;
          b = b / 10;}

         d = c % 10;
         e = d + l;

         System.out.println("\nThe Sum of First and Last Digit is :" + e);
       }
   }
