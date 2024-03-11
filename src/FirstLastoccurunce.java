import java.util.Arrays;
import java.util.Scanner;

public class FirstLastoccurunce {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        int[] inputArray = Arrays.stream(input.split(",")).
                        mapToInt(element -> Integer.parseInt(element)).
                        toArray();
        int giveninput=scanner.nextInt();
        int first=-1;
        int last=-1;
        for(int i=0;i<inputArray.length;i++){
            if(giveninput==inputArray[i]){
                if(first==-1) {
                   // System.out.println(i);
                    first=i;
                }
                last=i;
            }

        }
        System.out.println("first occurence " + first);
        System.out.println("last occurnce"+ last);
    }
}
