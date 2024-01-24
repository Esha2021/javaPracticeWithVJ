import java.util.Scanner;

public class CountUppercase {
    public static void main(String[] args)
    {

        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        char[] count=word.toCharArray();
        int sum=0;
        for(int i=0;i<count.length;i++)
        {
            if(Character.isUpperCase(count[i]))
            {
                sum++;
            }
        }
        System.out.println(sum);



    }

}




