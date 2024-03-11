import java.util.Scanner;

public class Validatephnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String phnumber= sc.nextLine();
        String ph1="61248567861";
        if(ph1.matches("[0-9]{10}")){
            System.out.println("valid");
        }
        System.out.println("Not valid");
    }
}
