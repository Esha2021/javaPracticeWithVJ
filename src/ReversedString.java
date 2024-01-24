//import java.util.Scanner;

public class ReversedString {


        public static void main(String[] args) {

           // Scanner sc=new Scanner(System.in);
            String A="madam";
            String s1=new String("welcome");
            String  s2=new String("welcome");
            String s3="welcome";
            String s4="welcome";
            /* Enter your code here. Print output to STDOUT. */
            String rev = "";
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            char[] revArray=new char[A.length()];
            for (int i=A.length()-1;i>=0;i--) {

                rev = rev + A.charAt(i);

            }
            System.out.println(rev);
                if (A.equals(rev)) {
                    System.out.println("yes");
                } else {
                    System.out.println("No");
                }
            }

        }



