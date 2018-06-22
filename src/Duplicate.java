public class Duplicate {
  public static void main(String[] args)
     {
     int[] Array1 = {11, 12, 15, 15, 17, 17, 13, 12};
     for (int i = 0; i < Array1.length-1; i++)
         {
        for (int j = i+1; j < Array1.length; j++)
            // we add 1 in i of array 1 to check numbers
           {
        if ((Array1[i] == Array1[j]) && (i != j))
              {
        System.out.println("Duplicate Element : "+Array1[j]);
              }
            }
         }
       }
    }

