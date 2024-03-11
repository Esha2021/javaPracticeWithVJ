import java.util.Scanner;

public class SortingString {
    public static void sortingUsingPointer(String[] inputArray) {

        for(int j=0;j<inputArray.length-1;j++) {
            for (int i = j+1; i < inputArray.length; i++) {
                String tmp = "";
                if (inputArray[i].length() <inputArray[j].length()) {
                    tmp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = tmp;
                }

            }

        }
        System.out.println("sorted string array:");
        for(String e:inputArray){
            System.out.println(e);}


    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputArray=input.split(",");
           for(String e:inputArray){
               System.out.println(e);}
                 sortingUsingPointer(inputArray);

    }

}
