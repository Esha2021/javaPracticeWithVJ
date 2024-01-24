public class Marks {
    public static void main (String args[]){
       int marks=45;
       if (marks>=70){
           System.out.println("A");

       }else if(marks<70 && marks>=60){
           System.out.println("B");
       }else if(marks<60 && marks>=50){
           System.out.println("c");
       }else {
           System.out.println("Fail");
       }

    }
}
