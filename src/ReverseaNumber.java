public class ReverseaNumber
{
    public static void main( String[] args){
        int n=1234;
        int reverse=0;
        int rnumber=0;
        while(n>0){

             reverse =n%10;//1234%10=4//3//2
             rnumber=rnumber*10+reverse;//0*10+4//40+3==43/430+2=432 4320=4321
             n=n/10;//1234/10=123//123/10==12/1

        }
        System.out.println(rnumber);

    }
}
