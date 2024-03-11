import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void sortingUsingPointer(int[] arr){

        int index1=0;
        int index2=0;
       for(int i=0;i<arr.length;i++) {

           if (arr[i] > index1) {

               index2 = index1;
               index1=arr[i];
           } else if (arr[i] > index2) {
               index2 = arr[i];
           }
       }
        System.out.println(index2);


}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] inputArray = Arrays.stream(input.split(",")).
                mapToInt(element -> Integer.parseInt(element)).
                toArray();
       for(int j=0;j<inputArray.length;j++) {
           for (int i = j+1; i < inputArray.length; i++) {
               int tmp = 0;
               if (inputArray[i] <= inputArray[j]) {
                   tmp = inputArray[i];
                   inputArray[i] = inputArray[j];
                   inputArray[j] = tmp;
               }

           }
          // System.out.println(inputArray[j]);
       }
        sortingUsingPointer(inputArray);

    }
}
