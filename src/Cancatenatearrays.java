import java.util.Arrays;
import java.util.Scanner;

public class Cancatenatearrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

       int[] inputArray1 = Arrays.stream(input1.split(",")).
                mapToInt(element -> Integer.parseInt(element)).
                toArray();
       int[] inputArray2= Arrays.stream(input2.split(",")).
                mapToInt(element -> Integer.parseInt(element)).
                toArray();
        int[] inputArray3={1,2,3};
        int[] inputArray4={4,5,7,8,6,9};
        int[] mergedresultarray=new int[inputArray1.length+inputArray2.length];
        int i=0;
        for(int n : inputArray1){
            mergedresultarray[i]=n;
            i++;
        }
        for(int n : inputArray2){
            mergedresultarray[i]=n;
            i++;
        }
        for(int j=0;j<mergedresultarray.length;j++) {
            for (int k = j+1; k< mergedresultarray.length; k++) {
                int tmp = 0;
                if (mergedresultarray[k] <= mergedresultarray[j]) {
                    tmp = mergedresultarray[k];
                    mergedresultarray[k] = mergedresultarray[j];
                    mergedresultarray[j] = tmp;
                }

            }
            System.out.println(mergedresultarray[j]);
        }
        //Arrays.sort(mergedresultarray);
        System.out.println(Arrays.toString(mergedresultarray));

    }
}
