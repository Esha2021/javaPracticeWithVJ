import java.util.Scanner;

public class SubstringSearch {

    //    public String subString( String str){
//        if(str.in)
//     return str;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String substr = sc.next();
        int count=0;
        int intexcount=0;
        while((intexcount=str.indexOf(substr,intexcount))!=-1){
            System.out.println(intexcount);
            count++;
            intexcount += substr.length();;
        }

        System.out.println(count);

    }
}
