import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class SumofthehighestNo {

     public int numlistsort(int[] numberlist){
         Arrays.sort(numberlist);
         int sum= numberlist[numberlist.length-1]+numberlist[numberlist.length-2];
         System.out.println(sum);
  return sum;
     }
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int[] numberlist={1,6,4,7};
     int max=Integer.MIN_VALUE;
     int secondmax=Integer.MIN_VALUE;
    for(int i=0;i<numberlist.length;i++){
        if(numberlist[i]>max){
            secondmax=max;
            max=numberlist[i];
        }
        else if(numberlist[i]>secondmax){
            secondmax=numberlist[i];

        }

        }
        System.out.println(max+secondmax);
}
    }
