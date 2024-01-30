import java.util.Scanner;

public class RecusiveFunction {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int base=sc.nextInt();
            int exponent=sc.nextInt();

            int res=recursiveFunction(base,exponent);
            System.out.println(res);


        }
        public static int recursiveFunction(int b,int e)
        {
            if(e==0)
            {
                return 1;
            }
            return b*recursiveFunction(b,(e-1));
        }


}

