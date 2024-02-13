import java.util.Scanner;

public class Area {
     public static int rectangle(int l, int b){
         return l*b;
     }
    public static double circle(double r){
        return 3.14*r*r;
    }
    public double square(double a){
         return a*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breath of rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(rectangle(l,b));
        System.out.println("Enter radius");
        double r=sc.nextDouble();
        System.out.println(circle(r));
    }
}
