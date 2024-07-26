import java.util.Arrays;

public class Array2 {
public static void main(String[] args) {
     int arr2[] = { 300,60,10,49,69,194,587,24,5,2,4,15,67 };

        for (int i = 0; i < arr2.length; i++) {

            int sum = 0;
                
            for (int j = i + 1; j < arr2.length; j++) {

                sum = sum + arr2[j];

            }

            arr2[i] = sum;

        }
         
         System.out.println(Arrays.toString(arr2));
}
}
