import java.util.Arrays;
import java.util.Scanner;

public class MergingTwoArrays {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr1 = input.split("");
        String input2 = scanner.nextLine();
        String[] inputArr2 =input2.split("");
        System.out.println(String.join(",",inputArr1));
        int n1=inputArr1.length;
        int n2=inputArr2.length;
        String[] inputArr3 =new String[n1+n2];
        int len= inputArr1.length+inputArr2.length;
        String[] mergedArray = new String[len];
int j;
        int index1=0;
        int index2=0;
        j=0;
        while(index1+index2<len)
        {
            if(index1>index2)
            {
                mergedArray[j]=inputArr2[index2];
                j+=1;
                index2++;
            }
            else
            {
                mergedArray[j]=inputArr1[index1];
                j+=1;
                index1++;
            }

        }

        System.out.println(String.join(",",mergedArray));
    }



}


