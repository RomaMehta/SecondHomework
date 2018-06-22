import java.util.Arrays;
public class Alphaandumsort {
    public static void main(String[] args) {
        int [] array1 = { 700,200,100,400,600,800,500,900,300,1000};
        String [] array2 = {"Adelaide",  "Denmark","CapeTown", "Bombay","Ethopia", "Frankfurt"};
        System.out.println("Original Number Array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Number Array : " + Arrays.toString(array1));

        System.out.println("Original Name Arrays : " + Arrays.toString(array2));
        Arrays.sort (array2);
        System.out.println("Sorted Name Arrays : " + Arrays.toString(array2));
    }
}
