import java.util.Scanner;
class Reversenum
{
    public static void main(String args[])
    {
        int num=0;
        int rnum =0;
        System.out.println("Enter the number to be reversed:  ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();
        //While Loop: Logic to find out the reverse number
        while( num != 0 )
        {
            rnum = rnum * 10;
            rnum = rnum + num%10;
            num = num/10;
        }

        System.out.println("Reverse number = "+rnum);
    }
}