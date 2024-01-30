import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str1="A man,";
        str1=str1.toLowerCase().replaceAll("[^a-z0-9\\\\s+]","");
        System.out.println(str1);
        String reverseStr="";

        char[] revArray=new char[str.length()];
        for (int i=str1.length()-1;i>=0;i--) {
            reverseStr= reverseStr + str1.charAt(i);
        }
        System.out.println(reverseStr);
        if(reverseStr.equals(str1)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
}
}
