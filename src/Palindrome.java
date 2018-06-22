import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        int r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        {System.out.println("Enter the number to be checked : ");}

        int n=sc.nextInt();//It is the number variable to be checked for palindrome


        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Is a Palindrome number ");
        else
            System.out.println("Is not a Palindrome number ");
    }
}
