import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int arr[] = {2,42,324,356,45,687,54,2,323,456,5,4};

         for (int i = 0; i < arr.length; i++) {

             int smallest = arr[i];
             int index = i;

             for (int j = i + 1; j < arr.length; j++) {

                 if (arr[j] < smallest) {
                     smallest = arr[j];
                     index = j;
                 }
             }

             arr[i] = index;
         }
         
         System.out.println(Arrays.toString(arr));
       

    }
}