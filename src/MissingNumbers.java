import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] numArray = {1, 2, 3,5,6,7,8 ,10,12,13,14,15,17};

       List<Integer> misarray= new ArrayList<>();
        for(int i=0;i<numArray.length;i++) {
            int currentnumber = numArray[i];
            int nextnumber = currentnumber + 1;
           // while (i + 1 <=numArray.length) {
               // if (numArray[i + 1] != nextnumber) {
                    while (i + 1 < numArray.length && numArray[i + 1] != nextnumber) {
                    System.out.println("it is not Seqeuntial");
                    System.out.println("missing number :" + (nextnumber));
                    misarray.add(nextnumber);
                    nextnumber++;
                }

        }
        System.out.println(misarray);
    }
}
