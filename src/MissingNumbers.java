import java.lang.reflect.Array;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = {1, 2, 3,5,6,7,8};
        for(int i=0;i<=numArray.length;i++){

            if(numArray[i]!=i+1)
            {

                System.out.println("it is not Seqeuntial");
                System.out.println("missing number :"+(i+1));
                break;

            }


            //System.out.println("Missing number"+ i);
        }
    }
}
