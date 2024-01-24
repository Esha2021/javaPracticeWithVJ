public class DisplayEven {
    public static void main(String args[]) {
        int n = 10;
        int sum=0;
        System.out.println("Even numbers is ");
        for(int i=1;i<=10;i++)
        {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("sum of Even number" +sum);
    }
}




