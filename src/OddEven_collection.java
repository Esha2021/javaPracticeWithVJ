import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEven_collection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        ArrayList<Integer> number= new ArrayList<Integer>();

            while (sc.hasNextLine()) {
                number.add(sc.nextInt());
                System.out.println(number);
            }
            System.out.println(number);

        }
}
